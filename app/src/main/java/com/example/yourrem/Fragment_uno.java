package com.example.yourrem;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.yourrem.adapters.adapters;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;


public class Fragment_uno extends Fragment{


    private RecyclerView recyclerList;
    private adapters adapters;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista =  inflater.inflate(R.layout.fragment_fragment_uno, container, false);
        final FloatingActionsMenu menubotones=(FloatingActionsMenu) vista.findViewById(R.id.fmenu);
        FloatingActionButton config = (FloatingActionButton) vista.findViewById(R.id.conf);
        FloatingActionButton delete=(FloatingActionButton)vista.findViewById(R.id.delete);
        FloatingActionButton add=(FloatingActionButton)vista.findViewById(R.id.add);
        FloatingActionButton chatbot=(FloatingActionButton)vista.findViewById(R.id.chatbot);
        recyclerList = (RecyclerView) vista.findViewById(R.id.recyclerId);
        recyclerList.setLayoutManager(new LinearLayoutManager(getContext()));

        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), menu.class);
                menubotones.collapse();
                startActivity(intent);

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getContext(), Eliminar.class);
                menubotones.collapse();
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), Registro.class);
                menubotones.collapse();
                startActivity(intent);
            }
        });
        chatbot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), ChatBot.class);
                menubotones.collapse();
                startActivity(intent);
            }
        });

        final BaseDatos baseDatos = new BaseDatos(getContext());

        adapters = new adapters(baseDatos.mostrar());
        recyclerList.setAdapter(adapters);

        return vista;
    }
}
