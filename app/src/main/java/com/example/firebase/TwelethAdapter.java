package com.example.firebase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TwelethAdapter extends RecyclerView.Adapter<TwelethAdapter.MyviewHolder> {
    Context context;
    ArrayList<modelclass> topiclist;
    SelectItem selectItem;

    public TwelethAdapter(Context context, ArrayList<modelclass> topiclist,SelectItem selectItem) {
        this.context = context;
        this.topiclist = topiclist;
        this.selectItem = selectItem;
    }

    @NonNull
    @Override
    public TwelethAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.syllablist,parent,false);
        return  new MyviewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TwelethAdapter.MyviewHolder holder, int position) {
        holder.img.setImageResource(topiclist.get(position).getImg());
        holder.text.setText(topiclist.get(position).getTopic());
        holder.chapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectItem.itemOnclick(topiclist.get(position));

            }
        });

    }

    @Override
    public int getItemCount() {
        return topiclist.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView text;
        CardView chapter;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgtitle);
            text = itemView.findViewById(R.id.topic);
            chapter = itemView.findViewById(R.id.chapters);
        }
    }
}
