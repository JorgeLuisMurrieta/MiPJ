package com.example.yourrem;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class chat_rec extends RecyclerView.ViewHolder{
    TextView leftText,rightText;

    public chat_rec(View itemView){
        super(itemView);

        leftText = (TextView)itemView.findViewById(R.id.leftText2);
        rightText = (TextView)itemView.findViewById(R.id.rightText2);

    }
    public void setLeftText(String string) {
        leftText.setText(string);
    }


    public void setRightText(String string) {
        rightText.setText(string);
    }


}

/* List<ChatMessage>list;
    public chat_rec(List<ChatMessage>mensajes){
        this.list=mensajes;
    }

    @NonNull
    @Override
    public MessagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_message_send, parent, false);
        MessagesViewHolder holder= new MessagesViewHolder(v);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull MessagesViewHolder holder, int position) {
        ChatMessage chatMessage = list.get(position);
        holder.Left.setText(chatMessage.getMsgText());
        //holder.Right.setText(chatMessage.getMsgUser());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MessagesViewHolder extends RecyclerView.ViewHolder {
        TextView Right, Left;
        public MessagesViewHolder(@NonNull View itemView) {
            super(itemView);
            Right=itemView.findViewById(R.id.rightText);
            Left=itemView.findViewById(R.id.leftText);
        }
    }*/
