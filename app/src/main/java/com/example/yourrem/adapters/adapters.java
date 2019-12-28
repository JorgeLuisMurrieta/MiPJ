package com.example.yourrem.adapters;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.yourrem.ListaVO;
import com.example.yourrem.R;
import java.util.List;

public class adapters extends RecyclerView.Adapter<adapters.ViewHolder> implements View.OnClickListener{

    private View.OnClickListener listener;



    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        view.setOnClickListener(this);
        return viewHolder;
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre, info, id, fecha, horario;
        ImageView icono;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            id=(TextView)itemView.findViewById(R.id.tvId);
            info=(TextView)itemView.findViewById(R.id.tvInfo);
            nombre=(TextView)itemView.findViewById(R.id.tvNombre);
            fecha=(TextView)itemView.findViewById(R.id.tvFecha);
            horario=(TextView)itemView.findViewById(R.id.tvHora);

        }


    }
    public List<ListaVO> listaVO;

    public adapters(List<ListaVO> listaVO) {
        this.listaVO = listaVO;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(listaVO.get(position).getNombre());
        holder.info.setText(listaVO.get(position).getInfo());
        holder.id.setText(listaVO.get(position).getId());
        holder.fecha.setText(listaVO.get(position).getFecha());
        holder.horario.setText(listaVO.get(position).getHora());
    }
    @Override
    public int getItemCount() {
        return listaVO.size();
    }
}
