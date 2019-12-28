package com.example.yourrem;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Capitulo extends AppCompatActivity {

    TextView mensaje;
    TextView capitulos;
    Button enviar;
    String Capitulo;
    int libro2;
    int seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulo);

        enviar=(Button)findViewById(R.id.enviar);
        capitulos=(TextView)findViewById(R.id.Capitulo);
        Spinner combocapitulos=findViewById(R.id.spinner);

        //recibe los datos enviados
        Bundle miBundle=this.getIntent().getExtras();
        int libro = miBundle.getInt("Libro");

        final int libro3=libro;


        switch (libro){
            case 1:
                ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.genesis,R.layout.spinner);
                combocapitulos.setAdapter(adapter);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 2:
                ArrayAdapter<CharSequence>adapter2=ArrayAdapter.createFromResource(this, R.array.exodo,R.layout.spinner);
                combocapitulos.setAdapter(adapter2);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 3:
                ArrayAdapter<CharSequence>adapter3=ArrayAdapter.createFromResource(this, R.array.levitico,R.layout.spinner);
                combocapitulos.setAdapter(adapter3);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 4:
                ArrayAdapter<CharSequence>adapter4=ArrayAdapter.createFromResource(this, R.array.numeros,R.layout.spinner);
                combocapitulos.setAdapter(adapter4);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 5:
                ArrayAdapter<CharSequence>adapter5=ArrayAdapter.createFromResource(this, R.array.deuteronomios,R.layout.spinner);
                combocapitulos.setAdapter(adapter5);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 6:
                ArrayAdapter<CharSequence>adapter6=ArrayAdapter.createFromResource(this, R.array.josue,R.layout.spinner);
                combocapitulos.setAdapter(adapter6);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 7:
                ArrayAdapter<CharSequence>adapter7=ArrayAdapter.createFromResource(this, R.array.jueces,R.layout.spinner);
                combocapitulos.setAdapter(adapter7);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 8:
                ArrayAdapter<CharSequence>adapter8=ArrayAdapter.createFromResource(this, R.array.rut,R.layout.spinner);
                combocapitulos.setAdapter(adapter8);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 9:
                ArrayAdapter<CharSequence>adapter9=ArrayAdapter.createFromResource(this, R.array.Isamuel,R.layout.spinner);
                combocapitulos.setAdapter(adapter9);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 10:
                ArrayAdapter<CharSequence>adapter10=ArrayAdapter.createFromResource(this, R.array.IIsamuel,R.layout.spinner);
                combocapitulos.setAdapter(adapter10);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 11:
                ArrayAdapter<CharSequence>adapter11=ArrayAdapter.createFromResource(this, R.array.Ireyes,R.layout.spinner);
                combocapitulos.setAdapter(adapter11);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 12:
                ArrayAdapter<CharSequence>adapter12=ArrayAdapter.createFromResource(this, R.array.IIreyes,R.layout.spinner);
                combocapitulos.setAdapter(adapter12);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 13:
                ArrayAdapter<CharSequence>adapter13=ArrayAdapter.createFromResource(this, R.array.Icronicas,R.layout.spinner);
                combocapitulos.setAdapter(adapter13);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 14:
                ArrayAdapter<CharSequence>adapter14=ArrayAdapter.createFromResource(this, R.array.IIcronicas,R.layout.spinner);
                combocapitulos.setAdapter(adapter14);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 15:
                ArrayAdapter<CharSequence>adapter15=ArrayAdapter.createFromResource(this, R.array.esdras,R.layout.spinner);
                combocapitulos.setAdapter(adapter15);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 16:
                ArrayAdapter<CharSequence>adapter16=ArrayAdapter.createFromResource(this, R.array.nehemias,R.layout.spinner);
                combocapitulos.setAdapter(adapter16);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 17:
                ArrayAdapter<CharSequence>adapter17=ArrayAdapter.createFromResource(this, R.array.tobias,R.layout.spinner);
                combocapitulos.setAdapter(adapter17);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 18:
                ArrayAdapter<CharSequence>adapter18=ArrayAdapter.createFromResource(this, R.array.judit,R.layout.spinner);
                combocapitulos.setAdapter(adapter18);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 19:
                ArrayAdapter<CharSequence>adapter19=ArrayAdapter.createFromResource(this, R.array.ester,R.layout.spinner);
                combocapitulos.setAdapter(adapter19);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 20:
                ArrayAdapter<CharSequence>adapter20=ArrayAdapter.createFromResource(this, R.array.job,R.layout.spinner);
                combocapitulos.setAdapter(adapter20);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 21:
                ArrayAdapter<CharSequence>adapter21=ArrayAdapter.createFromResource(this, R.array.salmos,R.layout.spinner);
                combocapitulos.setAdapter(adapter21);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 22:
                ArrayAdapter<CharSequence>adapter22=ArrayAdapter.createFromResource(this, R.array.Imacabeos,R.layout.spinner);
                combocapitulos.setAdapter(adapter22);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 23:
                ArrayAdapter<CharSequence>adapter23=ArrayAdapter.createFromResource(this, R.array.IImacabeos,R.layout.spinner);
                combocapitulos.setAdapter(adapter23);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 24:
                ArrayAdapter<CharSequence>adapter24=ArrayAdapter.createFromResource(this, R.array.proverbios,R.layout.spinner);
                combocapitulos.setAdapter(adapter24);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 25:
                ArrayAdapter<CharSequence>adapter25=ArrayAdapter.createFromResource(this, R.array.eclesiastes,R.layout.spinner);
                combocapitulos.setAdapter(adapter25);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 26:
                ArrayAdapter<CharSequence>adapter26=ArrayAdapter.createFromResource(this, R.array.cantar,R.layout.spinner);
                combocapitulos.setAdapter(adapter26);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 27:
                ArrayAdapter<CharSequence>adapter27=ArrayAdapter.createFromResource(this, R.array.sabiduria,R.layout.spinner);
                combocapitulos.setAdapter(adapter27);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 28:
                ArrayAdapter<CharSequence>adapter28=ArrayAdapter.createFromResource(this, R.array.eclesiastico,R.layout.spinner);
                combocapitulos.setAdapter(adapter28);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 29:
                ArrayAdapter<CharSequence>adapter29=ArrayAdapter.createFromResource(this, R.array.isaias,R.layout.spinner);
                combocapitulos.setAdapter(adapter29);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 30:
                ArrayAdapter<CharSequence>adapter30=ArrayAdapter.createFromResource(this, R.array.jeremias,R.layout.spinner);
                combocapitulos.setAdapter(adapter30);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 31:
                ArrayAdapter<CharSequence>adapter31=ArrayAdapter.createFromResource(this, R.array.lementaciones,R.layout.spinner);
                combocapitulos.setAdapter(adapter31);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 32:
                ArrayAdapter<CharSequence>adapter32=ArrayAdapter.createFromResource(this, R.array.baruc,R.layout.spinner);
                combocapitulos.setAdapter(adapter32);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 33:
                ArrayAdapter<CharSequence>adapter33=ArrayAdapter.createFromResource(this, R.array.ezequiel,R.layout.spinner);
                combocapitulos.setAdapter(adapter33);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 34:
                ArrayAdapter<CharSequence>adapter34=ArrayAdapter.createFromResource(this, R.array.daniel,R.layout.spinner);
                combocapitulos.setAdapter(adapter34);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 35:
                ArrayAdapter<CharSequence>adapter35=ArrayAdapter.createFromResource(this, R.array.oseas,R.layout.spinner);
                combocapitulos.setAdapter(adapter35);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 36:
                ArrayAdapter<CharSequence>adapter36=ArrayAdapter.createFromResource(this, R.array.joel,R.layout.spinner);
                combocapitulos.setAdapter(adapter36);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 37:
                ArrayAdapter<CharSequence>adapter37=ArrayAdapter.createFromResource(this, R.array.amos,R.layout.spinner);
                combocapitulos.setAdapter(adapter37);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 38:
                ArrayAdapter<CharSequence>adapter38=ArrayAdapter.createFromResource(this, R.array.abdias,R.layout.spinner);
                combocapitulos.setAdapter(adapter38);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 39:
                ArrayAdapter<CharSequence>adapter39=ArrayAdapter.createFromResource(this, R.array.jonas,R.layout.spinner);
                combocapitulos.setAdapter(adapter39);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 40:
                ArrayAdapter<CharSequence>adapter40=ArrayAdapter.createFromResource(this, R.array.miqueas,R.layout.spinner);
                combocapitulos.setAdapter(adapter40);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 41:
                ArrayAdapter<CharSequence>adapter41=ArrayAdapter.createFromResource(this, R.array.nahun,R.layout.spinner);
                combocapitulos.setAdapter(adapter41);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 42:
                ArrayAdapter<CharSequence>adapter42=ArrayAdapter.createFromResource(this, R.array.habacuc,R.layout.spinner);
                combocapitulos.setAdapter(adapter42);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 43:
                ArrayAdapter<CharSequence>adapter43=ArrayAdapter.createFromResource(this, R.array.sofonias,R.layout.spinner);
                combocapitulos.setAdapter(adapter43);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 44:
                ArrayAdapter<CharSequence>adapter44=ArrayAdapter.createFromResource(this, R.array.ageo,R.layout.spinner);
                combocapitulos.setAdapter(adapter44);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 45:
                ArrayAdapter<CharSequence>adapter45=ArrayAdapter.createFromResource(this, R.array.zacarias,R.layout.spinner);
                combocapitulos.setAdapter(adapter45);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 46:
                ArrayAdapter<CharSequence>adapter46=ArrayAdapter.createFromResource(this, R.array.malaquias,R.layout.spinner);
                combocapitulos.setAdapter(adapter46);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 47:
                ArrayAdapter<CharSequence>adapter47=ArrayAdapter.createFromResource(this, R.array.mateo,R.layout.spinner);
                combocapitulos.setAdapter(adapter47);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 48:
                ArrayAdapter<CharSequence>adapter48=ArrayAdapter.createFromResource(this, R.array.marcos,R.layout.spinner);
                combocapitulos.setAdapter(adapter48);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 49:
                ArrayAdapter<CharSequence>adapter49=ArrayAdapter.createFromResource(this, R.array.lucas,R.layout.spinner);
                combocapitulos.setAdapter(adapter49);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 50:
                ArrayAdapter<CharSequence>adapter50=ArrayAdapter.createFromResource(this, R.array.juan,R.layout.spinner);
                combocapitulos.setAdapter(adapter50);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 51:
                ArrayAdapter<CharSequence>adapter51=ArrayAdapter.createFromResource(this, R.array.hechos,R.layout.spinner);
                combocapitulos.setAdapter(adapter51);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 52:
                ArrayAdapter<CharSequence>adapter52=ArrayAdapter.createFromResource(this, R.array.romanos,R.layout.spinner);
                combocapitulos.setAdapter(adapter52);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 53:
                ArrayAdapter<CharSequence>adapter53=ArrayAdapter.createFromResource(this, R.array.Icorintios,R.layout.spinner);
                combocapitulos.setAdapter(adapter53);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 54:
                ArrayAdapter<CharSequence>adapter54=ArrayAdapter.createFromResource(this, R.array.IIcorintios,R.layout.spinner);
                combocapitulos.setAdapter(adapter54);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 55:
                ArrayAdapter<CharSequence>adapter55=ArrayAdapter.createFromResource(this, R.array.galatas,R.layout.spinner);
                combocapitulos.setAdapter(adapter55);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 56:
                ArrayAdapter<CharSequence>adapter56=ArrayAdapter.createFromResource(this, R.array.efesios,R.layout.spinner);
                combocapitulos.setAdapter(adapter56);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 57:
                ArrayAdapter<CharSequence>adapter57=ArrayAdapter.createFromResource(this, R.array.filipenses,R.layout.spinner);
                combocapitulos.setAdapter(adapter57);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 58:
                ArrayAdapter<CharSequence>adapter58=ArrayAdapter.createFromResource(this, R.array.colosenses,R.layout.spinner);
                combocapitulos.setAdapter(adapter58);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 59:
                ArrayAdapter<CharSequence>adapter59=ArrayAdapter.createFromResource(this, R.array.Itesalonicenses,R.layout.spinner);
                combocapitulos.setAdapter(adapter59);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 60:
                ArrayAdapter<CharSequence>adapter60=ArrayAdapter.createFromResource(this, R.array.IItesalonicenses,R.layout.spinner);
                combocapitulos.setAdapter(adapter60);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 61:
                ArrayAdapter<CharSequence>adapter61=ArrayAdapter.createFromResource(this, R.array.Itimoteo,R.layout.spinner);
                combocapitulos.setAdapter(adapter61);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 62:
                ArrayAdapter<CharSequence>adapter62=ArrayAdapter.createFromResource(this, R.array.IItimoteo,R.layout.spinner);
                combocapitulos.setAdapter(adapter62);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 63:
                ArrayAdapter<CharSequence>adapter63=ArrayAdapter.createFromResource(this, R.array.tito,R.layout.spinner);
                combocapitulos.setAdapter(adapter63);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 64:
                ArrayAdapter<CharSequence>adapter64=ArrayAdapter.createFromResource(this, R.array.filemon,R.layout.spinner);
                combocapitulos.setAdapter(adapter64);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 65:
                ArrayAdapter<CharSequence>adapter65=ArrayAdapter.createFromResource(this, R.array.hebreos,R.layout.spinner);
                combocapitulos.setAdapter(adapter65);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 66:
                ArrayAdapter<CharSequence>adapter66=ArrayAdapter.createFromResource(this, R.array.santiago,R.layout.spinner);
                combocapitulos.setAdapter(adapter66);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 67:
                ArrayAdapter<CharSequence>adapter67=ArrayAdapter.createFromResource(this, R.array.Ipedro,R.layout.spinner);
                combocapitulos.setAdapter(adapter67);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 68:
                ArrayAdapter<CharSequence>adapter68=ArrayAdapter.createFromResource(this, R.array.IIpedro,R.layout.spinner);
                combocapitulos.setAdapter(adapter68);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 69:
                ArrayAdapter<CharSequence>adapter69=ArrayAdapter.createFromResource(this, R.array.Ijuan,R.layout.spinner);
                combocapitulos.setAdapter(adapter69);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 70:
                ArrayAdapter<CharSequence>adapter70=ArrayAdapter.createFromResource(this, R.array.IIjuan,R.layout.spinner);
                combocapitulos.setAdapter(adapter70);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 71:
                ArrayAdapter<CharSequence>adapter71=ArrayAdapter.createFromResource(this, R.array.IIIjuan,R.layout.spinner);
                combocapitulos.setAdapter(adapter71);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 72:
                ArrayAdapter<CharSequence>adapter72=ArrayAdapter.createFromResource(this, R.array.judas,R.layout.spinner);
                combocapitulos.setAdapter(adapter72);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
            case 73:
                ArrayAdapter<CharSequence>adapter73=ArrayAdapter.createFromResource(this, R.array.apocalipsis,R.layout.spinner);
                combocapitulos.setAdapter(adapter73);

                combocapitulos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        capitulos.setText(parent.getItemAtPosition(position).toString());
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                break;
        }
        final int libro2=libro;
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Capitulo.this, Versiculos.class);
                int Capitulo=Integer.parseInt(capitulos.getText().toString());
                Bundle capitulo = new Bundle();
                Bundle libro=new Bundle();

                capitulo.putInt("Capitulo",Capitulo);
                libro.putInt("Libro", libro2);

                intent.putExtras(capitulo);
                intent.putExtras(libro);
                startActivity(intent);

            }
        });

    }
}
