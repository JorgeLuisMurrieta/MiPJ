package com.example.yourrem;

import android.app.ProgressDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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

public class EventosPublicos extends AppCompatActivity {


    RecyclerView rv;
    List<Coche>coches;
    Adapter adapter;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventos_publicos);
        rv=findViewById(R.id.recycler2);
        progressDialog=new ProgressDialog(this);

        coches= new ArrayList<>();

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        adapter=new Adapter(coches);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);

        progressDialog.setMessage("Descargando Eventos y Retiros de la Base de Datos...");
        progressDialog.show();

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
                progressDialog.dismiss();
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
}