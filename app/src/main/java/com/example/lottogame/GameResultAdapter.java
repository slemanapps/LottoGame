package com.example.lottogame;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameResultAdapter extends RecyclerView.Adapter<GameResultAdapter.ViewHolder> {

   ArrayList<GameResult> arrayList;


   public GameResultAdapter(ArrayList<GameResult> arrayList){
       this.arrayList=arrayList;
   }




    @NonNull
    @Override
    public GameResultAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resultlist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameResultAdapter.ViewHolder holder, int position) {



        holder.tvu1.setText(arrayList.get(position).getUserN1()+"");
        holder.tvu2.setText(arrayList.get(position).getIserN2()+"");
        holder.tvu3.setText(arrayList.get(position).getUserN3()+"");
        holder.tvr1.setText(arrayList.get(position).getRandN1()+"");
        holder.tvr2.setText(arrayList.get(position).getRandN2()+"");
        holder.tvr3.setText(arrayList.get(position).getRandN3()+"");
        holder.tvdate.setText(arrayList.get(position).getGameDate()+"");
          holder.tvpoint.setText(arrayList.get(position).getResutl()+"");

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView tvu1,tvu2,tvu3,tvr1,tvr2,tvr3,tvpoint,tvdate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvu1 = itemView.findViewById(R.id.tvu1);
            tvu2 = itemView.findViewById(R.id.tvu2);
            tvu3 = itemView.findViewById(R.id.tvu3);
            tvr1 = itemView.findViewById(R.id.tvr1);
            tvr2 = itemView.findViewById(R.id.tvr2);
            tvr3 = itemView.findViewById(R.id.tvr3);
            tvpoint = itemView.findViewById(R.id.tvpoint);
            tvdate = itemView.findViewById(R.id.tvdate);




        }
    }
}
