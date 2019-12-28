package com.example.yourrem;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.yourrem.adapters.adapters;

public class Versiculos extends AppCompatActivity {

    TextView texto, libro2, capitulo2;
    private adapters adapters;

    
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versiculos);
        texto=(TextView)findViewById(R.id.Texto);



        libro2=(TextView)findViewById(R.id.li);
        capitulo2=(TextView)findViewById(R.id.ca);



        Bundle miBundle=this.getIntent().getExtras();

        //Recibe los datos mandados de los activitys anteriores
        int libro = miBundle.getInt("Libro");
        int capitulo=miBundle.getInt("Capitulo");

        switch (libro){
            case 1:
                libro2.setText("Libro: Génesis");
                break;
            case 2:
                libro2.setText("Libro: Exodo");
                break;
            case 3:
                libro2.setText("Libro: Levítico");
                break;
            case 4:
                libro2.setText("Libro: Números");
                break;
            case 5:
                libro2.setText("Libro: Deuteronomio");
                break;
            case 6:
                libro2.setText("Libro: Josué");
                break;
            case 7:
                libro2.setText("Libro: Jueces");
                break;
            case 8:
                libro2.setText("Libro: Rut");
                break;
            case 9:
                libro2.setText("Libro: I Samuel");
                break;
            case 10:
                libro2.setText("Libro: II Samuel");
                break;
            case 11:
                libro2.setText("Libro: I Reyes");
                break;
            case 12:
                libro2.setText("Libro: II Reyes");
                break;
            case 13:
                libro2.setText("Libro: I Crónicas");
                break;
            case 14:
                libro2.setText("Libro: II Cróncas");
                break;
            case 15:
                libro2.setText("Libro: Esdras");
                break;
            case 16:
                libro2.setText("Libro: Nehemías");
                break;
            case 17:
                libro2.setText("Libro: Tobías");
                break;
            case 18:
                libro2.setText("Libro: Judit");
                break;
            case 19:
                libro2.setText("Libro: Ester");
                break;
            case 20:
                libro2.setText("Libro: Job");
                break;
            case 21:
                libro2.setText("Libro: Salmos");
                break;
            case 22:
                libro2.setText("Libro: I Macabeos");
                break;
            case 23:
                libro2.setText("Libro: II Macabeos");
                break;
            case 24:
                libro2.setText("Libro: Proverbios");
                break;
            case 25:
                libro2.setText("Libro: Eclesiastés");
                break;
            case 26:
                libro2.setText("Libro: Cantar");
                break;
            case 27:
                libro2.setText("Libro: Sabiduría");
                break;
            case 28:
                libro2.setText("Libro: Eclesiástico");
                break;
            case 29:
                libro2.setText("Libro: Isaías");
                break;
            case 30:
                libro2.setText("Libro: Jeremías");
                break;
            case 31:
                libro2.setText("Libro: Lamentaciones");
                break;
            case 32:
                libro2.setText("Libro: Baruc");
                break;
            case 33:
                libro2.setText("Libro: Ezequiel");
                break;
            case 34:
                libro2.setText("Libro: Daniel");
                break;
            case 35:
                libro2.setText("Libro: Oseas");
                break;
            case 36:
                libro2.setText("Libro: Joel");
                break;
            case 37:
                libro2.setText("Libro: Amós");
                break;
            case 38:
                libro2.setText("Libro: Abdías");
                break;
            case 39:
                libro2.setText("Libro: Jonás");
                break;
            case 40:
                libro2.setText("Libro: Miqueas");
                break;
            case 41:
                libro2.setText("Libro: Nahún");
                break;
            case 42:
                libro2.setText("Libro: Habacuc");
                break;
            case 43:
                libro2.setText("Libro: Sofonías");
                break;
            case 44:
                libro2.setText("Libro: Ageo");
                break;
            case 45:
                libro2.setText("Libro: Zacarías");
                break;
            case 46:
                libro2.setText("Libro: Malaquías");
                break;
            case 47:
                libro2.setText("Libro: Mateo");
                break;
            case 48:
                libro2.setText("Libro: Marcos");
                break;
            case 49:
                libro2.setText("Libro: Lucas");
                break;
            case 50:
                libro2.setText("Libro: Juan");
                break;
            case 51:
                libro2.setText("Libro: Hechos");
                break;
            case 52:
                libro2.setText("Libro: Romanos");
                break;
            case 53:
                libro2.setText("Libro: I Corintios");
                break;
            case 54:
                libro2.setText("Libro: II Corintios");
                break;
            case 55:
                libro2.setText("Libro: Gálatas");
                break;
            case 56:
                libro2.setText("Libro: Efesios");
                break;
            case 57:
                libro2.setText("Libro: Filipenses");
                break;
            case 58:
                libro2.setText("Libro: Colosenses");
                break;
            case 59:
                libro2.setText("Libro: I Tesalonicenses");
                break;
            case 60:
                libro2.setText("Libro: I Tesalonicenses");
                break;
            case 61:
                libro2.setText("Libro: I Timoteo");
                break;
            case 62:
                libro2.setText("Libro: II Timoteo");
                break;
            case 63:
                libro2.setText("Libro: Tito");
                break;
            case 64:
                libro2.setText("Libro: Filemon");
                break;
            case 65:
                libro2.setText("Libro: Hebreos");
                break;
            case 66:
                libro2.setText("Libro: Santiago");
                break;
            case 67:
                libro2.setText("Libro: I Pedro");
                break;
            case 68:
                libro2.setText("Libro: II Pedro");
                break;
            case 69:
                libro2.setText("Libro: I Juan");
                break;
            case 70:
                libro2.setText("Libro: II Juan");
                break;
            case 71:
                libro2.setText("Libro: III Juan");
                break;
            case 72:
                libro2.setText("Libro: Judas");
                break;
            case 73:
                libro2.setText("Libro: Apocalipsis");
                break;
        }
        capitulo2.setText("Capítulo: "+capitulo);



        switch (libro){
            case 1:
                switch (capitulo){
                    case 1:
                        texto.setText(R.string.genesis1);
                        break;
                    case 2:
                        texto.setText(R.string.genesis2);
                        break;
                    case 3:
                        texto.setText(R.string.genesis3);
                        break;
                    case 4:
                        texto.setText(R.string.genesis4);
                        break;
                    case 5:
                        texto.setText(R.string.genesis5);
                        break;
                    case 6:
                        texto.setText(R.string.genesis6);
                        break;
                    case 7:
                        texto.setText(R.string.genesis7);
                        break;
                    case 8:
                        texto.setText(R.string.genesis8);
                        break;
                    case 9:
                        texto.setText(R.string.genesis9);
                        break;
                    case 10:
                        texto.setText(R.string.genesis10);
                        break;
                    case 11:
                        texto.setText(R.string.genesis11);
                        break;
                    case 12:
                        texto.setText(R.string.genesis12);
                        break;
                    case 13:
                        texto.setText(R.string.genesis13);
                        break;
                    case 14:
                        texto.setText(R.string.genesis14);
                        break;
                    case 15:
                        texto.setText(R.string.genesis15);
                        break;
                    case 16:
                        texto.setText(R.string.genesis16);
                        break;
                    case 17:
                        texto.setText(R.string.genesis17);
                        break;
                    case 18:
                        texto.setText(R.string.genesis18);
                        break;
                    case 19:
                        texto.setText(R.string.genesis19);
                        break;
                    case 20:
                        texto.setText(R.string.genesis20);
                        break;
                    case 21:
                        texto.setText(R.string.genesis21);
                        break;
                    case 22:
                        texto.setText(R.string.genesis22);
                        break;
                    case 23:
                        texto.setText(R.string.genesis23);
                        break;
                    case 24:
                        texto.setText(R.string.genesis24);
                        break;
                    case 25:
                        texto.setText(R.string.genesis25);
                        break;
                    case 26:
                        texto.setText(R.string.genesis26);
                        break;
                    case 27:
                        texto.setText(R.string.genesis27);
                        break;
                    case 28:
                        texto.setText(R.string.genesis28);
                        break;
                    case 29:
                        texto.setText(R.string.genesis29);
                        break;
                    case 30:
                        texto.setText(R.string.genesis30);
                        break;
                    case 31:
                        texto.setText(R.string.genesis31);
                        break;
                    case 32:
                        texto.setText(R.string.genesis32);
                        break;
                    case 33:
                        texto.setText(R.string.genesis33);
                        break;
                    case 34:
                        texto.setText(R.string.genesis34);
                        break;
                    case 35:
                        texto.setText(R.string.genesis35);
                        break;
                    case 36:
                        texto.setText(R.string.genesis36);
                        break;
                    case 37:texto.setText(R.string.genesis37);
                        break;
                    case 38:
                        texto.setText(R.string.genesis38);
                        break;
                    case 39:
                        texto.setText(R.string.genesis39);
                        break;
                    case 40:
                        texto.setText(R.string.genesis40);
                        break;
                    case 41:
                        texto.setText(R.string.genesis41);
                        break;
                    case 42:
                        texto.setText(R.string.genesis42);
                        break;
                    case 43:
                        texto.setText(R.string.genesis43);
                        break;
                    case 44:
                        texto.setText(R.string.genesis44);
                        break;
                    case 45:
                        texto.setText(R.string.genesis45);
                        break;
                    case 46:
                        texto.setText(R.string.genesis46);
                        break;
                    case 47:
                        texto.setText(R.string.genesis47);
                        break;
                    case 48:
                        texto.setText(R.string.genesis48);
                        break;
                    case 49:
                        texto.setText(R.string.genesis49);
                        break;
                    case 50:
                        texto.setText(R.string.genesis50);
                        break;
                }

                break;
            case 2:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.exodo1);
                        break;
                    case 2:
                        texto.setText(R.string.exodo2);
                        break;
                    case 3:
                        texto.setText(R.string.exodo3);
                        break;
                    case 4:
                        texto.setText(R.string.exodo4);
                        break;
                    case 5:
                        texto.setText(R.string.exodo5);
                        break;
                    case 6:
                        texto.setText(R.string.exodo6);
                        break;
                    case 7:
                        texto.setText(R.string.exodo7);
                        break;
                    case 8:
                        texto.setText(R.string.exodo8);
                        break;
                    case 9:
                        texto.setText(R.string.exodo9);
                        break;
                    case 10:
                        texto.setText(R.string.exodo10);
                        break;
                    case 11:
                        texto.setText(R.string.exodo11);
                        break;
                    case 12:
                        texto.setText(R.string.exodo12);
                        break;
                    case 13:
                        texto.setText(R.string.exodo13);
                        break;
                    case 14:
                        texto.setText(R.string.exodo14);
                        break;
                    case 15:
                        texto.setText(R.string.exodo15);
                        break;
                    case 16:
                        texto.setText(R.string.exodo16);
                        break;
                    case 17:
                        texto.setText(R.string.exodo17);
                        break;
                    case 18:
                        texto.setText(R.string.exodo18);
                        break;
                    case 19:
                        texto.setText(R.string.exodo19);
                        break;
                    case 20:
                        texto.setText(R.string.exodo20);
                        break;
                    case 21:
                        texto.setText(R.string.exodo21);
                        break;
                    case 22:
                        texto.setText(R.string.exodo22);
                        break;
                    case 23:
                        texto.setText(R.string.exodo23);
                        break;
                    case 24:
                        texto.setText(R.string.exodo24);
                        break;
                    case 25:
                        texto.setText(R.string.exodo25);
                        break;
                    case 26:
                        texto.setText(R.string.exodo26);
                        break;
                    case 27:
                        texto.setText(R.string.exodo27);
                        break;
                    case 28:
                        texto.setText(R.string.exodo28);
                        break;
                    case 29:
                        texto.setText(R.string.exodo29);
                        break;
                    case 30:
                        texto.setText(R.string.exodo30);
                        break;
                    case 31:
                        texto.setText(R.string.exodo31);
                        break;
                    case 32:
                        texto.setText(R.string.exodo32);
                        break;
                    case 33:
                        texto.setText(R.string.exodo33);
                        break;
                    case 34:
                        texto.setText(R.string.exodo34);
                        break;
                    case 35:
                        texto.setText(R.string.exodo35);
                        break;
                    case 36:
                        texto.setText(R.string.exodo36);
                        break;
                    case 37:
                        texto.setText(R.string.exodo37);
                        break;
                    case 38:
                        texto.setText(R.string.exodo38);
                        break;
                    case 39:
                        texto.setText(R.string.exodo39);
                        break;
                    case 40:
                        texto.setText(R.string.exodo40);
                        break;
                }
                break;
            case 3:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.levitico1);
                        break;
                    case 2:
                        texto.setText(R.string.levitico2);
                        break;
                    case 3:
                        texto.setText(R.string.levitico3);
                        break;
                    case 4:
                        texto.setText(R.string.levitico4);
                        break;
                    case 5:
                        texto.setText(R.string.levitico5);
                        break;
                    case 6:
                        texto.setText(R.string.levitico6);
                        break;
                    case 7:
                        texto.setText(R.string.levitico7);
                        break;
                    case 8:
                        texto.setText(R.string.levitico8);
                        break;
                    case 9:
                        texto.setText(R.string.levitico9);
                        break;
                    case 10:
                        texto.setText(R.string.levitico10);
                        break;
                    case 11:
                        texto.setText(R.string.levitico11);
                        break;
                    case 12:
                        texto.setText(R.string.levitico12);
                        break;
                    case 13:
                        texto.setText(R.string.levitico13);
                        break;
                    case 14:
                        texto.setText(R.string.levitico14);
                        break;
                    case 15:
                        texto.setText(R.string.levitico15);
                        break;
                    case 16:
                        texto.setText(R.string.levitico16);
                        break;
                    case 17:
                        texto.setText(R.string.levitico17);
                        break;
                    case 18:
                        texto.setText(R.string.levitico18);
                        break;
                    case 19:
                        texto.setText(R.string.levitico19);
                        break;
                    case 20:
                        texto.setText(R.string.levitico20);
                        break;
                    case 21:
                        texto.setText(R.string.levitico21);
                        break;
                    case 22:
                        texto.setText(R.string.levitico22);
                        break;
                    case 23:
                        texto.setText(R.string.levitico23);
                        break;
                    case 24:
                        texto.setText(R.string.levitico24);
                        break;
                    case 25:
                        texto.setText(R.string.levitico25);
                        break;
                    case 26:
                        texto.setText(R.string.levitico26);
                        break;
                    case 27:
                        texto.setText(R.string.levitico27);
                        break;
                }

                break;
            case 4:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.numeros1);
                        break;
                    case 2:
                        texto.setText(R.string.numeros2);
                        break;
                    case 3:
                        texto.setText(R.string.numeros3);
                        break;
                    case 4:
                        texto.setText(R.string.numeros4);
                        break;
                    case 5:
                        texto.setText(R.string.numeros5);
                        break;
                    case 6:
                        texto.setText(R.string.numeros6);
                        break;
                    case 7:
                        texto.setText(R.string.numeros7);
                        break;
                    case 8:
                        texto.setText(R.string.numeros8);
                        break;
                    case 9:
                        texto.setText(R.string.numeros9);
                        break;
                    case 10:
                        texto.setText(R.string.numeros10);
                        break;
                    case 11:
                        texto.setText(R.string.numeros11);
                        break;
                    case 12:
                        texto.setText(R.string.numeros12);
                        break;
                    case 13:
                        texto.setText(R.string.numeros13);
                        break;
                    case 14:
                        texto.setText(R.string.numeros14);
                        break;
                    case 15:
                        texto.setText(R.string.numeros15);
                        break;
                    case 16:
                        texto.setText(R.string.numeros16);
                        break;
                    case 17:
                        texto.setText(R.string.numeros17);
                        break;
                    case 18:
                        texto.setText(R.string.numeros18);
                        break;
                    case 19:
                        texto.setText(R.string.numeros19);
                        break;
                    case 20:
                        texto.setText(R.string.numeros20);
                        break;
                    case 21:
                        texto.setText(R.string.numeros21);
                        break;
                    case 22:
                        texto.setText(R.string.numeros22);
                        break;
                    case 23:
                        texto.setText(R.string.numeros23);
                        break;
                    case 24:
                        texto.setText(R.string.numeros24);
                        break;
                    case 25:
                        texto.setText(R.string.numeros25);
                        break;
                    case 26:
                        texto.setText(R.string.numeros26);
                        break;
                    case 27:
                        texto.setText(R.string.numeros27);
                        break;
                    case 28:
                        texto.setText(R.string.numeros28);
                        break;
                    case 29:
                        texto.setText(R.string.numeros29);
                        break;
                    case 30:
                        texto.setText(R.string.numeros30);
                        break;
                    case 31:
                        texto.setText(R.string.numeros31);
                        break;
                    case 32:
                        texto.setText(R.string.numeros32);
                        break;
                    case 33:
                        texto.setText(R.string.numeros33);
                        break;
                    case 34:
                        texto.setText(R.string.numeros34);
                        break;
                    case 35:
                        texto.setText(R.string.numeros35);
                        break;
                    case 36:
                        texto.setText(R.string.numeros36);
                        break;
                }

                break;
            case 5:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.deuteronomio1);
                        break;
                    case 2:
                        texto.setText(R.string.deuteronomio2);
                        break;
                    case 3:
                        texto.setText(R.string.deuteronomio3);
                        break;
                    case 4:
                        texto.setText(R.string.deuteronomio4);
                        break;
                    case 5:
                        texto.setText(R.string.deuteronomio5);
                        break;
                    case 6:
                        texto.setText(R.string.deuteronomio6);
                        break;
                    case 7:
                        texto.setText(R.string.deuteronomio7);
                        break;
                    case 8:
                        texto.setText(R.string.deuteronomio8);
                        break;
                    case 9:
                        texto.setText(R.string.deuteronomio9);
                        break;
                    case 10:
                        texto.setText(R.string.deuteronomio10);
                        break;
                    case 11:
                        texto.setText(R.string.deuteronomio11);
                        break;
                    case 12:
                        texto.setText(R.string.deuteronomio12);
                        break;
                    case 13:
                        texto.setText(R.string.deuteronomio13);
                        break;
                    case 14:
                        texto.setText(R.string.deuteronomio14);
                        break;
                    case 15:
                        texto.setText(R.string.deuteronomio15);
                        break;
                    case 16:
                        texto.setText(R.string.deuteronomio16);
                        break;
                    case 17:
                        texto.setText(R.string.deuteronomio17);
                        break;
                    case 18:
                        texto.setText(R.string.deuteronomio18);
                        break;
                    case 19:
                        texto.setText(R.string.deuteronomio19);
                        break;
                    case 20:
                        texto.setText(R.string.deuteronomio20);
                        break;
                    case 21:
                        texto.setText(R.string.deuteronomio21);
                        break;
                    case 22:
                        texto.setText(R.string.deuteronomio22);
                        break;
                    case 23:
                        texto.setText(R.string.deuteronomio23);
                        break;
                    case 24:
                        texto.setText(R.string.deuteronomio24);
                        break;
                    case 25:
                        texto.setText(R.string.deuteronomio25);
                        break;
                    case 26:
                        texto.setText(R.string.deuteronomio26);
                        break;
                    case 27:
                        texto.setText(R.string.deuteronomio27);
                        break;
                    case 28:
                        texto.setText(R.string.deuteronomio28);
                        break;
                    case 29:
                        texto.setText(R.string.deuteronomio29);
                        break;
                    case 30:
                        texto.setText(R.string.deuteronomio30);
                        break;
                    case 31:
                        texto.setText(R.string.deuteronomio31);
                        break;
                    case 32:
                        texto.setText(R.string.deuteronomio32);
                        break;
                    case 33:
                        texto.setText(R.string.deuteronomio33);
                        break;
                    case 34:
                        texto.setText(R.string.deuteronomio34);
                        break;
                }

                break;
            case 6:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.josue1);
                        break;
                    case 2:
                        texto.setText(R.string.josue2);
                        break;
                    case 3:
                        texto.setText(R.string.josue3);
                        break;
                    case 4:
                        texto.setText(R.string.josue4);
                        break;
                    case 5:
                        texto.setText(R.string.josue5);
                        break;
                    case 6:
                        texto.setText(R.string.josue6);
                        break;
                    case 7:
                        texto.setText(R.string.josue7);
                        break;
                    case 8:
                        texto.setText(R.string.josue8);
                        break;
                    case 9:
                        texto.setText(R.string.josue9);
                        break;
                    case 10:
                        texto.setText(R.string.josue10);
                        break;
                    case 11:
                        texto.setText(R.string.josue11);
                        break;
                    case 12:
                        texto.setText(R.string.josue12);
                        break;
                    case 13:
                        texto.setText(R.string.josue13);
                        break;
                    case 14:
                        texto.setText(R.string.josue14);
                        break;
                    case 15:
                        texto.setText(R.string.josue15);
                        break;
                    case 16:
                        texto.setText(R.string.josue16);
                        break;
                    case 17:
                        texto.setText(R.string.josue17);
                        break;
                    case 18:
                        texto.setText(R.string.josue18);
                        break;
                    case 19:
                        texto.setText(R.string.josue19);
                        break;
                    case 20:
                        texto.setText(R.string.josue20);
                        break;
                    case 21:
                        texto.setText(R.string.josue21);
                        break;
                    case 22:
                        texto.setText(R.string.josue22);
                        break;
                    case 23:
                        texto.setText(R.string.josue23);
                        break;
                    case 24:
                        texto.setText(R.string.josue24);
                        break;
                }

                break;
            case 7:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.jueces1);
                        break;
                    case 2:
                        texto.setText(R.string.jueces2);
                        break;
                    case 3:
                        texto.setText(R.string.jueces3);
                        break;
                    case 4:
                        texto.setText(R.string.jueces4);
                        break;
                    case 5:
                        texto.setText(R.string.jueces5);
                        break;
                    case 6:
                        texto.setText(R.string.jueces6);
                        break;
                    case 7:
                        texto.setText(R.string.jueces7);
                        break;
                    case 8:
                        texto.setText(R.string.jueces8);
                        break;
                    case 9:
                        texto.setText(R.string.jueces9);
                        break;
                    case 10:
                        texto.setText(R.string.jueces10);
                        break;
                    case 11:
                        texto.setText(R.string.jueces11);
                        break;
                    case 12:
                        texto.setText(R.string.jueces12);
                        break;
                    case 13:
                        texto.setText(R.string.jueces13);
                        break;
                    case 14:
                        texto.setText(R.string.jueces14);
                        break;
                    case 15:
                        texto.setText(R.string.jueces15);
                        break;
                    case 16:
                        texto.setText(R.string.jueces16);
                        break;
                    case 17:
                        texto.setText(R.string.jueces17);
                        break;
                    case 18:
                        texto.setText(R.string.jueces18);
                        break;
                    case 19:
                        texto.setText(R.string.jueces19);
                        break;
                    case 20:
                        texto.setText(R.string.jueces20);
                        break;
                    case 21:
                        texto.setText(R.string.jueces21);
                        break;
                }

                break;
            case 8:
                switch (capitulo){
                    case 1:
                        texto.setText(R.string.Ruth1);
                        break;
                    case 2:
                        texto.setText(R.string.Ruth2);
                        break;
                    case 3:
                        texto.setText(R.string.Ruth3);
                        break;
                    case 4:
                        texto.setText(R.string.Ruth4);
                        break;
                }

                break;
            case 9:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Isamuel1);
                        break;
                    case 2:
                        texto.setText(R.string.Isamuel2);
                        break;
                    case 3:
                        texto.setText(R.string.Isamuel3);
                        break;
                    case 4:
                        texto.setText(R.string.Isamuel4);
                        break;
                    case 5:
                        texto.setText(R.string.Isamuel5);
                        break;
                    case 6:
                        texto.setText(R.string.Isamuel6);
                        break;
                    case 7:
                        texto.setText(R.string.Isamuel7);
                        break;
                    case 8:
                        texto.setText(R.string.Isamuel8);
                        break;
                    case 9:
                        texto.setText(R.string.Isamuel9);
                        break;
                    case 10:
                        texto.setText(R.string.Isamuel10);
                        break;
                    case 11:
                        texto.setText(R.string.Isamuel11);
                        break;
                    case 12:
                        texto.setText(R.string.Isamuel12);
                        break;
                    case 13:
                        texto.setText(R.string.Isamuel13);
                        break;
                    case 14:
                        texto.setText(R.string.Isamuel14);
                        break;
                    case 15:
                        texto.setText(R.string.Isamuel15);
                        break;
                    case 16:
                        texto.setText(R.string.Isamuel16);
                        break;
                    case 17:
                        texto.setText(R.string.Isamuel17);
                        break;
                    case 18:
                        texto.setText(R.string.Isamuel18);
                        break;
                    case 19:
                        texto.setText(R.string.Isamuel19);
                        break;
                    case 20:
                        texto.setText(R.string.Isamuel20);
                        break;
                    case 21:
                        texto.setText(R.string.Isamuel21);
                        break;
                    case 22:
                        texto.setText(R.string.Isamuel22);
                        break;
                    case 23:
                        texto.setText(R.string.Isamuel23);
                        break;
                    case 24:
                        texto.setText(R.string.Isamuel24);
                        break;
                    case 25:
                        texto.setText(R.string.Isamuel25);
                        break;
                    case 26:
                        texto.setText(R.string.Isamuel26);
                        break;
                    case 27:
                        texto.setText(R.string.Isamuel27);
                        break;
                    case 28:
                        texto.setText(R.string.Isamuel28);
                        break;
                    case 29:
                        texto.setText(R.string.Isamuel29);
                        break;
                    case 30:
                        texto.setText(R.string.Isamuel30);
                        break;
                    case 31:
                        texto.setText(R.string.Isamuel31);
                        break;
                }

                break;
            case 10:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IISamuel1);
                        break;
                    case 2:
                        texto.setText(R.string.IISamuel2);
                        break;
                    case 3:
                        texto.setText(R.string.IISamuel3);
                        break;
                    case 4:
                        texto.setText(R.string.IISamuel4);
                        break;
                    case 5:
                        texto.setText(R.string.IISamuel5);
                        break;
                    case 6:
                        texto.setText(R.string.IISamuel6);
                        break;
                    case 7:
                        texto.setText(R.string.IISamuel7);
                        break;
                    case 8:
                        texto.setText(R.string.IISamuel8);
                        break;
                    case 9:
                        texto.setText(R.string.IISamuel9);
                        break;
                    case 10:
                        texto.setText(R.string.IISamuel10);
                        break;
                    case 11:
                        texto.setText(R.string.IISamuel11);
                        break;
                    case 12:
                        texto.setText(R.string.IISamuel12);
                        break;
                    case 13:
                        texto.setText(R.string.IISamuel13);
                        break;
                    case 14:
                        texto.setText(R.string.IISamuel14);
                        break;
                    case 15:
                        texto.setText(R.string.IISamuel15);
                        break;
                    case 16:
                        texto.setText(R.string.IISamuel16);
                        break;
                    case 17:
                        texto.setText(R.string.IISamuel17);
                        break;
                    case 18:
                        texto.setText(R.string.IISamuel18);
                        break;
                    case 19:
                        texto.setText(R.string.IISamuel19);
                        break;
                    case 20:
                        texto.setText(R.string.IISamuel20);
                        break;
                    case 21:
                        texto.setText(R.string.IISamuel21);
                        break;
                    case 22:
                        texto.setText(R.string.IISamuel22);
                        break;
                    case 23:
                        texto.setText(R.string.IISamuel23);
                        break;
                    case 24:
                        texto.setText(R.string.IISamuel24);
                        break;
                }
                break;
            case 11:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Ireyes1);
                        break;
                    case 2:
                        texto.setText(R.string.Ireyes2);
                        break;
                    case 3:
                        texto.setText(R.string.Ireyes3);
                        break;
                    case 4:
                        texto.setText(R.string.Ireyes4);
                        break;
                    case 5:
                        texto.setText(R.string.Ireyes5);
                        break;
                    case 6:
                        texto.setText(R.string.Ireyes6);
                        break;
                    case 7:
                        texto.setText(R.string.Ireyes7);
                        break;
                    case 8:
                        texto.setText(R.string.Ireyes8);
                        break;
                    case 9:
                        texto.setText(R.string.Ireyes9);
                        break;
                    case 10:
                        texto.setText(R.string.Ireyes10);
                        break;
                    case 11:
                        texto.setText(R.string.Ireyes11);
                        break;
                    case 12:
                        texto.setText(R.string.Ireyes12);
                        break;
                    case 13:
                        texto.setText(R.string.Ireyes13);
                        break;
                    case 14:
                        texto.setText(R.string.Ireyes14);
                        break;
                    case 15:
                        texto.setText(R.string.Ireyes15);
                        break;
                    case 16:
                        texto.setText(R.string.Ireyes16);
                        break;
                    case 17:
                        texto.setText(R.string.Ireyes17);
                        break;
                    case 18:
                        texto.setText(R.string.Ireyes18);
                        break;
                    case 19:
                        texto.setText(R.string.Ireyes19);
                        break;
                    case 20:
                        texto.setText(R.string.Ireyes20);
                        break;
                    case 21:
                        texto.setText(R.string.Ireyes21);
                        break;
                    case 22:
                        texto.setText(R.string.Ireyes22);
                        break;
                }

                break;

            case 12:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IIreyes1);
                        break;
                    case 2:
                        texto.setText(R.string.IIreyes2);
                        break;
                    case 3:
                        texto.setText(R.string.IIreyes3);
                        break;
                    case 4:
                        texto.setText(R.string.IIreyes4);
                        break;
                    case 5:
                        texto.setText(R.string.IIreyes5);
                        break;
                    case 6:
                        texto.setText(R.string.IIreyes6);
                        break;
                    case 7:
                        texto.setText(R.string.IIreyes7);
                        break;
                    case 8:
                        texto.setText(R.string.IIreyes8);
                        break;
                    case 9:
                        texto.setText(R.string.IIreyes9);
                        break;
                    case 10:
                        texto.setText(R.string.IIreyes10);
                        break;
                    case 11:
                        texto.setText(R.string.IIreyes11);
                        break;
                    case 12:
                        texto.setText(R.string.IIreyes12);
                        break;
                    case 13:
                        texto.setText(R.string.IIreyes13);
                        break;
                    case 14:
                        texto.setText(R.string.IIreyes14);
                        break;
                    case 15:
                        texto.setText(R.string.IIreyes15);
                        break;
                    case 16:
                        texto.setText(R.string.IIreyes16);
                        break;
                    case 17:
                        texto.setText(R.string.IIreyes17);
                        break;
                    case 18:
                        texto.setText(R.string.IIreyes18);
                        break;
                    case 19:
                        texto.setText(R.string.IIreyes19);
                        break;
                    case 20:
                        texto.setText(R.string.IIreyes20);
                        break;
                    case 21:
                        texto.setText(R.string.IIreyes21);
                        break;
                    case 22:
                        texto.setText(R.string.IIreyes22);
                        break;
                    case 23:
                        texto.setText(R.string.IIreyes23);
                        break;
                    case 24:
                        texto.setText(R.string.IIreyes24);
                        break;
                    case 25:
                        texto.setText(R.string.IIreyes25);
                        break;
                }
                break;
            case 13:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Icronicas1);
                        break;
                    case 2:
                        texto.setText(R.string.Icronicas2);
                        break;
                    case 3:
                        texto.setText(R.string.Icronicas3);
                        break;
                    case 4:
                        texto.setText(R.string.Icronicas4);
                        break;
                    case 5:
                        texto.setText(R.string.Icronicas5);
                        break;
                    case 6:
                        texto.setText(R.string.Icronicas6);
                        break;
                    case 7:
                        texto.setText(R.string.Icronicas7);
                        break;
                    case 8:
                        texto.setText(R.string.Icronicas8);
                        break;
                    case 9:
                        texto.setText(R.string.Icronicas9);
                        break;
                    case 10:
                        texto.setText(R.string.Icronicas10);
                        break;
                    case 11:
                        texto.setText(R.string.Icronicas11);
                        break;
                    case 12:
                        texto.setText(R.string.Icronicas12);
                        break;
                    case 13:
                        texto.setText(R.string.Icronicas13);
                        break;
                    case 14:
                        texto.setText(R.string.Icronicas14);
                        break;
                    case 15:
                        texto.setText(R.string.Icronicas15);
                        break;
                    case 16:
                        texto.setText(R.string.Icronicas16);
                        break;
                    case 17:
                        texto.setText(R.string.Icronicas17);
                        break;
                    case 18:
                        texto.setText(R.string.Icronicas18);
                        break;
                    case 19:
                        texto.setText(R.string.Icronicas19);
                        break;
                    case 20:
                        texto.setText(R.string.Icronicas20);
                        break;
                    case 21:
                        texto.setText(R.string.Icronicas21);
                        break;
                    case 22:
                        texto.setText(R.string.Icronicas22);
                        break;
                    case 23:
                        texto.setText(R.string.Icronicas23);
                        break;
                    case 24:
                        texto.setText(R.string.Icronicas24);
                        break;
                    case 25:
                        texto.setText(R.string.Icronicas25);
                        break;
                    case 26:
                        texto.setText(R.string.Icronicas26);
                        break;
                    case 27:
                        texto.setText(R.string.Icronicas27);
                        break;
                    case 28:
                        texto.setText(R.string.Icronicas28);
                        break;
                    case 29:
                        texto.setText(R.string.Icronicas29);
                        break;
                }

                break;
            case 14:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IIcronicas1);
                        break;
                    case 2:
                        texto.setText(R.string.IIcronicas2);
                        break;
                    case 3:
                        texto.setText(R.string.IIcronicas3);
                        break;
                    case 4:
                        texto.setText(R.string.IIcronicas4);
                        break;
                    case 5:
                        texto.setText(R.string.IIcronicas5);
                        break;
                    case 6:
                        texto.setText(R.string.IIcronicas6);
                        break;
                    case 7:
                        texto.setText(R.string.IIcronicas7);
                        break;
                    case 8:
                        texto.setText(R.string.IIcronicas8);
                        break;
                    case 9:
                        texto.setText(R.string.IIcronicas9);
                        break;
                    case 10:
                        texto.setText(R.string.IIcronicas10);
                        break;
                    case 11:
                        texto.setText(R.string.IIcronicas11);
                        break;
                    case 12:
                        texto.setText(R.string.IIcronicas12);
                        break;
                    case 13:
                        texto.setText(R.string.IIcronicas13);
                        break;
                    case 14:
                        texto.setText(R.string.IIcronicas14);
                        break;
                    case 15:
                        texto.setText(R.string.IIcronicas15);
                        break;
                    case 16:
                        texto.setText(R.string.IIcronicas16);
                        break;
                    case 17:
                        texto.setText(R.string.IIcronicas17);
                        break;
                    case 18:
                        texto.setText(R.string.IIcronicas18);
                        break;
                    case 19:
                        texto.setText(R.string.IIcronicas19);
                        break;
                    case 20:
                        texto.setText(R.string.IIcronicas20);
                        break;
                    case 21:
                        texto.setText(R.string.IIcronicas21);
                        break;
                    case 22:
                        texto.setText(R.string.IIcronicas22);
                        break;
                    case 23:
                        texto.setText(R.string.IIcronicas23);
                        break;
                    case 24:
                        texto.setText(R.string.IIcronicas24);
                        break;
                    case 25:
                        texto.setText(R.string.IIcronicas25);
                        break;
                    case 26:
                        texto.setText(R.string.IIcronicas26);
                        break;
                    case 27:
                        texto.setText(R.string.IIcronicas27);
                        break;
                    case 28:
                        texto.setText(R.string.IIcronicas28);
                        break;
                    case 29:
                        texto.setText(R.string.IIcronicas29);
                        break;
                    case 30:
                        texto.setText(R.string.IIcronicas30);
                        break;
                    case 31:
                        texto.setText(R.string.IIcronicas31);
                        break;
                    case 32:
                        texto.setText(R.string.IIcronicas32);
                        break;
                    case 33:
                        texto.setText(R.string.IIcronicas33);
                        break;
                    case 34:
                        texto.setText(R.string.IIcronicas34);
                        break;
                    case 35:
                        texto.setText(R.string.IIcronicas35);
                        break;
                    case 36:
                        texto.setText(R.string.IIcronicas36);
                        break;
                }

                break;
            case 15:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.esdras1);
                        break;
                    case 2:
                        texto.setText(R.string.esdras2);
                        break;
                    case 3:
                        texto.setText(R.string.esdras3);
                        break;
                    case 4:
                        texto.setText(R.string.esdras4);
                        break;
                    case 5:
                        texto.setText(R.string.esdras5);
                        break;
                    case 6:
                        texto.setText(R.string.esdras6);
                        break;
                    case 7:
                        texto.setText(R.string.esdras7);
                        break;
                    case 8:
                        texto.setText(R.string.esdras8);
                        break;
                    case 9:
                        texto.setText(R.string.esdras9);
                        break;
                    case 10:
                        texto.setText(R.string.esdras10);
                        break;
                }

                break;
            case 16:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.nehemias1);
                        break;
                    case 2:
                        texto.setText(R.string.nehemias2);
                        break;
                    case 3:
                        texto.setText(R.string.nehemias3);
                        break;
                    case 4:
                        texto.setText(R.string.nehemias4);
                        break;
                    case 5:
                        texto.setText(R.string.nehemias5);
                        break;
                    case 6:
                        texto.setText(R.string.nehemias6);
                        break;
                    case 7:
                        texto.setText(R.string.nehemias7);
                        break;
                    case 8:
                        texto.setText(R.string.nehemias8);
                        break;
                    case 9:
                        texto.setText(R.string.nehemias9);
                        break;
                    case 10:
                        texto.setText(R.string.nehemias10);
                        break;
                    case 11:
                        texto.setText(R.string.nehemias11);
                        break;
                    case 12:
                        texto.setText(R.string.nehemias12);
                        break;
                    case 13:
                        texto.setText(R.string.nehemias13);
                        break;
                    case 14:
                        texto.setText(R.string.nehemias1);
                        break;
                }
                break;
            case 17:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.tobias1);
                        break;
                    case 2:
                        texto.setText(R.string.tobias2);
                        break;
                    case 3:
                        texto.setText(R.string.tobias3);
                        break;
                    case 4:
                        texto.setText(R.string.tobias4);
                        break;
                    case 5:
                        texto.setText(R.string.tobias5);
                        break;
                    case 6:
                        texto.setText(R.string.tobias6);
                        break;
                    case 7:
                        texto.setText(R.string.tobias7);
                        break;
                    case 8:
                        texto.setText(R.string.tobias8);
                        break;
                    case 9:
                        texto.setText(R.string.tobias9);
                        break;
                    case 10:
                        texto.setText(R.string.tobias10);
                        break;
                    case 11:
                        texto.setText(R.string.tobias11);
                        break;
                    case 12:
                        texto.setText(R.string.tobias12);
                        break;
                    case 13:
                        texto.setText(R.string.tobias13);
                        break;
                    case 14:
                        texto.setText(R.string.tobias14);
                        break;
                }
                break;
            case 18:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.judit1);
                        break;
                    case 2:
                        texto.setText(R.string.judit2);
                        break;
                    case 3:
                        texto.setText(R.string.judit3);
                        break;
                    case 4:
                        texto.setText(R.string.judit4);
                        break;
                    case 5:
                        texto.setText(R.string.judit5);
                        break;
                    case 6:
                        texto.setText(R.string.judit6);
                        break;
                    case 7:
                        texto.setText(R.string.judit7);
                        break;
                    case 8:
                        texto.setText(R.string.judit8);
                        break;
                    case 9:
                        texto.setText(R.string.judit9);
                        break;
                    case 10:
                        texto.setText(R.string.judit10);
                        break;
                    case 11:
                        texto.setText(R.string.judit11);
                        break;
                    case 12:
                        texto.setText(R.string.judit12);
                        break;
                    case 13:
                        texto.setText(R.string.judit13);
                        break;
                    case 14:
                        texto.setText(R.string.judit14);
                        break;
                    case 15:
                        texto.setText(R.string.judit15);
                        break;
                    case 16:
                        texto.setText(R.string.judit16);
                        break;
                }
                break;
            case 19:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.ester1);
                        break;
                    case 2:
                        texto.setText(R.string.ester2);
                        break;
                    case 3:
                        texto.setText(R.string.ester3);
                        break;
                    case 4:
                        texto.setText(R.string.ester4);
                        break;
                    case 5:
                        texto.setText(R.string.ester5);
                        break;
                    case 6:
                        texto.setText(R.string.ester6);
                        break;
                    case 7:
                        texto.setText(R.string.ester7);
                        break;
                    case 8:
                        texto.setText(R.string.ester8);
                        break;
                    case 9:
                        texto.setText(R.string.ester9);
                        break;
                    case 10:
                        texto.setText(R.string.ester10);
                        break;
                    case 11:
                        texto.setText(R.string.ester11);
                        break;
                    case 12:
                        texto.setText(R.string.ester12);
                        break;
                    case 13:
                        texto.setText(R.string.ester13);
                        break;
                    case 14:
                        texto.setText(R.string.ester14);
                        break;
                    case 15:
                        texto.setText(R.string.ester15);
                        break;
                    case 16:
                        texto.setText(R.string.ester16);
                        break;
                }
                break;
            case 20:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.job1);
                        break;
                    case 2:
                        texto.setText(R.string.job2);
                        break;
                    case 3:
                        texto.setText(R.string.job3);
                        break;
                    case 4:
                        texto.setText(R.string.job4);
                        break;
                    case 5:
                        texto.setText(R.string.job5);
                        break;
                    case 6:
                        texto.setText(R.string.job6);
                        break;
                    case 7:
                        texto.setText(R.string.job7);
                        break;
                    case 8:
                        texto.setText(R.string.job8);
                        break;
                    case 9:
                        texto.setText(R.string.job9);
                        break;
                    case 10:
                        texto.setText(R.string.job10);
                        break;
                    case 11:
                        texto.setText(R.string.job11);
                        break;
                    case 12:
                        texto.setText(R.string.job12);
                        break;
                    case 13:
                        texto.setText(R.string.job13);
                        break;
                    case 14:
                        texto.setText(R.string.job14);
                        break;
                    case 15:
                        texto.setText(R.string.job15);
                        break;
                    case 16:
                        texto.setText(R.string.job16);
                        break;
                    case 17:
                        texto.setText(R.string.job17);
                        break;
                    case 18:
                        texto.setText(R.string.job18);
                        break;
                    case 19:
                        texto.setText(R.string.job19);
                        break;
                    case 20:
                        texto.setText(R.string.job20);
                        break;
                    case 21:
                        texto.setText(R.string.job21);
                        break;
                    case 22:
                        texto.setText(R.string.job22);
                        break;
                    case 23:
                        texto.setText(R.string.job23);
                        break;
                    case 24:
                        texto.setText(R.string.job24);
                        break;
                    case 25:
                        texto.setText(R.string.job25);
                        break;
                    case 26:
                        texto.setText(R.string.job26);
                        break;
                    case 27:
                        texto.setText(R.string.job27);
                        break;
                    case 28:
                        texto.setText(R.string.job28);
                        break;
                    case 29:
                        texto.setText(R.string.job29);
                        break;
                    case 30:
                        texto.setText(R.string.job30);
                        break;
                    case 31:
                        texto.setText(R.string.job31);
                        break;
                    case 32:
                        texto.setText(R.string.job32);
                        break;
                    case 33:
                        texto.setText(R.string.job33);
                        break;
                    case 34:
                        texto.setText(R.string.job34);
                        break;
                    case 35:
                        texto.setText(R.string.job35);
                        break;
                    case 36:
                        texto.setText(R.string.job36);
                        break;
                    case 37:
                        texto.setText(R.string.job37);
                        break;
                    case 38:
                        texto.setText(R.string.job38);
                        break;
                    case 39:
                        texto.setText(R.string.job39);
                        break;
                    case 40:
                        texto.setText(R.string.job40);
                        break;
                    case 41:
                        texto.setText(R.string.job41);
                        break;
                    case 42:
                        texto.setText(R.string.job42);
                        break;

                }

                break;
            case 21:
                switch (capitulo){
                    case 1:
                        texto.setText(R.string.salmos1);
                        break;
                    case 2:
                        texto.setText(R.string.salmos2);
                        break;
                    case 3:
                        texto.setText(R.string.salmos3);
                        break;
                    case 4:
                        texto.setText(R.string.salmos4);
                        break;
                    case 5:
                        texto.setText(R.string.salmos5);
                        break;
                    case 6:
                        texto.setText(R.string.salmos6);
                        break;
                    case 7:
                        texto.setText(R.string.salmos7);
                        break;
                    case 8:
                        texto.setText(R.string.salmos8);
                        break;
                    case 9:
                        texto.setText(R.string.salmos9);
                        break;
                    case 10:
                        texto.setText(R.string.salmos10);
                        break;
                    case 11:
                        texto.setText(R.string.salmos11);
                        break;
                    case 12:
                        texto.setText(R.string.salmos12);
                        break;
                    case 13:
                        texto.setText(R.string.salmos13);
                        break;
                    case 14:
                        texto.setText(R.string.salmos14);
                        break;
                    case 15:
                        texto.setText(R.string.salmos15);
                        break;
                    case 16:
                        texto.setText(R.string.salmos16);
                        break;
                    case 17:
                        texto.setText(R.string.salmos17);
                        break;
                    case 18:
                        texto.setText(R.string.salmos18);
                        break;
                    case 19:
                        texto.setText(R.string.salmos19);
                        break;
                    case 20:
                        texto.setText(R.string.salmos20);
                        break;
                    case 21:
                        texto.setText(R.string.salmos21);
                        break;
                    case 22:
                        texto.setText(R.string.salmos22);
                        break;
                    case 23:
                        texto.setText(R.string.salmos23);
                        break;
                    case 24:
                        texto.setText(R.string.salmos24);
                        break;
                    case 25:
                        texto.setText(R.string.salmos25);
                        break;
                    case 26:
                        texto.setText(R.string.salmos26);
                        break;
                    case 27:
                        texto.setText(R.string.salmos27);
                        break;
                    case 28:
                        texto.setText(R.string.salmos28);
                        break;
                    case 29:
                        texto.setText(R.string.salmos29);
                        break;
                    case 30:
                        texto.setText(R.string.salmos30);
                        break;
                    case 31:
                        texto.setText(R.string.salmos31);
                        break;
                    case 32:
                        texto.setText(R.string.salmos32);
                        break;
                    case 33:
                        texto.setText(R.string.salmos33);
                        break;
                    case 34:
                        texto.setText(R.string.salmos34);
                        break;
                    case 35:
                        texto.setText(R.string.salmos35);
                        break;
                    case 36:
                        texto.setText(R.string.salmos36);
                        break;
                    case 37:
                        texto.setText(R.string.salmos37);
                        break;
                    case 38:
                        texto.setText(R.string.salmos38);
                        break;
                    case 39:
                        texto.setText(R.string.salmos39);
                        break;
                    case 40:
                        texto.setText(R.string.salmos40);
                        break;
                    case 41:
                        texto.setText(R.string.salmos41);
                        break;
                    case 42:
                        texto.setText(R.string.salmos42);
                        break;
                    case 43:
                        texto.setText(R.string.salmos43);
                        break;
                    case 44:
                        texto.setText(R.string.salmos44);
                        break;
                    case 45:
                        texto.setText(R.string.salmos45);
                        break;
                    case 46:
                        texto.setText(R.string.salmos46);
                        break;
                    case 47:
                        texto.setText(R.string.salmos47);
                        break;
                    case 48:
                        texto.setText(R.string.salmos48);
                        break;
                    case 49:
                        texto.setText(R.string.salmos49);
                        break;
                    case 50:
                        texto.setText(R.string.salmos50);
                        break;
                    case 51:
                        texto.setText(R.string.salmos51);
                        break;
                    case 52:
                        texto.setText(R.string.salmos52);
                        break;
                    case 53:
                        texto.setText(R.string.salmos53);
                        break;
                    case 54:
                        texto.setText(R.string.salmos54);
                        break;
                    case 55:
                        texto.setText(R.string.salmos55);
                        break;
                    case 56:
                        texto.setText(R.string.salmos56);
                        break;
                    case 57:
                        texto.setText(R.string.salmos57);
                        break;
                    case 58:
                        texto.setText(R.string.salmos58);
                        break;
                    case 59:
                        texto.setText(R.string.salmos59);
                        break;
                    case 60:
                        texto.setText(R.string.salmos60);
                        break;
                    case 61:
                        texto.setText(R.string.salmos61);
                        break;
                    case 62:
                        texto.setText(R.string.salmos62);
                        break;
                    case 63:
                        texto.setText(R.string.salmos63);
                        break;
                    case 64:
                        texto.setText(R.string.salmos64);
                        break;
                    case 65:
                        texto.setText(R.string.salmos65);
                        break;
                    case 66:
                        texto.setText(R.string.salmos66);
                        break;
                    case 67:
                        texto.setText(R.string.salmos67);
                        break;
                    case 68:
                        texto.setText(R.string.salmos68);
                        break;
                    case 69:
                        texto.setText(R.string.salmos69);
                        break;
                    case 70:
                        texto.setText(R.string.salmos70);
                        break;
                    case 71:
                        texto.setText(R.string.salmos71);
                        break;
                    case 72:
                        texto.setText(R.string.salmos72);
                        break;
                    case 73:
                        texto.setText(R.string.salmos73);
                        break;
                    case 74:
                        texto.setText(R.string.salmos74);
                        break;
                    case 75:
                        texto.setText(R.string.salmos75);
                        break;
                    case 76:
                        texto.setText(R.string.salmos76);
                        break;
                    case 77:
                        texto.setText(R.string.salmos77);
                        break;
                    case 78:
                        texto.setText(R.string.salmos78);
                        break;
                    case 79:
                        texto.setText(R.string.salmos79);
                    case 80:
                        texto.setText(R.string.salmos80);
                        break;
                    case 81:
                        texto.setText(R.string.salmos81);
                        break;
                    case 82:
                        texto.setText(R.string.salmos81);
                        break;
                    case 83:
                        texto.setText(R.string.salmos83);
                        break;
                    case 84:
                        texto.setText(R.string.salmos84);
                        break;
                    case 85:
                        texto.setText(R.string.salmos85);
                        break;
                    case 86:
                        texto.setText(R.string.salmos86);
                        break;
                    case 87:
                        texto.setText(R.string.salmos87);
                        break;
                    case 88:
                        texto.setText(R.string.salmos88);
                        break;
                    case 89:
                        texto.setText(R.string.salmos89);
                        break;
                    case 90:
                        texto.setText(R.string.salmos90);
                        break;
                    case 91:
                        texto.setText(R.string.salmos91);
                        break;
                    case 92:
                        texto.setText(R.string.salmos92);
                        break;
                    case 93:
                        texto.setText(R.string.salmos93);
                        break;
                    case 94:
                        texto.setText(R.string.salmos94);
                        break;
                    case 95:
                        texto.setText(R.string.salmos95);
                        break;
                    case 96:
                        texto.setText(R.string.salmos96);
                        break;
                    case 97:
                        texto.setText(R.string.salmos97);
                        break;
                    case 98:
                        texto.setText(R.string.salmos98);
                        break;
                    case 99:
                        texto.setText(R.string.salmos99);
                        break;
                    case 100:
                        texto.setText(R.string.salmos100);
                        break;
                    case 101:
                        texto.setText(R.string.salmos101);
                        break;
                    case 102:
                        texto.setText(R.string.salmos102);
                        break;
                    case 103:
                        texto.setText(R.string.salmos103);
                        break;
                    case 104:
                        texto.setText(R.string.salmos104);
                        break;
                    case 105:
                        texto.setText(R.string.salmos105);
                        break;
                    case 106:
                        texto.setText(R.string.salmos106);
                        break;
                    case 107:
                        texto.setText(R.string.salmos107);
                        break;
                    case 108:
                        texto.setText(R.string.salmos108);
                        break;
                    case 109:
                        texto.setText(R.string.salmos109);
                        break;
                    case 110:
                        texto.setText(R.string.salmos110);
                        break;
                    case 111:
                        texto.setText(R.string.salmos111);
                        break;
                    case 112:
                        texto.setText(R.string.salmos112);
                        break;
                    case 113:
                        texto.setText(R.string.salmos113);
                        break;
                    case 114:
                        texto.setText(R.string.salmos114);
                        break;
                    case 115:
                        texto.setText(R.string.salmos115);
                        break;
                    case 116:
                        texto.setText(R.string.salmos116);
                        break;
                    case 117:
                        texto.setText(R.string.salmos117);
                        break;
                    case 118:
                        texto.setText(R.string.salmos118);
                        break;
                    case 119:
                        texto.setText(R.string.salmos119);
                        break;
                    case 120:
                        texto.setText(R.string.salmos120);
                        break;
                    case 121:
                        texto.setText(R.string.salmos121);
                        break;
                    case 122:
                        texto.setText(R.string.salmos122);
                        break;
                    case 123:
                        texto.setText(R.string.salmos123);
                        break;
                    case 124:
                        texto.setText(R.string.salmos124);
                        break;
                    case 125:
                        texto.setText(R.string.salmos125);
                        break;
                    case 126:
                        texto.setText(R.string.salmos126);
                        break;
                    case 127:
                        texto.setText(R.string.salmos127);
                        break;
                    case 128:
                        texto.setText(R.string.salmos128);
                        break;
                    case 129:
                        texto.setText(R.string.salmos129);
                        break;
                    case 130:
                        texto.setText(R.string.salmos130);
                        break;
                    case 131:
                        texto.setText(R.string.salmos131);
                        break;
                    case 132:
                        texto.setText(R.string.salmos132);
                        break;
                    case 133:
                        texto.setText(R.string.salmos133);
                        break;
                    case 134:
                        texto.setText(R.string.salmos134);
                        break;
                    case 135:
                        texto.setText(R.string.salmos135);
                        break;
                    case 136:
                        texto.setText(R.string.salmos136);
                        break;
                    case 137:
                        texto.setText(R.string.salmos137);
                        break;
                    case 138:
                        texto.setText(R.string.salmos138);
                        break;
                    case 139:
                        texto.setText(R.string.salmos139);
                        break;
                    case 140:
                        texto.setText(R.string.salmos140);
                        break;
                    case 141:
                        texto.setText(R.string.salmos141);
                        break;
                    case 142:
                        texto.setText(R.string.salmos142);
                        break;
                    case 143:
                        texto.setText(R.string.salmos143);
                        break;
                    case 144:
                        texto.setText(R.string.salmos144);
                        break;
                    case 145:
                        texto.setText(R.string.salmos145);
                        break;
                    case 146:
                        texto.setText(R.string.salmos146);
                        break;
                    case 147:
                        texto.setText(R.string.salmos147);
                        break;
                    case 148:
                        texto.setText(R.string.salmos148);
                        break;
                    case 149:
                        texto.setText(R.string.salmos149);
                        break;
                    case 150:
                        texto.setText(R.string.salmos150);
                        break;
            }
            break;
            case 22:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Imacabeos1);
                        break;
                    case 2:
                        texto.setText(R.string.Imacabeos2);
                        break;
                    case 3:
                        texto.setText(R.string.Imacabeos3);
                        break;
                    case 4:
                        texto.setText(R.string.Imacabeos4);
                        break;
                    case 5:
                        texto.setText(R.string.Imacabeos5);
                        break;
                    case 6:
                        texto.setText(R.string.Imacabeos6);
                        break;
                    case 7:
                        texto.setText(R.string.Imacabeos7);
                        break;
                    case 8:
                        texto.setText(R.string.Imacabeos8);
                        break;
                    case 9:
                        texto.setText(R.string.Imacabeos9);
                        break;
                    case 10:
                        texto.setText(R.string.Imacabeos10);
                        break;
                    case 11:
                        texto.setText(R.string.Imacabeos11);
                        break;
                    case 12:
                        texto.setText(R.string.Imacabeos12);
                        break;
                    case 13:
                        texto.setText(R.string.Imacabeos13);
                        break;
                    case 14:
                        texto.setText(R.string.Imacabeos14);
                        break;
                    case 15:
                        texto.setText(R.string.Imacabeos15);
                        break;
                    case 16:
                        texto.setText(R.string.Imacabeos16);
                        break;
                }

                break;
            case 23:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IImacabeos1);
                        break;
                    case 2:
                        texto.setText(R.string.IImacabeos2);
                        break;
                    case 3:
                        texto.setText(R.string.IImacabeos3);
                        break;
                    case 4:
                        texto.setText(R.string.IImacabeos4);
                        break;
                    case 5:
                        texto.setText(R.string.IImacabeos5);
                        break;
                    case 6:
                        texto.setText(R.string.IImacabeos6);
                        break;
                    case 7:
                        texto.setText(R.string.IImacabeos7);
                        break;
                    case 8:
                        texto.setText(R.string.IImacabeos8);
                        break;
                    case 9:
                        texto.setText(R.string.IImacabeos9);
                        break;
                    case 10:
                        texto.setText(R.string.IImacabeos10);
                        break;
                    case 11:
                        texto.setText(R.string.IImacabeos11);
                        break;
                    case 12:
                        texto.setText(R.string.IImacabeos12);
                        break;
                    case 13:
                        texto.setText(R.string.IImacabeos13);
                        break;
                    case 14:
                        texto.setText(R.string.IImacabeos14);
                        break;
                    case 15:
                        texto.setText(R.string.IImacabeos15);
                        break;
                }

                break;
            case 24:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.proverbios1);
                        break;
                    case 2:
                        texto.setText(R.string.proverbios2);
                        break;
                    case 3:
                        texto.setText(R.string.proverbios3);
                        break;
                    case 4:
                        texto.setText(R.string.proverbios4);
                        break;
                    case 5:
                        texto.setText(R.string.proverbios5);
                        break;
                    case 6:
                        texto.setText(R.string.proverbios6);
                        break;
                    case 7:
                        texto.setText(R.string.proverbios7);
                        break;
                    case 8:
                        texto.setText(R.string.proverbios8);
                        break;
                    case 9:
                        texto.setText(R.string.proverbios9);
                        break;
                    case 10:
                        texto.setText(R.string.proverbios10);
                        break;
                    case 11:
                        texto.setText(R.string.proverbios11);
                        break;
                    case 12:
                        texto.setText(R.string.proverbios12);
                        break;
                    case 13:
                        texto.setText(R.string.proverbios13);
                        break;
                    case 14:
                        texto.setText(R.string.proverbios14);
                        break;
                    case 15:
                        texto.setText(R.string.proverbios15);
                        break;
                    case 16:
                        texto.setText(R.string.proverbios16);
                        break;
                    case 17:
                        texto.setText(R.string.proverbios17);
                        break;
                    case 18:
                        texto.setText(R.string.proverbios18);
                        break;
                    case 19:
                        texto.setText(R.string.proverbios19);
                        break;
                    case 20:
                        texto.setText(R.string.proverbios20);
                        break;
                    case 21:
                        texto.setText(R.string.proverbios21);
                        break;
                    case 22:
                        texto.setText(R.string.proverbios22);
                        break;
                    case 23:
                        texto.setText(R.string.proverbios23);
                        break;
                    case 24:
                        texto.setText(R.string.proverbios24);
                        break;
                    case 25:
                        texto.setText(R.string.proverbios25);
                        break;
                    case 26:
                        texto.setText(R.string.proverbios26);
                        break;
                    case 27:
                        texto.setText(R.string.proverbios27);
                        break;
                    case 28:
                        texto.setText(R.string.proverbios28);
                        break;
                    case 29:
                        texto.setText(R.string.proverbios29);
                        break;
                    case 30:
                        texto.setText(R.string.proverbios30);
                        break;
                    case 31:
                        texto.setText(R.string.proverbios31);
                        break;

                }
                break;
            case 25:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.eclesiastes1);
                        break;
                    case 2:
                        texto.setText(R.string.eclesiastes2);
                        break;
                    case 3:
                        texto.setText(R.string.eclesiastes3);
                        break;
                    case 4:
                        texto.setText(R.string.eclesiastes4);
                        break;
                    case 5:
                        texto.setText(R.string.eclesiastes5);
                        break;
                    case 6:
                        texto.setText(R.string.eclesiastes6);
                        break;
                    case 7:
                        texto.setText(R.string.eclesiastes7);
                        break;
                    case 8:
                        texto.setText(R.string.eclesiastes8);
                        break;
                    case 9:
                        texto.setText(R.string.eclesiastes9);
                        break;
                    case 10:
                        texto.setText(R.string.eclesiastes10);
                        break;
                    case 11:
                        texto.setText(R.string.eclesiastes11);
                        break;
                    case 12:
                        texto.setText(R.string.eclesiastes12);
                        break;
                }

                break;
            case 26:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.cantares1);
                        break;
                    case 2:
                        texto.setText(R.string.cantares2);
                        break;
                    case 3:
                        texto.setText(R.string.cantares3);
                        break;
                    case 4:
                        texto.setText(R.string.cantares4);
                        break;
                    case 5:
                        texto.setText(R.string.cantares5);
                        break;
                    case 6:
                        texto.setText(R.string.cantares6);
                        break;
                    case 7:
                        texto.setText(R.string.cantares7);
                        break;
                    case 8:
                        texto.setText(R.string.cantares8);
                        break;
                }

                break;
            case 27:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.sabduria1);
                        break;
                    case 2:
                        texto.setText(R.string.sabduria2);
                        break;
                    case 3:
                        texto.setText(R.string.sabduria3);
                        break;
                    case 4:
                        texto.setText(R.string.sabduria4);
                        break;
                    case 5:
                        texto.setText(R.string.sabduria5);
                        break;
                    case 6:
                        texto.setText(R.string.sabduria6);
                        break;
                    case 7:
                        texto.setText(R.string.sabduria7);
                        break;
                    case 8:
                        texto.setText(R.string.sabduria8);
                        break;
                    case 9:
                        texto.setText(R.string.sabduria9);
                        break;
                    case 10:
                        texto.setText(R.string.sabduria10);
                        break;
                    case 11:
                        texto.setText(R.string.sabduria11);
                        break;
                    case 12:
                        texto.setText(R.string.sabduria12);
                        break;
                    case 13:
                        texto.setText(R.string.sabduria13);
                        break;
                    case 14:
                        texto.setText(R.string.sabduria14);
                        break;
                    case 15:
                        texto.setText(R.string.sabduria15);
                        break;
                    case 16:
                        texto.setText(R.string.sabduria16);
                        break;
                    case 17:
                        texto.setText(R.string.sabduria17);
                        break;
                    case 18:
                        texto.setText(R.string.sabduria18);
                        break;
                    case 19:
                        texto.setText(R.string.sabduria19);
                        break;
                }
                break;
            case 28:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.eclesiastico1);
                        break;
                    case 2:
                        texto.setText(R.string.eclesiastico2);
                        break;
                    case 3:
                        texto.setText(R.string.eclesiastico3);
                        break;
                    case 4:
                        texto.setText(R.string.eclesiastico4);
                        break;
                    case 5:
                        texto.setText(R.string.eclesiastico5);
                        break;
                    case 6:
                        texto.setText(R.string.eclesiastico6);
                        break;
                    case 7:
                        texto.setText(R.string.eclesiastico7);
                        break;
                    case 8:
                        texto.setText(R.string.eclesiastico8);
                        break;
                    case 9:
                        texto.setText(R.string.eclesiastico9);
                        break;
                    case 10:
                        texto.setText(R.string.eclesiastico10);
                        break;
                    case 11:
                        texto.setText(R.string.eclesiastico11);
                        break;
                    case 12:
                        texto.setText(R.string.eclesiastico12);
                        break;
                    case 13:
                        texto.setText(R.string.eclesiastico13);
                        break;
                    case 14:
                        texto.setText(R.string.eclesiastico14);
                        break;
                    case 15:
                        texto.setText(R.string.eclesiastico15);
                        break;
                    case 16:
                        texto.setText(R.string.eclesiastico16);
                        break;
                    case 17:
                        texto.setText(R.string.eclesiastico17);
                        break;
                    case 18:
                        texto.setText(R.string.eclesiastico18);
                        break;
                    case 19:
                        texto.setText(R.string.eclesiastico19);
                        break;
                    case 20:
                        texto.setText(R.string.eclesiastico20);
                        break;
                    case 21:
                        texto.setText(R.string.eclesiastico21);
                        break;
                    case 22:
                        texto.setText(R.string.eclesiastico22);
                        break;
                    case 23:
                        texto.setText(R.string.eclesiastico23);
                        break;
                    case 24:
                        texto.setText(R.string.eclesiastico24);
                        break;
                    case 25:
                        texto.setText(R.string.eclesiastico25);
                        break;
                    case 26:
                        texto.setText(R.string.eclesiastico26);
                        break;
                    case 27:
                        texto.setText(R.string.eclesiastico27);
                        break;
                    case 28:
                        texto.setText(R.string.eclesiastico28);
                        break;
                    case 29:
                        texto.setText(R.string.eclesiastico29);
                        break;
                    case 30:
                        texto.setText(R.string.eclesiastico30);
                        break;
                    case 31:
                        texto.setText(R.string.eclesiastico31);
                        break;
                    case 32:
                        texto.setText(R.string.eclesiastico32);
                        break;
                    case 33:
                        texto.setText(R.string.eclesiastico33);
                        break;
                    case 34:
                        texto.setText(R.string.eclesiastico34);
                        break;
                    case 35:
                        texto.setText(R.string.eclesiastico35);
                        break;
                    case 36:
                        texto.setText(R.string.eclesiastico36);
                        break;
                    case 37:
                        texto.setText(R.string.eclesiastico37);
                        break;
                    case 38:
                        texto.setText(R.string.eclesiastico38);
                        break;
                    case 39:
                        texto.setText(R.string.eclesiastico39);
                        break;
                    case 40:
                        texto.setText(R.string.eclesiastico40);
                        break;
                    case 41:
                        texto.setText(R.string.eclesiastico41);
                        break;
                    case 42:
                        texto.setText(R.string.eclesiastico42);
                        break;
                    case 43:
                        texto.setText(R.string.eclesiastico43);
                        break;
                    case 44:
                        texto.setText(R.string.eclesiastico44);
                        break;
                    case 45:
                        texto.setText(R.string.eclesiastico45);
                        break;
                    case 46:
                        texto.setText(R.string.eclesiastico46);
                        break;
                    case 47:
                        texto.setText(R.string.eclesiastico47);
                        break;
                    case 48:
                        texto.setText(R.string.eclesiastico48);
                        break;
                    case 49:
                        texto.setText(R.string.eclesiastico49);
                        break;
                    case 50:
                        texto.setText(R.string.eclesiastico50);
                        break;
                    case 51:
                        texto.setText(R.string.eclesiastico51);
                        break;
                }
                break;
            case 29:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.isaias1);
                        break;
                    case 2:
                        texto.setText(R.string.isaias2);
                        break;
                    case 3:
                        texto.setText(R.string.isaias3);
                        break;
                    case 4:
                        texto.setText(R.string.isaias4);
                        break;
                    case 5:
                        texto.setText(R.string.isaias5);
                        break;
                    case 6:
                        texto.setText(R.string.isaias6);
                        break;
                    case 7:
                        texto.setText(R.string.isaias7);
                        break;
                    case 8:
                        texto.setText(R.string.isaias8);
                        break;
                    case 9:
                        texto.setText(R.string.isaias9);
                        break;
                    case 10:
                        texto.setText(R.string.isaias10);
                        break;
                    case 11:
                        texto.setText(R.string.isaias11);
                        break;
                    case 12:
                        texto.setText(R.string.isaias12);
                        break;
                    case 13:
                        texto.setText(R.string.isaias13);
                        break;
                    case 14:
                        texto.setText(R.string.isaias14);
                        break;
                    case 15:
                        texto.setText(R.string.isaias15);
                        break;
                    case 16:
                        texto.setText(R.string.isaias16);
                        break;
                    case 17:
                        texto.setText(R.string.isaias17);
                        break;
                    case 18:
                        texto.setText(R.string.isaias18);
                        break;
                    case 19:
                        texto.setText(R.string.isaias19);
                        break;
                    case 20:
                        texto.setText(R.string.isaias20);
                        break;
                    case 21:
                        texto.setText(R.string.isaias21);
                        break;
                    case 22:
                        texto.setText(R.string.isaias22);
                        break;
                    case 23:
                        texto.setText(R.string.isaias23);
                        break;
                    case 24:
                        texto.setText(R.string.isaias24);
                        break;
                    case 25:
                        texto.setText(R.string.isaias25);
                        break;
                    case 26:
                        texto.setText(R.string.isaias26);
                        break;
                    case 27:
                        texto.setText(R.string.isaias27);
                        break;
                    case 28:
                        texto.setText(R.string.isaias28);
                        break;
                    case 29:
                        texto.setText(R.string.isaias29);
                        break;
                    case 30:
                        texto.setText(R.string.isaias30);
                        break;
                    case 31:
                        texto.setText(R.string.isaias31);
                        break;
                    case 32:
                        texto.setText(R.string.isaias32);
                        break;
                    case 33:
                        texto.setText(R.string.isaias33);
                        break;
                    case 34:
                        texto.setText(R.string.isaias34);
                        break;
                    case 35:
                        texto.setText(R.string.isaias35);
                        break;
                    case 36:
                        texto.setText(R.string.isaias36);
                        break;
                    case 37:
                        texto.setText(R.string.isaias37);
                        break;
                    case 38:
                        texto.setText(R.string.isaias38);
                        break;
                    case 39:
                        texto.setText(R.string.isaias39);
                        break;
                    case 40:
                        texto.setText(R.string.isaias40);
                        break;
                    case 41:
                        texto.setText(R.string.isaias41);
                        break;
                    case 42:
                        texto.setText(R.string.isaias42);
                        break;
                    case 43:
                        texto.setText(R.string.isaias43);
                        break;
                    case 44:
                        texto.setText(R.string.isaias44);
                        break;
                    case 45:
                        texto.setText(R.string.isaias45);
                        break;
                    case 46:
                        texto.setText(R.string.isaias46);
                        break;
                    case 47:
                        texto.setText(R.string.isaias47);
                        break;
                    case 48:
                        texto.setText(R.string.isaias48);
                        break;
                    case 49:
                        texto.setText(R.string.isaias49);
                        break;
                    case 50:
                        texto.setText(R.string.isaias50);
                        break;
                    case 51:
                        texto.setText(R.string.isaias51);
                        break;
                    case 52:
                        texto.setText(R.string.isaias52);
                        break;
                    case 53:
                        texto.setText(R.string.isaias53);
                        break;
                    case 54:
                        texto.setText(R.string.isaias54);
                        break;
                    case 55:
                        texto.setText(R.string.isaias55);
                        break;
                    case 56:
                        texto.setText(R.string.isaias56);
                        break;
                    case 57:
                        texto.setText(R.string.isaias57);
                        break;
                    case 58:
                        texto.setText(R.string.isaias58);
                        break;
                    case 59:
                        texto.setText(R.string.isaias59);
                        break;
                    case 60:
                        texto.setText(R.string.isaias60);
                        break;
                    case 61:
                        texto.setText(R.string.isaias61);
                        break;
                    case 62:
                        texto.setText(R.string.isaias62);
                        break;
                    case 63:
                        texto.setText(R.string.isaias63);
                        break;
                    case 64:
                        texto.setText(R.string.isaias64);
                        break;
                    case 65:
                        texto.setText(R.string.isaias65);
                        break;
                    case 66:
                        texto.setText(R.string.isaias66);
                        break;
                }
                break;
            case 30:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.jeremias1);
                        break;
                    case 2:
                        texto.setText(R.string.jeremias2);
                        break;
                    case 3:
                        texto.setText(R.string.jeremias3);
                        break;
                    case 4:
                        texto.setText(R.string.jeremias4);
                        break;
                    case 5:
                        texto.setText(R.string.jeremias5);
                        break;
                    case 6:
                        texto.setText(R.string.jeremias6);
                        break;
                    case 7:
                        texto.setText(R.string.jeremias7);
                        break;
                    case 8:
                        texto.setText(R.string.jeremias8);
                        break;
                    case 9:
                        texto.setText(R.string.jeremias9);
                        break;
                    case 10:
                        texto.setText(R.string.jeremias10);
                        break;
                    case 11:
                        texto.setText(R.string.jeremias11);
                        break;
                    case 12:
                        texto.setText(R.string.jeremias12);
                        break;
                    case 13:
                        texto.setText(R.string.jeremias13);
                        break;
                    case 14:
                        texto.setText(R.string.jeremias14);
                        break;
                    case 15:
                        texto.setText(R.string.jeremias15);
                        break;
                    case 16:
                        texto.setText(R.string.jeremias16);
                        break;
                    case 17:
                        texto.setText(R.string.jeremias17);
                        break;
                    case 18:
                        texto.setText(R.string.jeremias18);
                        break;
                    case 19:
                        texto.setText(R.string.jeremias19);
                        break;
                    case 20:
                        texto.setText(R.string.jeremias20);
                        break;
                    case 21:
                        texto.setText(R.string.jeremias21);
                        break;
                    case 22:
                        texto.setText(R.string.jeremias22);
                        break;
                    case 23:
                        texto.setText(R.string.jeremias23);
                        break;
                    case 24:
                        texto.setText(R.string.jeremias24);
                        break;
                    case 25:
                        texto.setText(R.string.jeremias25);
                        break;
                    case 26:
                        texto.setText(R.string.jeremias26);
                        break;
                    case 27:
                        texto.setText(R.string.jeremias27);
                        break;
                    case 28:
                        texto.setText(R.string.jeremias28);
                        break;
                    case 29:
                        texto.setText(R.string.jeremias29);
                        break;
                    case 30:
                        texto.setText(R.string.jeremias30);
                        break;
                    case 31:
                        texto.setText(R.string.jeremias31);
                        break;
                    case 32:
                        texto.setText(R.string.jeremias32);
                        break;
                    case 33:
                        texto.setText(R.string.jeremias33);
                        break;
                    case 34:
                        texto.setText(R.string.jeremias34);
                        break;
                    case 35:
                        texto.setText(R.string.jeremias35);
                        break;
                    case 36:
                        texto.setText(R.string.jeremias36);
                        break;
                    case 37:
                        texto.setText(R.string.jeremias37);
                        break;
                    case 38:
                        texto.setText(R.string.jeremias38);
                        break;
                    case 39:
                        texto.setText(R.string.jeremias39);
                        break;
                    case 40:
                        texto.setText(R.string.jeremias40);
                        break;
                    case 41:
                        texto.setText(R.string.jeremias41);
                        break;
                    case 42:
                        texto.setText(R.string.jeremias42);
                        break;
                    case 43:
                        texto.setText(R.string.jeremias43);
                        break;
                    case 44:
                        texto.setText(R.string.jeremias44);
                        break;
                    case 45:
                        texto.setText(R.string.jeremias45);
                        break;
                    case 46:
                        texto.setText(R.string.jeremias46);
                        break;
                    case 47:
                        texto.setText(R.string.jeremias47);
                        break;
                    case 48:
                        texto.setText(R.string.jeremias48);
                        break;
                    case 49:
                        texto.setText(R.string.jeremias49);
                        break;
                    case 50:
                        texto.setText(R.string.jeremias50);
                        break;
                    case 51:
                        texto.setText(R.string.jeremias51);
                        break;
                    case 52:
                        texto.setText(R.string.jeremias52);
                        break;
                }
                break;
            case 31:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.lamentaciones1);
                        break;
                    case 2:
                        texto.setText(R.string.lamentaciones2);
                        break;
                    case 3:
                        texto.setText(R.string.lamentaciones3);
                        break;
                    case 4:
                        texto.setText(R.string.lamentaciones4);
                        break;
                    case 5:
                        texto.setText(R.string.lamentaciones5);
                        break;
                }

                break;
            case 32:
                switch (capitulo) {
                    case 1:

                        break;
                    case 2:
                        texto.setText("hola2");
                        break;
                    case 3:
                        texto.setText("hola3");
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case 17:
                        break;
                    case 18:
                        break;
                    case 19:
                        break;
                    case 20:
                        break;
                    case 21:
                        break;
                    case 22:
                        break;
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        break;
                    case 26:
                        break;
                    case 27:
                        break;
                    case 28:
                        break;
                    case 29:
                        break;
                    case 30:
                        break;
                    case 31:
                        break;
                    case 32:
                        break;
                    case 33:
                        break;
                    case 34:
                        break;
                    case 35:
                        break;
                    case 36:
                        break;
                    case 37:
                        break;
                    case 38:
                        break;
                    case 39:
                        break;
                    case 40:
                        break;
                    case 41:
                        break;
                    case 42:
                        break;
                    case 43:
                        break;
                    case 44:
                        break;
                    case 45:
                        break;
                    case 46:
                        break;
                    case 47:
                        break;
                    case 48:
                        break;
                }

                break;
            case 33:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.daniel1);
                        break;
                    case 2:
                        texto.setText(R.string.daniel2);
                        break;
                    case 3:
                        texto.setText(R.string.daniel3);
                        break;
                    case 4:
                        texto.setText(R.string.daniel4);
                        break;
                    case 5:
                        texto.setText(R.string.daniel5);
                        break;
                    case 6:
                        texto.setText(R.string.daniel6);
                        break;
                    case 7:
                        texto.setText(R.string.daniel7);
                        break;
                    case 8:
                        texto.setText(R.string.daniel8);
                        break;
                    case 9:
                        texto.setText(R.string.daniel9);
                        break;
                    case 10:
                        texto.setText(R.string.daniel10);
                        break;
                    case 11:
                        texto.setText(R.string.daniel11);
                        break;
                    case 12:
                        texto.setText(R.string.daniel12);
                        break;
                }
                break;
            case 34:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.oseas1);
                        break;
                    case 2:
                        texto.setText(R.string.oseas2);
                        break;
                    case 3:
                        texto.setText(R.string.oseas3);
                        break;
                    case 4:
                        texto.setText(R.string.oseas4);
                        break;
                    case 5:
                        texto.setText(R.string.oseas5);
                        break;
                    case 6:
                        texto.setText(R.string.oseas6);
                        break;
                    case 7:
                        texto.setText(R.string.oseas7);
                        break;
                    case 8:
                        texto.setText(R.string.oseas8);
                        break;
                    case 9:
                        texto.setText(R.string.oseas9);
                        break;
                    case 10:
                        texto.setText(R.string.oseas10);
                        break;
                    case 11:
                        texto.setText(R.string.oseas11);
                        break;
                    case 12:
                        texto.setText(R.string.oseas12);
                        break;
                    case 13:
                        texto.setText(R.string.oseas13);
                        break;
                    case 14:
                        texto.setText(R.string.oseas14);
                        break;
                }
                break;
            case 35:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.joel1);
                        break;
                    case 2:
                        texto.setText(R.string.joel2);
                        break;
                    case 3:
                        texto.setText(R.string.joel3);
                        break;
                }

                break;
            case 36:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Amos1);
                        break;
                    case 2:
                        texto.setText(R.string.Amos2);
                        break;
                    case 3:
                        texto.setText(R.string.Amos3);
                        break;
                    case 4:
                        texto.setText(R.string.Amos4);
                        break;
                    case 5:
                        texto.setText(R.string.Amos5);
                        break;
                    case 6:
                        texto.setText(R.string.Amos6);
                        break;
                    case 7:
                        texto.setText(R.string.Amos7);
                        break;
                    case 8:
                        texto.setText(R.string.Amos8);
                        break;
                    case 9:
                        texto.setText(R.string.Amos9);
                        break;
                }
                break;
            case 37:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Abdias1);
                        break;
                }
                break;
            case 38:
                switch (capitulo){
                    case 1:
                        texto.setText(R.string.jonas1);
                        break;
                    case 2:
                        texto.setText(R.string.jonas2);
                        break;
                    case 3:
                        texto.setText(R.string.jonas3);
                        break;
                    case 4:
                        texto.setText(R.string.jonas4);
                        break;
                }
                break;
            case 39:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.miqueas1);
                        break;
                    case 2:
                        texto.setText(R.string.miqueas2);
                        break;
                    case 3:
                        texto.setText(R.string.miqueas3);
                        break;
                    case 4:
                        texto.setText(R.string.miqueas4);
                        break;
                    case 5:
                        texto.setText(R.string.miqueas5);
                        break;
                    case 6:
                        texto.setText(R.string.miqueas6);
                        break;
                    case 7:
                        texto.setText(R.string.miqueas7);
                        break;
                }
                break;
            case 40:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.nahum1);
                        break;
                    case 2:
                        texto.setText(R.string.nahum2);
                        break;
                    case 3:
                        texto.setText(R.string.nahum3);
                        break;
                }
                break;
            case 41:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Habacuc1);
                        break;
                    case 2:
                        texto.setText(R.string.Habacuc2);
                        break;
                    case 3:
                        texto.setText(R.string.Habacuc3);
                        break;
                }
                break;
            case 42:
                switch (capitulo) {
                    case 1:

                        break;
                    case 2:
                        texto.setText("hola2");
                        break;
                    case 3:
                        texto.setText("hola3");
                        break;
                }
                break;
            case 43:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.sofonias1);
                        break;
                    case 2:
                        texto.setText(R.string.sofonias2);
                        break;
                    case 3:
                        texto.setText(R.string.sofonias3);
                        break;
                }
                break;
            case 44:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Hageo1);
                        break;
                    case 2:
                        texto.setText(R.string.Hageo2);
                        break;
                }
                break;
            case 45:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.zacarias1);
                        break;
                    case 2:
                        texto.setText(R.string.zacarias2);
                        break;
                    case 3:
                        texto.setText(R.string.zacarias3);
                        break;
                    case 4:
                        texto.setText(R.string.zacarias4);
                        break;
                    case 5:
                        texto.setText(R.string.zacarias5);
                        break;
                    case 6:
                        texto.setText(R.string.zacarias6);
                        break;
                    case 7:
                        texto.setText(R.string.zacarias7);
                        break;
                    case 8:
                        texto.setText(R.string.zacarias8);
                        break;
                    case 9:
                        texto.setText(R.string.zacarias9);
                        break;
                    case 10:
                        texto.setText(R.string.zacarias10);
                        break;
                    case 11:
                        texto.setText(R.string.zacarias11);
                        break;
                    case 12:
                        texto.setText(R.string.zacarias12);
                        break;
                    case 13:
                        texto.setText(R.string.zacarias13);
                        break;
                    case 14:
                        texto.setText(R.string.zacarias14);
                        break;
                }
                break;
            case 46:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.malaquias1);
                        break;
                    case 2:
                        texto.setText(R.string.malaquias2);
                        break;
                    case 3:
                        texto.setText(R.string.malaquias3);
                        break;
                    case 4:
                        texto.setText(R.string.malaquias4);
                        break;
                }
                break;
            case 47:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.mateo1);
                        break;
                    case 2:
                        texto.setText(R.string.mateo2);
                        break;
                    case 3:
                        texto.setText(R.string.mateo3);
                        break;
                    case 4:
                        texto.setText(R.string.mateo4);
                        break;
                    case 5:
                        texto.setText(R.string.mateo5);
                        break;
                    case 6:
                        texto.setText(R.string.mateo6);
                        break;
                    case 7:
                        texto.setText(R.string.mateo7);
                        break;
                    case 8:
                        texto.setText(R.string.mateo8);
                        break;
                    case 9:
                        texto.setText(R.string.mateo9);
                        break;
                    case 10:
                        texto.setText(R.string.mateo10);
                        break;
                    case 11:
                        texto.setText(R.string.mateo11);
                        break;
                    case 12:
                        texto.setText(R.string.mateo12);
                        break;
                    case 13:
                        texto.setText(R.string.mateo13);
                        break;
                    case 14:
                        texto.setText(R.string.mateo14);
                        break;
                    case 15:
                        texto.setText(R.string.mateo15);
                        break;
                    case 16:
                        texto.setText(R.string.mateo16);
                        break;
                    case 17:
                        texto.setText(R.string.mateo17);
                        break;
                    case 18:
                        texto.setText(R.string.mateo18);
                        break;
                    case 19:
                        texto.setText(R.string.mateo19);
                        break;
                    case 20:
                        texto.setText(R.string.mateo20);
                        break;
                    case 21:
                        texto.setText(R.string.mateo21);
                        break;
                    case 22:
                        texto.setText(R.string.mateo22);
                        break;
                    case 23:
                        texto.setText(R.string.mateo23);
                        break;
                    case 24:
                        texto.setText(R.string.mateo24);
                        break;
                    case 25:
                        texto.setText(R.string.mateo25);
                        break;
                    case 26:
                        texto.setText(R.string.mateo26);
                        break;
                    case 27:
                        texto.setText(R.string.mateo27);
                        break;
                    case 28:
                        texto.setText(R.string.mateo28);
                        break;
                }
                break;
            case 48:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.marcos1);
                        break;
                    case 2:
                        texto.setText(R.string.marcos2);
                        break;
                    case 3:
                        texto.setText(R.string.marcos3);
                        break;
                    case 4:
                        texto.setText(R.string.marcos4);
                        break;
                    case 5:
                        texto.setText(R.string.marcos5);
                        break;
                    case 6:
                        texto.setText(R.string.marcos6);
                        break;
                    case 7:
                        texto.setText(R.string.marcos7);
                        break;
                    case 8:
                        texto.setText(R.string.marcos8);
                        break;
                    case 9:
                        texto.setText(R.string.marcos9);
                        break;
                    case 10:
                        texto.setText(R.string.marcos10);
                        break;
                    case 11:
                        texto.setText(R.string.marcos11);
                        break;
                    case 12:
                        texto.setText(R.string.marcos12);
                        break;
                    case 13:
                        texto.setText(R.string.marcos13);
                        break;
                    case 14:
                        texto.setText(R.string.marcos14);
                        break;
                    case 15:
                        texto.setText(R.string.marcos15);
                        break;
                    case 16:
                        texto.setText(R.string.marcos16);
                        break;
                }
                break;
            case 49:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.lucas1);
                        break;
                    case 2:
                        texto.setText(R.string.lucas2);
                        break;
                    case 3:
                        texto.setText(R.string.lucas3);
                        break;
                    case 4:
                        texto.setText(R.string.lucas4);
                        break;
                    case 5:
                        texto.setText(R.string.lucas5);
                        break;
                    case 6:
                        texto.setText(R.string.lucas6);
                        break;
                    case 7:
                        texto.setText(R.string.lucas7);
                        break;
                    case 8:
                        texto.setText(R.string.lucas8);
                        break;
                    case 9:
                        texto.setText(R.string.lucas9);
                        break;
                    case 10:
                        texto.setText(R.string.lucas10);
                        break;
                    case 11:
                        texto.setText(R.string.lucas11);
                        break;
                    case 12:
                        texto.setText(R.string.lucas12);
                        break;
                    case 13:
                        texto.setText(R.string.lucas13);
                        break;
                    case 14:
                        texto.setText(R.string.lucas14);
                        break;
                    case 15:
                        texto.setText(R.string.lucas15);
                        break;
                    case 16:
                        texto.setText(R.string.lucas16);
                        break;
                    case 17:
                        texto.setText(R.string.lucas17);
                        break;
                    case 18:
                        texto.setText(R.string.lucas18);
                        break;
                    case 19:
                        texto.setText(R.string.lucas19);
                        break;
                    case 20:
                        texto.setText(R.string.lucas20);
                        break;
                    case 21:
                        texto.setText(R.string.lucas21);
                        break;
                    case 22:
                        texto.setText(R.string.lucas22);
                        break;
                    case 23:
                        texto.setText(R.string.lucas23);
                        break;
                    case 24:
                        texto.setText(R.string.lucas24);
                        break;
                }

                break;
            case 50:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.juan1);
                        break;
                    case 2:
                        texto.setText(R.string.juan2);
                        break;
                    case 3:
                        texto.setText(R.string.juan3);
                        break;
                    case 4:
                        texto.setText(R.string.juan4);
                        break;
                    case 5:
                        texto.setText(R.string.juan5);
                        break;
                    case 6:
                        texto.setText(R.string.juan6);
                        break;
                    case 7:
                        texto.setText(R.string.juan7);
                        break;
                    case 8:
                        texto.setText(R.string.juan8);
                        break;
                    case 9:
                        texto.setText(R.string.juan9);
                        break;
                    case 10:
                        texto.setText(R.string.juan10);
                        break;
                    case 11:
                        texto.setText(R.string.juan11);
                        break;
                    case 12:
                        texto.setText(R.string.juan12);
                        break;
                    case 13:
                        texto.setText(R.string.juan13);
                        break;
                    case 14:
                        texto.setText(R.string.juan14);
                        break;
                    case 15:
                        texto.setText(R.string.juan15);
                        break;
                    case 16:
                        texto.setText(R.string.juan16);
                        break;
                    case 17:
                        texto.setText(R.string.juan17);
                        break;
                    case 18:
                        texto.setText(R.string.juan18);
                        break;
                    case 19:
                        texto.setText(R.string.juan19);
                        break;
                    case 20:
                        texto.setText(R.string.juan20);
                        break;
                    case 21:
                        texto.setText(R.string.juan21);
                        break;
                }
                break;
            case 51:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Hechos1);
                        break;
                    case 2:
                        texto.setText(R.string.Hechos2);
                        break;
                    case 3:
                        texto.setText(R.string.Hechos3);
                        break;
                    case 4:
                        texto.setText(R.string.Hechos4);
                        break;
                    case 5:
                        texto.setText(R.string.Hechos5);
                        break;
                    case 6:
                        texto.setText(R.string.Hechos6);
                        break;
                    case 7:
                        texto.setText(R.string.Hechos7);
                        break;
                    case 8:
                        texto.setText(R.string.Hechos8);
                        break;
                    case 9:
                        texto.setText(R.string.Hechos9);
                        break;
                    case 10:
                        texto.setText(R.string.Hechos10);
                        break;
                    case 11:
                        texto.setText(R.string.Hechos11);
                        break;
                    case 12:
                        texto.setText(R.string.Hechos12);
                        break;
                    case 13:
                        texto.setText(R.string.Hechos13);
                        break;
                    case 14:
                        texto.setText(R.string.Hechos14);
                        break;
                    case 15:
                        texto.setText(R.string.Hechos15);
                        break;
                    case 16:
                        texto.setText(R.string.Hechos16);
                        break;
                    case 17:
                        texto.setText(R.string.Hechos17);
                        break;
                    case 18:
                        texto.setText(R.string.Hechos18);
                        break;
                    case 19:
                        texto.setText(R.string.Hechos19);
                        break;
                    case 20:
                        texto.setText(R.string.Hechos20);
                        break;
                    case 21:
                        texto.setText(R.string.Hechos21);
                        break;
                    case 22:
                        texto.setText(R.string.Hechos22);
                        break;
                    case 23:
                        texto.setText(R.string.Hechos23);
                        break;
                    case 24:
                        texto.setText(R.string.Hechos24);
                        break;
                    case 25:
                        texto.setText(R.string.Hechos25);
                        break;
                    case 26:
                        texto.setText(R.string.Hechos26);
                        break;
                    case 27:
                        texto.setText(R.string.Hechos27);
                        break;
                    case 28:
                        texto.setText(R.string.Hechos28);
                        break;
                }
                break;
            case 52:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.romanos1);
                        break;
                    case 2:
                        texto.setText(R.string.romanos2);
                        break;
                    case 3:
                        texto.setText(R.string.romanos3);
                        break;
                    case 4:
                        texto.setText(R.string.romanos4);
                        break;
                    case 5:
                        texto.setText(R.string.romanos5);
                        break;
                    case 6:
                        texto.setText(R.string.romanos6);
                        break;
                    case 7:
                        texto.setText(R.string.romanos7);
                        break;
                    case 8:
                        texto.setText(R.string.romanos8);
                        break;
                    case 9:
                        texto.setText(R.string.romanos9);
                        break;
                    case 10:
                        texto.setText(R.string.romanos10);
                        break;
                    case 11:
                        texto.setText(R.string.romanos11);
                        break;
                    case 12:
                        texto.setText(R.string.romanos12);
                        break;
                    case 13:
                        texto.setText(R.string.romanos13);
                        break;
                    case 14:
                        texto.setText(R.string.romanos14);
                        break;
                    case 15:
                        texto.setText(R.string.romanos15);
                        break;
                    case 16:
                        texto.setText(R.string.romanos16);
                        break;
                }
                break;
            case 53:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.ICorintios1);
                        break;
                    case 2:
                        texto.setText(R.string.ICorintios2);
                        break;
                    case 3:
                        texto.setText(R.string.ICorintios3);
                        break;
                    case 4:
                        texto.setText(R.string.ICorintios4);
                        break;
                    case 5:
                        texto.setText(R.string.ICorintios5);
                        break;
                    case 6:
                        texto.setText(R.string.ICorintios6);
                        break;
                    case 7:
                        texto.setText(R.string.ICorintios7);
                        break;
                    case 8:
                        texto.setText(R.string.ICorintios8);
                        break;
                    case 9:
                        texto.setText(R.string.ICorintios9);
                        break;
                    case 10:
                        texto.setText(R.string.ICorintios10);
                        break;
                    case 11:
                        texto.setText(R.string.ICorintios11);
                        break;
                    case 12:
                        texto.setText(R.string.ICorintios12);
                        break;
                    case 13:
                        texto.setText(R.string.ICorintios13);
                        break;
                    case 14:
                        texto.setText(R.string.ICorintios14);
                        break;
                    case 15:
                        texto.setText(R.string.ICorintios15);
                        break;
                    case 16:
                        texto.setText(R.string.ICorintios16);
                        break;
                }

                break;
            case 54:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IICorintios1);
                        break;
                    case 2:
                        texto.setText(R.string.IICorintios2);
                        break;
                    case 3:
                        texto.setText(R.string.IICorintios3);
                        break;
                    case 4:
                        texto.setText(R.string.IICorintios4);
                        break;
                    case 5:
                        texto.setText(R.string.IICorintios5);
                        break;
                    case 6:
                        texto.setText(R.string.IICorintios6);
                        break;
                    case 7:
                        texto.setText(R.string.IICorintios7);
                        break;
                    case 8:
                        texto.setText(R.string.IICorintios8);
                        break;
                    case 9:
                        texto.setText(R.string.IICorintios9);
                        break;
                    case 10:
                        texto.setText(R.string.IICorintios10);
                        break;
                    case 11:
                        texto.setText(R.string.IICorintios11);
                        break;
                    case 12:
                        texto.setText(R.string.IICorintios12);
                        break;
                    case 13:
                        texto.setText(R.string.IICorintios13);
                        break;
                }

                break;
            case 55:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.galatas1);
                        break;
                    case 2:
                        texto.setText(R.string.galatas2);
                        break;
                    case 3:
                        texto.setText(R.string.galatas3);
                        break;
                    case 4:
                        texto.setText(R.string.galatas4);
                        break;
                    case 5:
                        texto.setText(R.string.galatas5);
                        break;
                    case 6:
                        texto.setText(R.string.galatas6);
                        break;
                }
                break;
            case 56:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.efesios1);
                        break;
                    case 2:
                        texto.setText(R.string.efesios2);
                        break;
                    case 3:
                        texto.setText(R.string.efesios3);
                        break;
                    case 4:
                        texto.setText(R.string.efesios4);
                        break;
                    case 5:
                        texto.setText(R.string.efesios5);
                        break;
                    case 6:
                        texto.setText(R.string.efesios6);
                        break;
                }
                break;
            case 57:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.filipenses1);
                        break;
                    case 2:
                        texto.setText(R.string.filipenses2);
                        break;
                    case 3:
                        texto.setText(R.string.filipenses3);
                        break;
                    case 4:
                        texto.setText(R.string.filipenses4);
                        break;
                }

                break;
            case 58:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Colosenses1);
                        break;
                    case 2:
                        texto.setText(R.string.Colosenses2);
                        break;
                    case 3:
                        texto.setText(R.string.Colosenses3);
                        break;
                    case 4:
                        texto.setText(R.string.Colosenses4);
                        break;
                }
                break;
            case 59:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.ITesalonicenses1);
                        break;
                    case 2:
                        texto.setText(R.string.ITesalonicenses2);
                        break;
                    case 3:
                        texto.setText(R.string.ITesalonicenses3);
                        break;
                    case 4:
                        texto.setText(R.string.ITesalonicenses4);
                        break;
                    case 5:
                        texto.setText(R.string.ITesalonicenses5);
                        break;
                }

                break;
            case 60:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IITesalonicenses1);
                        break;
                    case 2:
                        texto.setText(R.string.IITesalonicenses2);
                        break;
                    case 3:
                        texto.setText(R.string.IITesalonicenses3);
                        break;
                }

                break;
            case 61:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Itimoteo1);
                        break;
                    case 2:
                        texto.setText(R.string.Itimoteo2);
                        break;
                    case 3:
                        texto.setText(R.string.Itimoteo3);
                        break;
                    case 4:
                        texto.setText(R.string.Itimoteo4);
                        break;
                    case 5:
                        texto.setText(R.string.Itimoteo5);
                        break;
                    case 6:
                        texto.setText(R.string.Itimoteo6);
                        break;
                }

                break;
            case 62:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IItimoteo1);

                        break;
                    case 2:
                        texto.setText(R.string.IItimoteo2);
                        break;
                    case 3:
                        texto.setText(R.string.IItimoteo3);
                        break;
                    case 4:
                        texto.setText(R.string.IItimoteo4);
                        break;
                }

                break;
            case 63:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.tito1);
                        break;
                    case 2:
                        texto.setText(R.string.tito2);
                        break;
                    case 3:
                        texto.setText(R.string.tito3);
                        break;
                }

                break;
            case 64:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.filemon1);
                        break;
                }
                break;
            case 65:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.hebreos1);
                        break;
                    case 2:
                        texto.setText(R.string.hebreos2);
                        break;
                    case 3:
                        texto.setText(R.string.hebreos3);
                        break;
                    case 4:
                        texto.setText(R.string.hebreos4);
                        break;
                    case 5:
                        texto.setText(R.string.hebreos5);
                        break;
                    case 6:
                        texto.setText(R.string.hebreos6);
                        break;
                    case 7:
                        texto.setText(R.string.hebreos7);
                        break;
                    case 8:
                        texto.setText(R.string.hebreos8);
                        break;
                    case 9:
                        texto.setText(R.string.hebreos9);
                        break;
                    case 10:
                        texto.setText(R.string.hebreos10);
                        break;
                    case 11:
                        texto.setText(R.string.hebreos11);
                        break;
                    case 12:
                        texto.setText(R.string.hebreos12);
                        break;
                    case 13:
                        texto.setText(R.string.hebreos13);
                        break;
                }
                break;
            case 66:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.santiago1);

                        break;
                    case 2:
                        texto.setText(R.string.santiago2);
                        break;
                    case 3:
                        texto.setText(R.string.santiago3);
                        break;
                    case 4:
                        texto.setText(R.string.santiago4);
                        break;
                    case 5:
                        texto.setText(R.string.santiago5);
                        break;
                }

                break;
            case 67:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IPedro1);

                        break;
                    case 2:
                        texto.setText(R.string.IPedro2);
                        break;
                    case 3:
                        texto.setText(R.string.IPedro3);
                        break;
                    case 4:
                        texto.setText(R.string.IPedro4);
                        break;
                    case 5:
                        texto.setText(R.string.IPedro5);
                        break;
                }

                break;
            case 68:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IIPedro1);

                        break;
                    case 2:
                        texto.setText(R.string.IIPedro2);
                        break;
                    case 3:
                        texto.setText(R.string.IIPedro3);
                        break;
                }

                break;
            case 69:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.Ijuan1);

                        break;
                    case 2:
                        texto.setText(R.string.Ijuan2);
                        break;
                    case 3:
                        texto.setText(R.string.Ijuan3);
                        break;
                    case 4:
                        texto.setText(R.string.Ijuan4);
                        break;
                    case 5:
                        texto.setText(R.string.Ijuan5);
                        break;
                }

                break;
            case 70:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IIjuan);
                        break;
                }

                break;
            case 71:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.IIIjuan);

                        break;
                }

                break;
            case 72:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.judas1);
                        break;
                }

                break;
            case 73:
                switch (capitulo) {
                    case 1:
                        texto.setText(R.string.apocalipsis1);
                        break;
                    case 2:
                        texto.setText(R.string.apocalipsis2);
                        break;
                    case 3:
                        texto.setText(R.string.apocalipsis3);
                        break;
                    case 4:
                        texto.setText(R.string.apocalipsis4);
                        break;
                    case 5:
                        texto.setText(R.string.apocalipsis5);
                        break;
                    case 6:
                        texto.setText(R.string.apocalipsis6);
                        break;
                    case 7:
                        texto.setText(R.string.apocalipsis7);
                        break;
                    case 8:
                        texto.setText(R.string.apocalipsis8);
                        break;
                    case 9:
                        texto.setText(R.string.apocalipsis9);
                        break;
                    case 10:
                        texto.setText(R.string.apocalipsis10);
                        break;
                    case 11:
                        texto.setText(R.string.apocalipsis11);
                        break;
                    case 12:
                        texto.setText(R.string.apocalipsis12);
                        break;
                    case 13:
                        texto.setText(R.string.apocalipsis13);
                        break;
                    case 14:
                        texto.setText(R.string.apocalipsis14);
                        break;
                    case 15:
                        texto.setText(R.string.apocalipsis15);
                        break;
                    case 16:
                        texto.setText(R.string.apocalipsis16);
                        break;
                    case 17:
                        texto.setText(R.string.apocalipsis17);
                        break;
                    case 18:
                        texto.setText(R.string.apocalipsis18);
                        break;
                    case 19:
                        texto.setText(R.string.apocalipsis19);
                        break;
                    case 20:
                        texto.setText(R.string.apocalipsis20);
                        break;
                    case 21:
                        texto.setText(R.string.apocalipsis21);
                        break;
                    case 22:
                        texto.setText(R.string.apocalipsis22);
                        break;
                }
        }
    }



}
