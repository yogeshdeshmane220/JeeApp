package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class Eleven extends Fragment implements SelectItem{
    RecyclerView recyclerView;
    ArrayList<modelclass> topics;
    ELevenAdapter adapter;
    DatabaseReference reference;
    public Eleven() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eleven, container, false);
        recyclerView = view.findViewById(R.id.elevenrec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        topics = new ArrayList<>();
        adapter = new ELevenAdapter(getActivity(),topics,this);
        topics.add(new modelclass(R.drawable.physics,"Physical World"));
        topics.add(new modelclass(R.drawable.demo,"Units and Measurements"));
        topics.add(new modelclass(R.drawable.einstein,"Motion in a Straight Line"));
        topics.add(new modelclass(R.drawable.atom,"Motion in a Plane"));
        topics.add(new modelclass(R.drawable.physics,"Laws of Motion"));
        topics.add(new modelclass(R.drawable.demo,"Work, Energy, and Power"));
        topics.add(new modelclass(R.drawable.einstein,"System of Particles and Rotational Motion"));
        topics.add(new modelclass(R.drawable.atom,"Gravitation"));
        topics.add(new modelclass(R.drawable.physics,"Mechanical Properties of Solids"));
        topics.add(new modelclass(R.drawable.demo,"Mechanical Properties of Fluids"));
        topics.add(new modelclass(R.drawable.einstein,"Thermal Properties of Matter"));
        topics.add(new modelclass(R.drawable.atom,"Thermodynamics"));
        topics.add(new modelclass(R.drawable.physics,"Kinetic Theory"));
        topics.add(new modelclass(R.drawable.demo,"Oscillations"));
        topics.add(new modelclass(R.drawable.einstein,"Waves"));


        recyclerView.setAdapter(adapter);


        return view;



    }

    @Override
    public void itemOnclick(modelclass model) {

        if(model.getTopic().equals("Physical World")){
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",1);
            startActivity(intent);
        } else if (model.getTopic().equals("Units and Measurements")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",2);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Motion in a Straight Line")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",3);
            startActivity(intent);
        } else if (model.getTopic().equals("Motion in a Plane")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",4);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Laws Of Motion")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",5);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Work,Energy and Power")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",6);
            startActivity(intent);
        }
        else if (model.getTopic().equals("System Of Particles and Rotational Motion")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",7);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Gravitation")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",8);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Mechanical Properties of Solids")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",9);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Mechanical Properties of Fluids")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",10);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Thermal Properties of Matter")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",11);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Thermodynamics")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",12);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Kinetic Theory")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",13);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Oscillations")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",14);
            startActivity(intent);
        }
        else if (model.getTopic().equals("Waves")) {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("flag",15);
            startActivity(intent);
        }
    }
}