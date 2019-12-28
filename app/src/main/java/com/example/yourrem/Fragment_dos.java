package com.example.yourrem;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_dos extends Fragment {

    public Button Genesis, Exodo, Levitico, Numeros, Deuteronomio, Josue, Jueces, Rut, ISamuel, IISamuel;
    public Button IReyes, IIReyes, ICronicas, IICronicas, Esdras, Nehemias, Tobias, Judit, Ester, Job, Salmos;
    public Button IMacabeos, IIMacabeos, Proverbios, Eclesiastes, Cantar, Sabiduria;
    public Button Eclesiastico, Isaias, Jeremias, Lamentaciones, Baruc, Ezequiel, Daniel, Oseas, Joel;
    public Button Amos, Abdias, Jonas, Miqueas, Nahun, Habacuc, Sofonias, Ageo, Zacarias, Malaquias;
    public Button Mateo, Marcos, Lucas, Juan, Hechos, Romanos, ICorintios, IICorintios, Galatas;
    public Button Efesios, Filipenses, Colosenses, ITesalonicenses, IITesalonicenses, ITimoteo;
    public Button IITimoteo, Tito, Filemon, Hebreos, Santiago, IPedro, IIPedro, IJuan, IIJuan, IIIJuan;
    public Button Judas, Apocalipsis;

    String hola;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =  inflater.inflate(R.layout.fragment_fragment_dos, container, false);

        Genesis=(Button)vista.findViewById(R.id.button3);
        Genesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 1);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Exodo=(Button)vista.findViewById(R.id.button34);
        Exodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 2);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Levitico=(Button)vista.findViewById(R.id.button35);
        Levitico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 3);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Numeros=(Button)vista.findViewById(R.id.button36);
        Numeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 4);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Deuteronomio=(Button)vista.findViewById(R.id.button37);
        Deuteronomio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 5);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Josue=(Button)vista.findViewById(R.id.button38);
        Josue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 6);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Jueces=(Button)vista.findViewById(R.id.button39);
        Jueces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 7);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Rut=(Button)vista.findViewById(R.id.button40);
        Rut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 8);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        ISamuel=(Button)vista.findViewById(R.id.button41);
        ISamuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 9);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IISamuel=(Button)vista.findViewById(R.id.button42);
        IISamuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 10);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IReyes=(Button)vista.findViewById(R.id.button43);
        IReyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 11);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IIReyes=(Button)vista.findViewById(R.id.button44);
        IIReyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 12);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        ICronicas=(Button)vista.findViewById(R.id.button45);
        ICronicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 13);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IICronicas=(Button)vista.findViewById(R.id.button46);
        IICronicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 14);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Esdras=(Button)vista.findViewById(R.id.button47);
        Esdras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 15);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Nehemias=(Button)vista.findViewById(R.id.button48);
        Nehemias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 16);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Tobias=(Button)vista.findViewById(R.id.button49);
        Tobias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 17);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Judit=(Button)vista.findViewById(R.id.button50);
        Judit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 18);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Ester=(Button)vista.findViewById(R.id.button51);
        Ester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 19);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Job=(Button)vista.findViewById(R.id.button52);
        Job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 20);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Salmos=(Button)vista.findViewById(R.id.button53);
        Salmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 21);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IMacabeos=(Button)vista.findViewById(R.id.button4);
        IMacabeos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 22);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IIMacabeos=(Button)vista.findViewById(R.id.button5);
        IIMacabeos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 23);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Proverbios=(Button)vista.findViewById(R.id.button6);
        Proverbios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 24);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Eclesiastes=(Button)vista.findViewById(R.id.button7);
        Eclesiastes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 25);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Cantar=(Button)vista.findViewById(R.id.button8);
        Cantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 26);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Sabiduria=(Button)vista.findViewById(R.id.button9);
        Sabiduria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 27);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Eclesiastico=(Button)vista.findViewById(R.id.button10);
        Eclesiastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 28);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Isaias=(Button)vista.findViewById(R.id.button11);
        Isaias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 29);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Jeremias=(Button)vista.findViewById(R.id.button12);
        Jeremias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 30);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Lamentaciones=(Button)vista.findViewById(R.id.button13);
        Lamentaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 31);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Baruc=(Button)vista.findViewById(R.id.button14);
        Baruc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 32);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Ezequiel=(Button)vista.findViewById(R.id.button15);
        Ezequiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 33);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Daniel=(Button)vista.findViewById(R.id.button16);
        Daniel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 34);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Oseas=(Button)vista.findViewById(R.id.button17);
        Oseas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 35);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Joel=(Button)vista.findViewById(R.id.button18);
        Joel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 36);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Amos=(Button)vista.findViewById(R.id.button19);
        Amos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 37);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Abdias=(Button)vista.findViewById(R.id.button20);
        Abdias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 38);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Jonas=(Button)vista.findViewById(R.id.button21);
        Jonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 39);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Miqueas=(Button)vista.findViewById(R.id.button22);
        Miqueas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 40);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Nahun=(Button)vista.findViewById(R.id.button23);
        Nahun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 41);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Habacuc=(Button)vista.findViewById(R.id.button24);
        Habacuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 42);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Sofonias=(Button)vista.findViewById(R.id.button25);
        Sofonias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 43);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Ageo=(Button)vista.findViewById(R.id.button26);
        Ageo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 44);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Zacarias=(Button)vista.findViewById(R.id.button27);
        Zacarias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 45);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Malaquias=(Button)vista.findViewById(R.id.button28);
        Malaquias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 46);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Mateo=(Button)vista.findViewById(R.id.button29);
        Mateo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 47);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Marcos=(Button)vista.findViewById(R.id.button30);
        Marcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 48);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Lucas=(Button)vista.findViewById(R.id.button31);
        Lucas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 49);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Juan=(Button)vista.findViewById(R.id.button32);
        Juan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 50);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Hechos=(Button)vista.findViewById(R.id.button33);
        Hechos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 51);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Romanos=(Button)vista.findViewById(R.id.button54);
        Romanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 52);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        ICorintios=(Button)vista.findViewById(R.id.button55);
        ICorintios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 53);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IICorintios=(Button)vista.findViewById(R.id.button56);
        IICorintios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 54);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Galatas=(Button)vista.findViewById(R.id.button57);
        Galatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 55);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Efesios=(Button)vista.findViewById(R.id.button58);
        Efesios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 56);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Filipenses=(Button)vista.findViewById(R.id.button59);
        Filipenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 57);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Colosenses=(Button)vista.findViewById(R.id.button60);
        Colosenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 58);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        ITesalonicenses=(Button)vista.findViewById(R.id.button61);
        ITesalonicenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 59);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IITesalonicenses=(Button)vista.findViewById(R.id.button62);
        IITesalonicenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 60);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        ITimoteo=(Button)vista.findViewById(R.id.button63);
        ITimoteo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 61);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IITimoteo=(Button)vista.findViewById(R.id.button64);
        IITimoteo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 62);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Tito=(Button)vista.findViewById(R.id.button65);
        Tito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 63);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Filemon=(Button)vista.findViewById(R.id.button66);
        Filemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 64);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Hebreos=(Button)vista.findViewById(R.id.button67);
        Hebreos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 65);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Santiago=(Button)vista.findViewById(R.id.button68);
        Santiago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 66);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IPedro=(Button)vista.findViewById(R.id.button69);
        IPedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 67);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IIPedro=(Button)vista.findViewById(R.id.button70);
        IIPedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 68);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IJuan=(Button)vista.findViewById(R.id.button71);
        IJuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 69);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IIJuan=(Button)vista.findViewById(R.id.button72);
        IIJuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 70);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        IIIJuan=(Button)vista.findViewById(R.id.button73);
        IIIJuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 71);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Judas=(Button)vista.findViewById(R.id.button74);
        Judas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 72);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        Apocalipsis=(Button)vista.findViewById(R.id.button75);
        Apocalipsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Capitulo.class);

                Bundle miBundle = new Bundle();
                miBundle.putInt("Libro", 73);

                intent.putExtras(miBundle);
                startActivity(intent);
            }
        });
        return vista;
    }
}
