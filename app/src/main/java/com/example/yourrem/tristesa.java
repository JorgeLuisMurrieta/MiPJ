package com.example.yourrem;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tristesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tristesa);

        final Button ellas=(Button)findViewById(R.id.ellas);
        final Button ellos=(Button)findViewById(R.id.ellos);

        ellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tristesa.this, ellas.class);
                startActivity(intent);
            }
        });
        ellos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tristesa.this, ellos.class);
                startActivity(intent);
            }
        });
    }
}
