package com.example.firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChemistryTweleveAdapter extends RecyclerView.Adapter<ChemistryTweleveAdapter.MyviewHolder> {
    Context context;
    ArrayList<modelclass> topiclist;
    SelectItem selectItem;

    public ChemistryTweleveAdapter(Context context, ArrayList<modelclass> topiclist, SelectItem selectItem) {
        this.context = context;
        this.topiclist = topiclist;
        this.selectItem = selectItem;
    }

    @NonNull
    @Override
    public ChemistryTweleveAdapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.chemistlist,parent,false);
        return  new ChemistryTweleveAdapter.MyviewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChemistryTweleveAdapter.MyviewHolder holder, int position) {
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
            img = itemView.findViewById(R.id.chemistimg);
            text = itemView.findViewById(R.id.chemisttopic);
            chapter = itemView.findViewById(R.id.chemistcard);
        }
    }
}
