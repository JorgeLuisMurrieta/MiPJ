package com.example.yourrem;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.muddzdev.styleabletoast.StyleableToast;

public class Rosario extends AppCompatActivity {
    TextView misterio1, misterio2, misterio3, misterio4, misterio5;
    final Context context = this;
    CardView rosario1, rosario2, rosario3, rosario4, rosario5, rosario6, rosario7, rosario8, rosario9, rosario10, rosario11, rosario12, rosario13, rosario14, rosario15, rosario16, rosario17, rosario18, rosario19, rosario20, rosario21, rosario22, rosario23, rosario24, rosario25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rosario_activity);

        misterio1=(TextView)findViewById(R.id.misterio1);
        misterio2=(TextView)findViewById(R.id.misterio2);
        misterio3=(TextView)findViewById(R.id.misterio3);
        misterio4=(TextView)findViewById(R.id.misterio4);
        misterio5=(TextView)findViewById(R.id.misterio5);

        rosario1=(CardView)findViewById(R.id.c1);
        rosario2=(CardView)findViewById(R.id.c2);
        rosario3=(CardView)findViewById(R.id.c3);
        rosario4=(CardView)findViewById(R.id.c4);
        rosario5=(CardView)findViewById(R.id.c5);
        rosario6=(CardView)findViewById(R.id.c6);
        rosario7=(CardView)findViewById(R.id.c7);
        rosario8=(CardView)findViewById(R.id.c8);
        rosario9=(CardView)findViewById(R.id.c9);
        rosario10=(CardView)findViewById(R.id.c10);
        rosario11=(CardView)findViewById(R.id.c11);
        rosario12=(CardView)findViewById(R.id.c12);
        rosario13=(CardView)findViewById(R.id.c13);
        rosario14=(CardView)findViewById(R.id.c14);
        rosario15=(CardView)findViewById(R.id.c15);
        rosario16=(CardView)findViewById(R.id.c16);
        rosario17=(CardView)findViewById(R.id.c17);
        rosario18=(CardView)findViewById(R.id.c18);
        rosario19=(CardView)findViewById(R.id.c19);
        rosario20=(CardView)findViewById(R.id.c20);
        rosario21=(CardView)findViewById(R.id.c21);
        rosario22=(CardView)findViewById(R.id.c22);
        rosario23=(CardView)findViewById(R.id.c23);
        rosario24=(CardView)findViewById(R.id.c24);
        rosario25=(CardView)findViewById(R.id.c25);


        rosario1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("Espero que puedas completar este rosario.<br><br> Recuerda que puedes pedir ayuda a tus compañeros, si tienes alguna duda.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("T.- Por la señal de la Santa Cruz, de nuestros enemigos, líbranos Señor Dios nuestro. En el nombre del Padre, del Hijo y del Espíritu Santo.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("T.- Abre Señor mis labios, para alabar tu nombre y el de Tu Santa Madre.\n")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("T.- Señor mío, Jesucristo, Dios y hombre verdadero, Creador y redentor mío, por ser tú quien eres y porque te amo sobre todas las cosas, me pesa de todo corazón haberte ofendido. Quiero y propongo firmemente confesarme a su tiempo. Ofrezco mi vida, obras y trabajos en satisfacción de mis pecados. Y confío en que en tu bondad y misericordia infinita, me los perdonarás y me darás la gracia para no volverte a ofender.<br> Amén.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Ven Espíritu Santo, llena los corazones de tus fieles")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("R.- Y enciende en ellos el fuego de tu amor.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Envía tu Espíritu Creador")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("R.- Y renueva la faz de la tierra.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Introducción");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Oh Dios, que has iluminado los corazones de tus hijos con la luz del Espíritu Santo; haznos dóciles a sus inspiraciones para gustar siempre del bien y gozar de su consuelo.<br> Por Cristo nuestro Señor. <br> Amén")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Peticiones");
                alertDialogBuilder.setMessage(Html.fromHtml("Aquí, deberas de decir a favor de quien harás este rosario.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        rosario12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Oracion del decenario");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Padre nuestro que estás en el cielo, santificado sea tu nombre, venga a nosotros tu reino, hágase tu voluntad, así en la tierra como en el cielo.<br> R.- Danos hoy nuestro pan de cada día, perdona nuestras ofensas, así como nosotros perdonamos a los que nos ofenden; no nos dejes caer en tentación y líbranos del mal.<br> G.- Dios te salve María, llena eres de gracia, el Señor es contigo, bendita eres tú entre todas las mujeres, y bendito es el fruto de tu vientre: Jesús<br> R.- Santa María Madre de Dios, ruega por nosotros los pecadores; ahora y en la hora de nuestra muerte.<br>G.- Gloria al Padre, al Hijo y al Espíritu Santo, <br>R.- Como era en un principio, ahora y siempre por los siglos de los siglos.<br>G.- María, Madre de Gracia y Madre de Misericordia,<br>R.- En la vida y en la muerte ampáranos Gran Señora.<br>T.- Oh Jesús mío, perdona nuestros pecados y líbranos del fuego del infierno, lleva al cielo a todas las almas y socorre especialmente a las más necesitadas de tu misericordia. Amén")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        rosario14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Oracion del decenario");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Padre nuestro que estás en el cielo, santificado sea tu nombre, venga a nosotros tu reino, hágase tu voluntad, así en la tierra como en el cielo.<br> R.- Danos hoy nuestro pan de cada día, perdona nuestras ofensas, así como nosotros perdonamos a los que nos ofenden; no nos dejes caer en tentación y líbranos del mal.<br> G.- Dios te salve María, llena eres de gracia, el Señor es contigo, bendita eres tú entre todas las mujeres, y bendito es el fruto de tu vientre: Jesús<br> R.- Santa María Madre de Dios, ruega por nosotros los pecadores; ahora y en la hora de nuestra muerte.<br>G.- Gloria al Padre, al Hijo y al Espíritu Santo, <br>R.- Como era en un principio, ahora y siempre por los siglos de los siglos.<br>G.- María, Madre de Gracia y Madre de Misericordia,<br>R.- En la vida y en la muerte ampáranos Gran Señora.<br>T.- Oh Jesús mío, perdona nuestros pecados y líbranos del fuego del infierno, lleva al cielo a todas las almas y socorre especialmente a las más necesitadas de tu misericordia. Amén")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        rosario16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Oracion del decenario");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Padre nuestro que estás en el cielo, santificado sea tu nombre, venga a nosotros tu reino, hágase tu voluntad, así en la tierra como en el cielo.<br> R.- Danos hoy nuestro pan de cada día, perdona nuestras ofensas, así como nosotros perdonamos a los que nos ofenden; no nos dejes caer en tentación y líbranos del mal.<br> G.- Dios te salve María, llena eres de gracia, el Señor es contigo, bendita eres tú entre todas las mujeres, y bendito es el fruto de tu vientre: Jesús<br> R.- Santa María Madre de Dios, ruega por nosotros los pecadores; ahora y en la hora de nuestra muerte.<br>G.- Gloria al Padre, al Hijo y al Espíritu Santo, <br>R.- Como era en un principio, ahora y siempre por los siglos de los siglos.<br>G.- María, Madre de Gracia y Madre de Misericordia,<br>R.- En la vida y en la muerte ampáranos Gran Señora.<br>T.- Oh Jesús mío, perdona nuestros pecados y líbranos del fuego del infierno, lleva al cielo a todas las almas y socorre especialmente a las más necesitadas de tu misericordia. Amén")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        rosario18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Oracion del decenario");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Padre nuestro que estás en el cielo, santificado sea tu nombre, venga a nosotros tu reino, hágase tu voluntad, así en la tierra como en el cielo.<br> R.- Danos hoy nuestro pan de cada día, perdona nuestras ofensas, así como nosotros perdonamos a los que nos ofenden; no nos dejes caer en tentación y líbranos del mal.<br> G.- Dios te salve María, llena eres de gracia, el Señor es contigo, bendita eres tú entre todas las mujeres, y bendito es el fruto de tu vientre: Jesús<br> R.- Santa María Madre de Dios, ruega por nosotros los pecadores; ahora y en la hora de nuestra muerte.<br>G.- Gloria al Padre, al Hijo y al Espíritu Santo, <br>R.- Como era en un principio, ahora y siempre por los siglos de los siglos.<br>G.- María, Madre de Gracia y Madre de Misericordia,<br>R.- En la vida y en la muerte ampáranos Gran Señora.<br>T.- Oh Jesús mío, perdona nuestros pecados y líbranos del fuego del infierno, lleva al cielo a todas las almas y socorre especialmente a las más necesitadas de tu misericordia. Amén")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        rosario20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Oracion del decenario");
                alertDialogBuilder.setMessage(Html.fromHtml("G.- Padre nuestro que estás en el cielo, santificado sea tu nombre, venga a nosotros tu reino, hágase tu voluntad, así en la tierra como en el cielo.<br> R.- Danos hoy nuestro pan de cada día, perdona nuestras ofensas, así como nosotros perdonamos a los que nos ofenden; no nos dejes caer en tentación y líbranos del mal.<br> G.- Dios te salve María, llena eres de gracia, el Señor es contigo, bendita eres tú entre todas las mujeres, y bendito es el fruto de tu vientre: Jesús<br> R.- Santa María Madre de Dios, ruega por nosotros los pecadores; ahora y en la hora de nuestra muerte.<br>G.- Gloria al Padre, al Hijo y al Espíritu Santo, <br>R.- Como era en un principio, ahora y siempre por los siglos de los siglos.<br>G.- María, Madre de Gracia y Madre de Misericordia,<br>R.- En la vida y en la muerte ampáranos Gran Señora.<br>T.- Oh Jesús mío, perdona nuestros pecados y líbranos del fuego del infierno, lleva al cielo a todas las almas y socorre especialmente a las más necesitadas de tu misericordia. Amén")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Al terminar el quinto misterio");
                alertDialogBuilder.setMessage(Html.fromHtml("G. Por las intenciones del Santo Padre, rezaremos un Padre Nuestro, un Avemaría y un Gloria.<br>T. Padre Nuestro, que estás en el cielo...<br>T. Dios te salve María, llena eres de gracia...<br>T. Gloria al Padre...<br><br>G. Dios te salve María, Hija de Dios Padre, en tus manos encomendamos nuestra fe para que la ilumines, llena eres de gracia..<br><br>G. Dios te salve María, Madre de Dios Hijo, en tus manos encomendamos nuestra esperanza para que la alientes, llena eres de gracia...<br><br>G. Dios te salve María, Esposa de Dios Espíritu Santo, en tus manos encomendamos nuestra caridad para que la inflames, llena eres de gracia...<br><br>G. Dios te salve María, Templo y Sagrario de la Santísima Trinidad, Virgen concebida sin culpa original, llena eres de gracia...<br><br>T. Dios te salve Reina y Madre de misericordia, vida, dulzura y esperanza nuestra; Dios te salve. A ti llamamos los desterrados hijos de Eva; a ti suspiramos, gimiendo y llorando en este valle de lágrimas. ¡Ea pues!, Señora y abogada nuestra: vuelve a nosotros tus ojos misericordiosos, y después de este destierro, muéstranos a Jesús: fruto bendito de tu vientre. ¡Oh clemente, oh piadosa, oh dulce Virgen María!. Ruega por nosotros Santa Madre de Dios, para que seamos dignos de alcanzar las divinas gracias y promesas de nuestro Señor Jesucristo.<br><br> Amén.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Letanías");
                alertDialogBuilder.setMessage(Html.fromHtml("Señor, ten piedad de nosotros<br>Cristo,ten piedad de nosotros<br>Señor, ten piedad de nosotros<br>Cristo óyenos,Cristo óyenos<br>Cristo escúchanos,Cristo escúchanos<br><br>Dios Padre celestial,ten piedad de nosotros<br>Dios Hijo redentor del mundo,<br>Dios Espíritu Santo,<br>Santísima Trinidad, que eres un solo Dios<br><br>Santa María, Ruega por nosotros<br> Santa Madre de Dios,<br>Santa Virgen de las vírgenes<br><br>Madre de Cristo,<br>" +
                        "Madre de la Iglesia,<br>" +
                        "Madre de la divina gracia,<br>" +
                        "Madre purísima,<br>" +
                        "Madre castísima,<br>" +
                        "Madre virginal,<br>" +
                        "Madre inmaculada,<br>" +
                        "Madre amable,<br>" +
                        "Madre admirable,<br>" +
                        "Madre del buen consejo,<br>" +
                        "Madre del Creador,<br>" +
                        "Madre del Salvador,<br><br>Virgen prudentísima,<br>" +
                        "Virgen digna de veneración,<br>" +
                        "Virgen digna de alabanza,<br>" +
                        "Virgen poderosa,<br>" +
                        "Virgen clemente,<br>" +
                        "Virgen fiel,<br><br>Espejo de justicia,<br>" +
                        "Trono de la sabiduría,<br>" +
                        "Causa de nuestra alegría,<br>" +
                        "Vaso espiritual,<br>" +
                        "Vaso digno de honor,<br>" +
                        "Vaso insigne de devoción,<br>" +
                        "Rosa mística,<br>" +
                        "Torre de David,<br>" +
                        "Torre de marfil,<br>" +
                        "Casa de oro,<br>" +
                        "Arca de la alianza,<br>" +
                        "Puerta del cielo,<br>" +
                        "Estrella de la mañana,<br>" +
                        "Salud de los enfermos,<br>" +
                        "Refugio de los pecadores,<br>" +
                        "Consuelo de los afligidos,<br>" +
                        "Auxilio de los cristianos,<br><br>Reina de los ángeles,<br>" +
                        "Reina de los patriarcas,<br>" +
                        "Reina de los profetas,<br>" +
                        "Reina de los apóstoles,<br>" +
                        "Reina de los mártires,<br>" +
                        "Reina de los confesores,<br>" +
                        "Reina de las vírgenes,<br>" +
                        "Reina de todos los santos,<br>" +
                        "Reina concebida sin pecado original,<br>" +
                        "Reina elevada al cielo,<br>" +
                        "Reina del santísimo rosario,<br>" +
                        "Reina de las familias,<br>" +
                        "Reina de la paz,<br><br>Cordero de Dios que quitas el pecado del mundo,<br>" +
                        "perdónanos, Señor.<br><br>Cordero de Dios que quitas el pecado del mundo,<br>" +
                        "escúchanos, Señor.<br><br>Cordero de Dios que quitas el pecado del mundo,<br>" +
                        "ten piedad de nosotros.<br><br>")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Oremos");
                alertDialogBuilder.setMessage(Html.fromHtml("Te rogamos, Señor, que nos concedas a nosotros tus sievos, gozar de perpetua salud de alma y cuerpo y, por la gloriosa intercesión de la bienaventurada Virgen María, seamos librados de la tristeza presente y disfrutemos de la eterna alegría. Por Cristo nuestro Señor.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Amen");
                alertDialogBuilder.setMessage(Html.fromHtml("T.- Por la señal de la Santa Cruz, de nuestros enemigos, líbranos Señor Dios nuestro. En el nombre del Padre, del Hijo y del Espíritu Santo.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        rosario25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setTitle("Fin");
                alertDialogBuilder.setMessage(Html.fromHtml("Felicidades, has conseguido acabar el Santo Rosario.")).setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        recibirDatos();

    }
    private void recibirDatos(){
        Bundle extras=getIntent().getExtras();
        int eleccion = extras.getInt("eleccion");

        switch (eleccion){
            case 1:
                misterio1.setText("1º La Anunciación del Angel a la Virgen María y la Encarnación del Hijo de Dios.\n" +
                        "\n" +
                        "\"Entonces María dijo: He aquí la esclava del Señor; hágase en mí según tu palabra\" (Lc 1,38)\n" +
                        "\n" +
                        "Dios escoge por Madre a María, una jovencita de Nazaret, pura, santa, humilde y adornada de todas las virtudes. ¡Qué poco caso hace Dios de las grandezas humanas!\n" +
                        "Procuraré ser limpio de corazón para agradar a Dios. Mantendré mi pureza y me impondré una fecha fija para mi confesión sacramental.");
                misterio2.setText("2º La visita de María Santísima a su prima Isabel.\n" +
                        "\n" +
                        "\"Y María entrando en casa de Zacarías, saludó a Isabel\" (Lc 1, 40)\n" +
                        "María estuvo tres meses en casa de su prima; y a pesar de que era Madre de Dios, sirvió a Isabel como una diligente empleada.\n" +
                        "Prometo ayudar a mis semejantes siempre que pueda, tanto en lo espiritual como en lo material.");
                misterio3.setText("3º El nacimiento de Nuestro Señor Jesucristo en el portal de Belén.\n" +
                        "\n" +
                        "\"Y María dio a luz a su hijo primogénito, lo envolvió en pañales y lo acostó en un pesebre\" (Lc 2, 7)\n" +
                        "\n" +
                        "Jesús nos da un ejemplo de humildad contra la vanidad y soberbia de la vida; de pobreza contra el hambre insaciable de riquezas; de mortificación contra el desmesurado afán de delicias.\n" +
                        "\n" +
                        "Prometo llevar con resignación las penas, incomodidades y tribulaciones que deba sufrir, por amor a Jesús que quiso sufrir por mi desde el momento de Su nacimiento.");
                misterio4.setText("4º La purificación de María Santísima y la presentación de Su Hijo en el Templo de Jerusalén.\n" +
                        "\n" +
                        "\"María y José llevaron a Jesús a Jerusalén para presentarlo al Señor\" (Lc 2,22)\n" +
                        "\n" +
                        "¿Por qué nos excusamos con tanta facilidad cuando se trata de cumplir con nuestros deberes ?\n" +
                        "\n" +
                        "Cumpliré con mis obligaciones sin rebeldía, considerándome criatura de Dios. Acataré las leyes de la Iglesia de Jesucristo, a la que pertenezco.");
                misterio5.setText("5º María y José encuentran a Jesús en el Templo, después de tres días.\n" +
                        "\n" +
                        "\"Después de tres días, lo encontraron en el templo, sentado en medio de los doctores.\" (Lc 2, 46)\n" +
                        "\n" +
                        "La Sagrada Familia fue al Templo según su costumbre. ¿Tenemos nosotros esta costumbre de ir al Templo por lo menos los días mandados? Encontraron a Jesús en el Templo donde se quedó para demostrar que los hijos tienen voluntad de seguir su vocación y que los padres no deben oponerse a ella.\n" +
                        "\n" +
                        "Guardaré siempre el respeto al Templo, Casa de Dios. Procuraré ayudar a los demás a tener devoción a la Iglesia.");
                rosario11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Primer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("1º La Anunciación del Angel a la Virgen María y la Encarnación del Hijo de Dios.<br><br>Entonces María dijo: He aquí la esclava del Señor; hágase en mí según tu palabra (Lc 1,38)<br><br>Dios escoge por Madre a María, una jovencita de Nazaret, pura, santa, humilde y adornada de todas las virtudes. ¡Qué poco caso hace Dios de las grandezas humanas!<br><br>Procuraré ser limpio de corazón para agradar a Dios. Mantendré mi pureza y me impondré una fecha fija para mi confesión sacramental.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Segundo misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("2º La visita de María Santísima a su prima Isabel.<br><br>Y María entrando en casa de Zacarías, saludó a Isabel (Lc 1, 40)<br>María estuvo tres meses en casa de su prima; y a pesar de que era Madre de Dios, sirvió a Isabel como una diligente empleada.<br><br>Prometo ayudar a mis semejantes siempre que pueda, tanto en lo espiritual como en lo material.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Tercer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("3º El nacimiento de Nuestro Señor Jesucristo en el portal de Belén.<br><br> Y María dio a luz a su hijo primogénito, lo envolvió en pañales y lo acostó en un pesebre (Lc 2, 7)<br><br>Jesús nos da un ejemplo de humildad contra la vanidad y soberbia de la vida; de pobreza contra el hambre insaciable de riquezas; de mortificación contra el desmesurado afán de delicias.<br><br>Prometo llevar con resignación las penas, incomodidades y tribulaciones que deba sufrir, por amor a Jesús que quiso sufrir por mi desde el momento de Su nacimiento.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Cuarto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("4º La purificación de María Santísima y la presentación de Su Hijo en el Templo de Jerusalén.<br><br>María y José llevaron a Jesús a Jerusalén para presentarlo al Señor (Lc 2,22)<br><br>¿Por qué nos excusamos con tanta facilidad cuando se trata de cumplir con nuestros deberes ?<br><br>Cumpliré con mis obligaciones sin rebeldía, considerándome criatura de Dios. Acataré las leyes de la Iglesia de Jesucristo, a la que pertenezco.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Quinto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("5º María y José encuentran a Jesús en el Templo, después de tres días.<br><br>Después de tres días, lo encontraron en el templo, sentado en medio de los doctores. (Lc 2, 46)<br><br>La Sagrada Familia fue al Templo según su costumbre. ¿Tenemos nosotros esta costumbre de ir al Templo por lo menos los días mandados? Encontraron a Jesús en el Templo donde se quedó para demostrar que los hijos tienen voluntad de seguir su vocación y que los padres no deben oponerse a ella.<br><br>Guardaré siempre el respeto al Templo, Casa de Dios. Procuraré ayudar a los demás a tener devoción a la Iglesia.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                break;
            case 2:
                misterio1.setText("1° El Bautismo de Jesús en el Jordán.\n" +
                        "\n" +
                        "\"Tenía Jesús al comenzar su vida pública, unos treinta años. Por aquellos días, como todo el pueblo se bautizaba, vino Jesús desde Nazaret de Galilea al Jordán para ser bautizado por Juan. Y he aquí, que estando Él en oración, se abrió el cielo, bajó el Espíritu Santo en forma de paloma se posó sobre Él, y se oyó una voz del cielo que decía: Este es mi hijo muy amado escuchenlo\"(Lc. 3, 21-23; Mt. 3,13)");
                misterio2.setText("2° Las bodas de Caná\n" +
                        "\n" +
                        "\"Se celebraba una boda en Caná de Galilea, y estaba allí la madre de Jesús. Fueron invitados también a la boda Jesús y sus discípulos. Y como faltaba vino, María le dijo a Jesús:\"No tienen vino\". Respóndió Jesús: \"¿Qué nos va a ti y a mi? Además no ha llegado mi hora\". Pero la madre dijo a los que servían: \"Haced lo que Él os diga\".\n" +
                        "\n" +
                        "Había colocadas seis tinajas de piedra y Jesús les dijo: \"Llenen de agua las tinajas\" Y les dice:\"Llevenlo al maestrala\" Cuando éste gustó el vino dijo: \"Todo hombre pone primero el vino bueno y cuando ya han tomado el peor, pero tu has guardado el mejor vino hasta ahora\".(Jn 2, 2-11)");
                misterio3.setText("3° El anuncio del Reino de Dios\n" +
                        "\n" +
                        "\"Jesús comenzó a predicar la Palabra de Dios y decía:\"Se cumplió el tiempo y ha llegado el reino de Dios: arrepentíos hy creed en el Evangelio\" Y su fama se extendió por toda la región. (Mt. 4, 13-17 Mc. 1,15 Lc 4,15)");
                misterio4.setText("4° La Transfiguración\n" +
                        "\n" +
                        "\"Tonmando jesús a Pedro, Santiago y Juan, subió a un monte a orar. Mientras oraba su rostro se transformó, su vestido se volvió blanco y resplandeciente, y Moisés y Elías hablaban con Él. Pedro le dijo a Jesús: Maestro ¡qué bien se está aquí! Hagamos tre tiendas: una para ti, otra para Moisés y otra para Elías. Mientras decía esto, apareció una nube que los cubrió y salió una luz que decía: \"Este es mi hijo elgido, escuchadle\". (Lc. 9, 28-36)\n");
                misterio5.setText("5° La Institución de la Eucaristía\n" +
                        "\n" +
                        "\"Cuando llegó la hora, se puso a la mesa con sus discípulos y les dijo: \"Ardientemente he querido comer ésta Pascua con ustedes antes de padecer, porque no la comeré más hasta que sea cumplida en el reino de Dios. Tomando el cáliz, dio gracias y dijo: tomen y beban todos de el , porque éste es el cáliz de mi sangre que será derramada por ustedes. Después tomó el pan, dando gracias lo partió y se los dió diciendo: Este es mi cuerpo que será entregado por ustedes. Hagan esto en memoria mia.\" (Lc. 22, 14-23)");

                rosario11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Primer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("1° El Bautismo de Jesús en el Jordán.<br><br>Tenía Jesús al comenzar su vida pública, unos treinta años. Por aquellos días, como todo el pueblo se bautizaba, vino Jesús desde Nazaret de Galilea al Jordán para ser bautizado por Juan. Y he aquí, que estando Él en oración, se abrió el cielo, bajó el Espíritu Santo en forma de paloma se posó sobre Él, y se oyó una voz del cielo que decía: Este es mi hijo muy amado escuchenlo<br><br>(Lc. 3, 21-23; Mt. 3,13)")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Segundo misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("2° Las bodas de Caná<br><br>Se celebraba una boda en Caná de Galilea, y estaba allí la madre de Jesús. Fueron invitados también a la boda Jesús y sus discípulos. Y como faltaba vino, María le dijo a Jesús:No tienen vino. Respóndió Jesús: ¿Qué nos va a ti y a mi? Además no ha llegado mi hora. Pero la madre dijo a los que servían: Haced lo que Él os diga<br><br>Había colocadas seis tinajas de piedra y Jesús les dijo: Llenen de agua las tinajas <br><br>Y les dice: Llevenlo al maestrala Cuando éste gustó el vino dijo: Todo hombre pone primero el vino bueno y cuando ya han tomado el peor, pero tu has guardado el mejor vino hasta ahora.(Jn 2, 2-11)")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Tercer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("3° El anuncio del Reino de Dios<br><br>\"Jesús comenzó a predicar la Palabra de Dios y decía:\"Se cumplió el tiempo y ha llegado el reino de Dios: arrepentíos hy creed en el Evangelio\" Y su fama se extendió por toda la región. (Mt. 4, 13-17 Mc. 1,15 Lc 4,15)")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Cuarto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("4° La Transfiguración<br><br>\"Tonmando jesús a Pedro, Santiago y Juan, subió a un monte a orar. Mientras oraba su rostro se transformó, su vestido se volvió blanco y resplandeciente, y Moisés y Elías hablaban con Él. Pedro le dijo a Jesús: Maestro ¡qué bien se está aquí! Hagamos tre tiendas: una para ti, otra para Moisés y otra para Elías. Mientras decía esto, apareció una nube que los cubrió y salió una luz que decía: \"Este es mi hijo elgido, escuchadle\". (Lc. 9, 28-36)")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Quinto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("5° La Institución de la Eucaristía<br><br>\"Cuando llegó la hora, se puso a la mesa con sus discípulos y les dijo: \"Ardientemente he querido comer ésta Pascua con ustedes antes de padecer, porque no la comeré más hasta que sea cumplida en el reino de Dios. Tomando el cáliz, dio gracias y dijo: tomen y beban todos de el , porque éste es el cáliz de mi sangre que será derramada por ustedes. Después tomó el pan, dando gracias lo partió y se los dió diciendo: Este es mi cuerpo que será entregado por ustedes. Hagan esto en memoria mia.\" (Lc. 22, 14-23)")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                break;
            case 3:
                misterio1.setText("1º La oración y agonía de Jesús en el huerto de Getsemaní.\n" +
                        "\n" +
                        "\"Y sumido en agonía, insistía mas en su oración\" (Lc 22,44)\n" +
                        "\n" +
                        "Jesús no tenía la necesidad de orar; pero quiso hacerlo para enseñarnos qué tanto necesitamos hacerlo. Hemos de orar para no caer en la tentación, y si caemos, levantarnos del pecado.\n" +
                        "\n" +
                        "Me propongo hacer oración al despertar, antes de dormir y antes de mis actividades mas importantes.");
                misterio2.setText("2º La flagelación de Jesús.\n" +
                        "\n" +
                        "\"Entonces Pilato tomó a Jesús y Mandó azotarle\" (Jn 19,1)\n" +
                        "\n" +
                        "Jesús quiso padecer la flagelación para la expiación de los pecados de deshonestidad que marchitan tantas flores juveniles, que roban la salud a tantos cuerpos y que ocasionan la perdición eterna de tantas almas.\n" +
                        "\n" +
                        "Huiré de todo acto y espectáculo que repugne la moral cristiana. Evitaré que los pequeños y jóvenes vean programas deshonestos.");
                misterio3.setText("3º La coronación de espinas de Nuestro Señor.\n" +
                        "\n" +
                        "\"Los soldados trenzaron una corona de espinas y se la pusieron en la cabeza\" ( Jn 19, 2)\n" +
                        "\n" +
                        "Sí, Jesús es el rey de las inteligencias y de los corazones; Rey que redime de la esclavitud del pecado a los individuos, a las familias, a los pueblos y a las naciones\n" +
                        "\n" +
                        "Seguiré la doctrina de Jesús para reinar con El eternamente. Seré valiente para profesar públicamente mi fe y para cumplir sin avergonzarme mis deberes de piedad.");
                misterio4.setText("4º El camino hacia el Calvario, llevando Jesús la Cruz a cuestas, por nuestros pecados.\n" +
                        "\n" +
                        "\"Y Jesús cargando su cruz, salió hacia el lugar llamado Calvario\" (Jn 19, 17)\n" +
                        "\n" +
                        "Hemos de llevar nuestra cruz, hemos de padecer tristezas y dolores. Nos será difícil caminar entre penas y trabajos. Tendremos nuestras caídas y no nos desanimaremos. Dios lo permite para que pensemos más en la vida eterna que nos espera. Pidámosle que no nos deje caídos.\n" +
                        "\n" +
                        "Al sufrir alguna pena, pensaré en lo que padeció Jesús por mí y cuando sea demasiado el sufrimiento le pediré que El sea mi Cireneo.");
                misterio5.setText("5º La crucifixión y muerte de nuestro Señor.\n" +
                        "\n" +
                        "\"Lo crucificaron, y con él a otros dos, uno a cada lado y Jesús en medio\" (Jn 19, 18)\n" +
                        "\n" +
                        "Jesús muere por ti, mírale bien. Tiene sus manos clavadas para no castigarte y abiertas para abrazarte. Tiene sus ojos cerrados para no confundirte y abiertos para mirarte amorosamente. Sus labios se cierran para no clamar venganza y se abren para perdonarte.\n" +
                        "\n" +
                        "Besaré el crucifijo al levantarme por la mañana y al acostarme. Cuando me llegue alguna tentación apretaré el crucifijo de mi Rosario o el que llevo al cuello.");

                rosario11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Primer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("1º La oración y agonía de Jesús en el huerto de Getsemaní.<br><br>Y sumido en agonía, insistía mas en su oración (Lc 22,44)<br><br>Jesús no tenía la necesidad de orar; pero quiso hacerlo para enseñarnos qué tanto necesitamos hacerlo. Hemos de orar para no caer en la tentación, y si caemos, levantarnos del pecado.<br><br>Me propongo hacer oración al despertar, antes de dormir y antes de mis actividades mas importantes.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Segundo misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("2º La flagelación de Jesús.<br><br>Entonces Pilato tomó a Jesús y Mandó azotarle (Jn 19,1)<br><br>Jesús quiso padecer la flagelación para la expiación de los pecados de deshonestidad que marchitan tantas flores juveniles, que roban la salud a tantos cuerpos y que ocasionan la perdición eterna de tantas almas.<br><br>Huiré de todo acto y espectáculo que repugne la moral cristiana. Evitaré que los pequeños y jóvenes vean programas deshonestos.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Tercer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("3º La coronación de espinas de Nuestro Señor.<br><br>\"Los soldados trenzaron una corona de espinas y se la pusieron en la cabeza\" ( Jn 19, 2)<br><br>Sí, Jesús es el rey de las inteligencias y de los corazones; Rey que redime de la esclavitud del pecado a los individuos, a las familias, a los pueblos y a las naciones<br><br>Seguiré la doctrina de Jesús para reinar con El eternamente. Seré valiente para profesar públicamente mi fe y para cumplir sin avergonzarme mis deberes de piedad.\n")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Cuarto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("4º El camino hacia el Calvario, llevando Jesús la Cruz a cuestas, por nuestros pecados.<br><br>\"Y Jesús cargando su cruz, salió hacia el lugar llamado Calvario\" (Jn 19, 17)<br><br>Hemos de llevar nuestra cruz, hemos de padecer tristezas y dolores. Nos será difícil caminar entre penas y trabajos. Tendremos nuestras caídas y no nos desanimaremos. Dios lo permite para que pensemos más en la vida eterna que nos espera. Pidámosle que no nos deje caídos.<br><br>Al sufrir alguna pena, pensaré en lo que padeció Jesús por mí y cuando sea demasiado el sufrimiento le pediré que El sea mi Cireneo.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Quinto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("5º La crucifixión y muerte de nuestro Señor.<br><br>\"Lo crucificaron, y con él a otros dos, uno a cada lado y Jesús en medio\" (Jn 19, 18)<br><br>Jesús muere por ti, mírale bien. Tiene sus manos clavadas para no castigarte y abiertas para abrazarte. Tiene sus ojos cerrados para no confundirte y abiertos para mirarte amorosamente. Sus labios se cierran para no clamar venganza y se abren para perdonarte.<br><br>Besaré el crucifijo al levantarme por la mañana y al acostarme. Cuando me llegue alguna tentación apretaré el crucifijo de mi Rosario o el que llevo al cuello.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                break;
            case 4:
                misterio1.setText("1º La triunfante Resurrección de Jesús.\n" +
                        "\n" +
                        "\"¿Porqué buscáis entre los muertos al que está vivo? No esta aquí: ha resucitado\" (Lc 24, 5-6)\n" +
                        "\n" +
                        "Jesús se apareció muy en particular a los pecadores arrepentidos como Pedro, Tomás y la Magdalena. Se ve en esto su bondad y misericordia.\n" +
                        "\n" +
                        "Viviré cristianamente para poder resucitar gloriosamente, recordando que una vida cristiana culmina en una muerte cristiana.");
                misterio2.setText("2º La admirable Ascensión de Jesús al cielo.\n" +
                        "\n" +
                        "\"Mientras los bendecía se separó de ellos y fue llevado al cielo\" (Lc 24, 51)\n" +
                        "\n" +
                        "Nuestra verdadera patria no está en la tierra, sino en el cielo, donde no existen ni el dolor, ni la tristeza, ni la enfermedad, ni la muerte. Ahí veremos a Dios, gozaremos de su presencia y estaremos eternamente con El.\n" +
                        "\n" +
                        "Pensando que estamos en este mundo, esperando ir a la patria verdadera, procuraré utilizar los dones terrenales en tal forma que me ayuden a ganar el cielo.");
                misterio3.setText("3º La venida del Espíritu Santo sobre María Santísima y los Apóstoles.\n" +
                        "\n" +
                        "\"Se les aparecieron unas lenguas como de fuego que se repartieron y se posaron sobre cada uno de ellos; quedaron todos llenos del Espíritu Santo\" (Hch 2, 3-4)\n" +
                        "\n" +
                        "Los Apóstoles cambiaron: de tímidos se convirtieron en valerosos, de ignorantes en sabios; de tibios en la fe en fervorosos. Pedro predicó su primer sermón convirtiendo a tres mil personas.\n" +
                        "\n" +
                        "No me bastará ser católico; daré testimonio de que he recibido al Espíritu Santo en el Bautismo y lo he aceptado en plenitud en la Confirmación, practicando mi fe.");
                misterio4.setText("4º La Asunción de María al cielo en cuerpo y alma.\n" +
                        "\n" +
                        "\"¡Feliz la que ha creído que se cumplirían las cosas que le fueron dichas de parte del Señor!\" (Lc 1, 45)\n" +
                        "\n" +
                        "¿Nos preparamos nosotros con una vida santa para tener una muerte santa?\n" +
                        "\n" +
                        "Pediré siempre a la Virgen Santísima en el Rosario, que sea mi abogada ante Dios en la hora de mi muerte.");
                misterio5.setText("5º La Coronación de María Santísima como Reina y Señora del universo.\n" +
                        "\n" +
                        "\"Una gran señal apareció en el cielo: una mujer vestida del sol con la luna bajo sus pies y una corona de doce estrellas sobre su cabeza\" (Ap 12, 1)\n" +
                        "\n" +
                        "Jesús antes de morir, nos dio a María como nuestra Madre, es nuestra abogada y medianera. Es el refugio de los pecadores. Pongamos en ella nuestra confianza, acudamos a ella en nuestras penas y sufrimientos.");

                rosario11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Primer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("1º La triunfante Resurrección de Jesús.<br><br>\"¿Porqué buscáis entre los muertos al que está vivo? No esta aquí: ha resucitado\" (Lc 24, 5-6)<br><br>Jesús se apareció muy en particular a los pecadores arrepentidos como Pedro, Tomás y la Magdalena. Se ve en esto su bondad y misericordia.<br><br>Viviré cristianamente para poder resucitar gloriosamente, recordando que una vida cristiana culmina en una muerte cristiana.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Segundo misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("2º La admirable Ascensión de Jesús al cielo.<br><br>\"Mientras los bendecía se separó de ellos y fue llevado al cielo\" (Lc 24, 51)<br><br>Nuestra verdadera patria no está en la tierra, sino en el cielo, donde no existen ni el dolor, ni la tristeza, ni la enfermedad, ni la muerte. Ahí veremos a Dios, gozaremos de su presencia y estaremos eternamente con El.<br><br>Pensando que estamos en este mundo, esperando ir a la patria verdadera, procuraré utilizar los dones terrenales en tal forma que me ayuden a ganar el cielo.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Tercer misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("3º La venida del Espíritu Santo sobre María Santísima y los Apóstoles.<br><br>\"Se les aparecieron unas lenguas como de fuego que se repartieron y se posaron sobre cada uno de ellos; quedaron todos llenos del Espíritu Santo\" (Hch 2, 3-4)<br><br>Los Apóstoles cambiaron: de tímidos se convirtieron en valerosos, de ignorantes en sabios; de tibios en la fe en fervorosos. Pedro predicó su primer sermón convirtiendo a tres mil personas.<br><br>No me bastará ser católico; daré testimonio de que he recibido al Espíritu Santo en el Bautismo y lo he aceptado en plenitud en la Confirmación, practicando mi fe.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Cuarto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("4º La Asunción de María al cielo en cuerpo y alma.<br><br>\"¡Feliz la que ha creído que se cumplirían las cosas que le fueron dichas de parte del Señor!\" (Lc 1, 45)\n<br><br>¿Nos preparamos nosotros con una vida santa para tener una muerte santa?<br><br>Pediré siempre a la Virgen Santísima en el Rosario, que sea mi abogada ante Dios en la hora de mi muerte.")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                rosario19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View view) {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                        alertDialogBuilder.setTitle("Quinto misterio");
                        alertDialogBuilder.setMessage(Html.fromHtml("5º La Coronación de María Santísima como Reina y Señora del universo.<br><br>\"Una gran señal apareció en el cielo: una mujer vestida del sol con la luna bajo sus pies y una corona de doce estrellas sobre su cabeza\" (Ap 12, 1)\n<br><br>Jesús antes de morir, nos dio a María como nuestra Madre, es nuestra abogada y medianera. Es el refugio de los pecadores. Pongamos en ella nuestra confianza, acudamos a ella en nuestras penas y sufrimientos.<br><br>Trataré de rezar el rosario todos los días.\n")).setCancelable(false)
                                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.show();
                    }
                });
                break;
        }
    }
}
