package com.example.yourrem;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.yourrem.adapters.Adapter;
import com.example.yourrem.modelos.Coche;
import com.muddzdev.styleabletoast.StyleableToast;
import java.util.List;

public class RegistroUsuarios extends AppCompatActivity {


    RecyclerView rv;
    TextView Usuario;
    List<Coche>coches;
    Adapter adapter;
    final Context context = this;
    Button agregar;
    CardView eliminar, añadir, actualizar;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_usuarios);
        Usuario=(TextView)findViewById(R.id.textView145);
        //rv=findViewById(R.id.recycler);

        String email =getIntent().getExtras().getString("email");
        Usuario.setText("Usuario : "+ email);
        eliminar=(CardView)findViewById(R.id.delete);
        añadir=(CardView)findViewById(R.id.cardView8);
        //actualizar=(CardView)findViewById(R.id.actualizar);
        //Eventos
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroUsuarios.this, EliminarEventos.class);
                startActivity(intent);
            }
        });
        añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(RegistroUsuarios.this,AgregarEventos.class);
                startActivity(intent);
            }
        });



        //coches= new ArrayList<>();

        //FirebaseDatabase database = FirebaseDatabase.getInstance();

        /*adapter=new Adapter(coches);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);*/

        /*database.getReference().getRoot().addValueEventListener(new ValueEventListener() {
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
        });*/

        /*agregar=(Button)findViewById(R.id.agregar);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistroUsuarios.this, AgregarEventos.class);
                startActivity(intent);
            }
        });*/
    }
    public void onPause(){
        super.onPause();
    }
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("¿Estas seguro de salir?");

        alertDialogBuilder.setMessage("Presiona Sí para confirmar.                  Por seguridad, deberás de ingresar tu cuenta la proxima vez que quieras ingresar.").setCancelable(false)
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(RegistroUsuarios.this, Logion.class);
                        startActivity(intent);
                        finish();
                        StyleableToast.makeText(context,"Sesión Cerrada",Toast.LENGTH_SHORT, R.style.error).show();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }





}