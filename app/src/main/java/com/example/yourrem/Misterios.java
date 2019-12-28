package com.example.yourrem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Misterios extends AppCompatActivity {
    ImageView icono;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misterio);
        Button gozo=(Button)findViewById(R.id.gozo);
        Button luminoso=(Button)findViewById(R.id.luminoso);
        Button dolor=(Button)findViewById(R.id.dolor);
        Button gloria=(Button)findViewById(R.id.gloria);

        gozo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Misterios.this, Rosario.class);
                intent.putExtra("eleccion", 1);
                startActivity(intent);
            }
        });
        luminoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Misterios.this, Rosario.class);
                intent.putExtra("eleccion", 2);
                startActivity(intent);
            }
        });
        dolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Misterios.this, Rosario.class);
                intent.putExtra("eleccion", 3);
                startActivity(intent);
            }
        });
        gloria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Misterios.this, Rosario.class);
                intent.putExtra("eleccion", 4);
                startActivity(intent);
            }
        });
    }

}
