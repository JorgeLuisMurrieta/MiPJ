package com.example.yourrem;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.yourrem.adapters.Adapter;
import com.example.yourrem.modelos.Coche;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class EliminarEventos extends AppCompatActivity {
    RecyclerView rv;
    Button borrar;
    EditText texto;
    List<Coche> coches;
    Adapter adapter;
    final Context context = this;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminareventos);
        rv = findViewById(R.id.recycler1);
        borrar=(Button)findViewById(R.id.eliminar);
        texto=(EditText)findViewById(R.id.codigo);

        coches= new ArrayList<>();

        final FirebaseDatabase database = FirebaseDatabase.getInstance();

        adapter=new Adapter(coches);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Seleccion: "+coches.get
                        (rv.getChildAdapterPosition(v)).getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        database.getReference().getRoot().child("Eventos").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                coches.removeAll(coches);
                for (DataSnapshot snapshot:
                        dataSnapshot.getChildren()) {
                    Coche coche = snapshot.getValue(Coche.class);
                    coches.add(coche);
                }
                adapter.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor=texto.getText().toString();
                database.getReference().getRoot().child("Eventos").child(valor).removeValue();
                texto.setText("");

            }
        });

    }

}
