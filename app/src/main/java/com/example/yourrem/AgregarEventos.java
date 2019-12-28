package com.example.yourrem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.yourrem.adapters.Evento;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.muddzdev.styleabletoast.StyleableToast;

public class AgregarEventos extends AppCompatActivity {
    EditText titulo, detalle, fecha, hora;
    Button add;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aeventos);

        titulo=(EditText)findViewById(R.id.EveTitulo);
        detalle=(EditText)findViewById(R.id.EveDetalle);
        fecha=(EditText)findViewById(R.id.EveFecha);
        hora=(EditText)findViewById(R.id.EveHora);
        add=(Button)findViewById(R.id.AddEve);



        inicializarFirebase();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String titulo1=titulo.getText().toString().trim();
                String detalle1=detalle.getText().toString().trim();
                String fecha1=fecha.getText().toString().trim();
                String hora1=hora.getText().toString().trim();
                if(TextUtils.isEmpty(titulo1)){
                    StyleableToast.makeText(getApplicationContext(),"Necesitas ingresar un Título", Toast.LENGTH_LONG, R.style.error).show();
                    return;
                }
                if(TextUtils.isEmpty(detalle1)){
                    StyleableToast.makeText(getApplicationContext(),"Necesitas ingresar el una descripción breve del evento", Toast.LENGTH_LONG, R.style.error).show();
                    return;
                }
                if(TextUtils.isEmpty(hora1)){
                    StyleableToast.makeText(getApplicationContext(),"Necesitas ingresar la hora acordada", Toast.LENGTH_LONG, R.style.error).show();
                    return;
                }
                if(TextUtils.isEmpty(fecha1)){
                    StyleableToast.makeText(getApplicationContext(),"Necesitas ingresar la fecha del evento", Toast.LENGTH_LONG, R.style.error).show();
                    return;
                }
                final String tit=titulo.getText().toString();
                final String det=detalle.getText().toString();
                final String fec=fecha.getText().toString();
                final String hor=hora.getText().toString();
                Evento e = new Evento();
                e.setTitulo(tit);
                e.setDetalle(det);
                e.setFecha(fec);
                e.setHora(hor);
                databaseReference.getRoot().child("Eventos").child(e.getTitulo()).setValue(e);
                detalle.setText("");
                titulo.setText("");
                fecha.setText("");
                hora.setText("");
            }
        });
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

    }
}
