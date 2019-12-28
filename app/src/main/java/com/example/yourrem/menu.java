package com.example.yourrem;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button share=(Button)findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareIt();
            }
        });
        Button eleccion=(Button)findViewById(R.id.eleccion);
        eleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(menu.this, tristesa.class);
                startActivity(intent);
            }
        });
        Button rosario=(Button)findViewById(R.id.rosario);
        rosario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Misterios.class);
                startActivity(intent);
            }
        });
        final Button juego=(Button)findViewById(R.id.juego);
        juego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, juego.class);
                startActivity(intent);
            }
        });
        Button con=(Button)findViewById(R.id.con);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(),"Haz borrado todas las notificaciones",Toast.LENGTH_SHORT, R.style.exampleToast).show();
                NotificationManager notificationManager = ((NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE));
                notificationManager.cancelAll();
                /*Registro.notificacion.setOngoing(false);
                Registro.notificacion.setAutoCancel(true);*/
            }
        });
        Button Agregar=(Button)findViewById(R.id.Agregar);
        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Logion.class);
                startActivity(intent);
            }
        });
    }
    private void shareIt() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "YourRem");
        intent.putExtra(Intent.EXTRA_TEXT, "Download YourRem  http://www.mediafire.com/folder/ssmw6tpp71b6x");
        intent.setType("text/plain");
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}