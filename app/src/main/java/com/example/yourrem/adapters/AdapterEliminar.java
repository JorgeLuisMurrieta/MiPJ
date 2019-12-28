package com.example.yourrem.adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.yourrem.R;
import com.example.yourrem.modelos.Coche;

import java.util.List;

public class AdapterEliminar extends RecyclerView.Adapter<Adapter.CochesviewHolder>implements View.OnClickListener{

    List <Coche> coches;
    private View.OnClickListener listener;
    public AdapterEliminar(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    @NonNull
    @Override
    public Adapter.CochesviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler, parent, false);
        Adapter.CochesviewHolder holder=new Adapter.CochesviewHolder(v);
        v.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.CochesviewHolder holder, int position) {
        Coche coche = coches.get(position);
        holder.Detalle.setText(coche.getDetalle());
        holder.Titulo.setText(coche.getTitulo());
        holder.Fecha.setText(coche.getFecha());
        holder.Hora.setText(coche.getHora());
    }

    @Override
    public int getItemCount() {
        return coches.size();
    }
}