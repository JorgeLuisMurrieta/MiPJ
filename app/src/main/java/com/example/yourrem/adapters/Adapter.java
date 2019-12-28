package com.example.yourrem.adapters;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yourrem.R;
import com.example.yourrem.modelos.Coche;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.CochesviewHolder>implements View.OnClickListener{

    List <Coche> coches;
    private View.OnClickListener listener;
    public Adapter(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public CochesviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler, parent, false);
        CochesviewHolder holder=new CochesviewHolder(v);
        v.setOnClickListener(this);
        return holder;
    }
    @Override
    public void onBindViewHolder(CochesviewHolder holder, int position) {
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
    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }
    public static class CochesviewHolder extends RecyclerView.ViewHolder{

        TextView Titulo, Detalle, Fecha, Hora;

        public CochesviewHolder(View itemView) {
            super(itemView);
            Detalle=itemView.findViewById(R.id.Detalle);
            Titulo=itemView.findViewById(R.id.Titulo);
            Fecha=itemView.findViewById(R.id.Fecha);
            Hora=itemView.findViewById(R.id.Hora);
        }
    }

}
