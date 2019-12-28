package com.example.yourrem.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.yourrem.R;
import com.example.yourrem.modelos.CocheMisal;

import java.util.List;

public class AdapterMisal extends RecyclerView.Adapter<AdapterMisal.CochesviewHolder>implements View.OnClickListener{

    List <CocheMisal> coches;
    private View.OnClickListener listener;
    public AdapterMisal(List<CocheMisal> cochesmisal) {
        this.coches = cochesmisal;
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
        CocheMisal coche = coches.get(position);
        holder.Nombre.setText(coche.getNombre());
        holder.Fecha.setText(coche.getFecha());
        holder.Epoca.setText(coche.getEpoca());
        holder.Detalle.setText(coche.getDetalle());

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

        TextView Nombre, Detalle, Epoca, Fecha;

        public CochesviewHolder(View itemView) {
            super(itemView);
            Detalle=itemView.findViewById(R.id.Informacion);
            Nombre=itemView.findViewById(R.id.Nombre);
            Epoca=itemView.findViewById(R.id.Epoca);
            Fecha=itemView.findViewById(R.id.FechaAsitencia);
        }
    }

}
