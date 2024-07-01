package com.example.firebase;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Twelveth extends Fragment implements SelectItem{

    RecyclerView recyclerView;
    ArrayList<modelclass> topics;
    TwelethAdapter twadapter;

    public Twelveth() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_twelveth, container, false);
        recyclerView = view.findViewById(R.id.twelverec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        topics = new ArrayList<>();
        twadapter = new TwelethAdapter(getActivity(),topics,this);
        topics.add(new modelclass(R.drawable.physics,"Electric Charges and Fields"));
        topics.add(new modelclass(R.drawable.demo,"Electrostatic Potential and Capacitance"));
        topics.add(new modelclass(R.drawable.einstein,"Current Electricity"));
        topics.add(new modelclass(R.drawable.atom,"Moving Charges and Magnetism"));
        topics.add(new modelclass(R.drawable.physics,"Magnetism and Matter"));
        topics.add(new modelclass(R.drawable.demo,"Electromagnetic Induction"));
        topics.add(new modelclass(R.drawable.einstein,"Alternating Current"));
        topics.add(new modelclass(R.drawable.atom,"Electromagnetic Waves"));
        topics.add(new modelclass(R.drawable.physics,"Ray Optics and Optical Instruments"));
        topics.add(new modelclass(R.drawable.demo,"Wave Optics"));
        topics.add(new modelclass(R.drawable.einstein,"Dual Nature of Radiation and Matter"));
        topics.add(new modelclass(R.drawable.atom,"Atoms"));
        topics.add(new modelclass(R.drawable.demo,"Nuclei"));
        topics.add(new modelclass(R.drawable.einstein,"Semiconductor Electronics: Materials, Devices, and Simple Circuits"));
        topics.add(new modelclass(R.drawable.atom,"Communication Systems"));
        recyclerView.setAdapter(twadapter);


        return view;
    }
    @Override
    public void itemOnclick(modelclass model) {

        String chapter = model.getTopic();
        int flag = 16;

        if (chapter.equals("Electric Charges and Fields")) {
            flag = 16;
        } else if (chapter.equals("Electrostatic Potential and Capacitance")) {
            flag = 17;
        } else if (chapter.equals("Current Electricity")) {
            flag = 18;
        } else if (chapter.equals("Moving Charges and Magnetism")) {
            flag = 19;
        } else if (chapter.equals("Magnetism and Matter")) {
            flag = 20;
        } else if (chapter.equals("Electromagnetic Induction")) {
            flag = 21;
        } else if (chapter.equals("Alternating Current")) {
            flag = 22;
        } else if (chapter.equals("Electromagnetic Waves")) {
            flag = 23;
        } else if (chapter.equals("Ray Optics and Optical Instruments")) {
            flag = 24;
        } else if (chapter.equals("Wave Optics")) {
            flag = 25;
        } else if (chapter.equals("Dual Nature of Radiation and Matter")) {
            flag = 26;
        } else if (chapter.equals("Atoms")) {
            flag = 27;
        } else if (chapter.equals("Nuclei")) {
            flag = 28;
        } else if (chapter.equals("Semiconductor Electronics: Materials, Devices, and Simple Circuits")) {
            flag = 29;
        } else if (chapter.equals("Communication Systems")) {
            flag = 30;
        }

        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra("flag", flag);
        startActivity(intent);

    }
}