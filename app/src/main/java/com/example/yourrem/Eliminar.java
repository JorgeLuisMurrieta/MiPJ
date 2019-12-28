package com.example.yourrem;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yourrem.adapters.adapters;
import com.muddzdev.styleabletoast.StyleableToast;

public class Eliminar extends AppCompatActivity {
    private RecyclerView recyclerList;
    private adapters adapters;
    final Context context = this;
    Button btnEliminar;
    EditText codigo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar);

        btnEliminar = (Button)findViewById(R.id.eliminar);
        codigo=(EditText)findViewById(R.id.codigo);

        recyclerList = (RecyclerView)findViewById(R.id.recyclerId);
        recyclerList.setLayoutManager(new LinearLayoutManager(Eliminar.this));


        final BaseDatos baseDatos = new BaseDatos(getApplicationContext());

         adapters adapters = new adapters(baseDatos.mostrar());


        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("¿Estas seguro de eliminar este evento?");
                alertDialogBuilder.setMessage("Presiona Sí para confirmar").setCancelable(false)
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        baseDatos.eliminarRegistro(codigo.getText().toString());
                        Intent intent = new Intent(Eliminar.this, TabbeedActivity.class);
                        startActivity(intent);
                        StyleableToast.makeText(context," Eliminado ",Toast.LENGTH_SHORT, R.style.error).show();
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
        });
        recyclerList.setAdapter(adapters);
    }


}
