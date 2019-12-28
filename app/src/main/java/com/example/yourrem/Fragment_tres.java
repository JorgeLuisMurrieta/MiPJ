package com.example.yourrem;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.yourrem.Calendario.Abril;
import com.example.yourrem.Calendario.Agosto;
import com.example.yourrem.Calendario.Diciembre;
import com.example.yourrem.Calendario.Enero;
import com.example.yourrem.Calendario.Febrero;
import com.example.yourrem.Calendario.Julio;
import com.example.yourrem.Calendario.Junio;
import com.example.yourrem.Calendario.Marzo;
import com.example.yourrem.Calendario.Mayo;
import com.example.yourrem.Calendario.Noviembre;
import com.example.yourrem.Calendario.Octubre;
import com.example.yourrem.Calendario.Septiembre;

public class Fragment_tres extends Fragment {

    CardView retiros,enero, febrero, marzo, abril, mayo, junio, julio, agosto,septiembre, octubre, noviembre, diciembre;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =  inflater.inflate(R.layout.fragment_fragment_tres, container, false);


        enero=(CardView) vista.findViewById(R.id.c1);
        febrero=(CardView) vista.findViewById(R.id.car2);
        marzo=(CardView) vista.findViewById(R.id.car3);
        abril=(CardView) vista.findViewById(R.id.car4);
        mayo=(CardView) vista.findViewById(R.id.car5);
        junio=(CardView) vista.findViewById(R.id.car6);
        julio=(CardView) vista.findViewById(R.id.car7);
        agosto=(CardView) vista.findViewById(R.id.car8);
        septiembre=(CardView) vista.findViewById(R.id.car9);
        octubre=(CardView) vista.findViewById(R.id.car10);
        noviembre=(CardView) vista.findViewById(R.id.car11);
        diciembre=(CardView) vista.findViewById(R.id.car12);
        retiros=(CardView) vista.findViewById(R.id.car13);

        enero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Enero.class);
                startActivity(intent);
            }
        });
        febrero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Febrero.class);
                startActivity(intent);
            }
        });
        marzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Marzo.class);
                startActivity(intent);
            }
        });
        abril.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Abril.class);
                startActivity(intent);
            }
        });
        mayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Mayo.class);
                startActivity(intent);
            }
        });
        junio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Junio.class);
                startActivity(intent);
            }
        });
        julio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Julio.class);
                startActivity(intent);
            }
        });
        agosto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Agosto.class);
                startActivity(intent);
            }
        });
        septiembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Septiembre.class);
                startActivity(intent);
            }
        });
        octubre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Octubre.class);
                startActivity(intent);
            }
        });
        noviembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Noviembre.class);
                startActivity(intent);
            }
        });
        diciembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Diciembre.class);
                startActivity(intent);
            }
        });
        retiros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EventosPublicos.class);

                startActivity(intent);
            }
        });
        return vista;
    }

}