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


public class ChemistryTweleth extends Fragment implements  SelectItem {
    RecyclerView recyclerView;
    ArrayList<modelclass> chemistChapter;
    ChemistryTweleveAdapter chemistAdapter;


    public ChemistryTweleth() {

    }





    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chemistry_tweleth, container, false);
        recyclerView = v.findViewById(R.id.chmisttweleve);
        chemistChapter = new ArrayList<>();
        chemistAdapter = new ChemistryTweleveAdapter(getActivity(),chemistChapter,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(chemistAdapter);

        chemistChapter.add(new modelclass(R.drawable.chemistry, "The Solid State"));
        chemistChapter.add(new modelclass(R.drawable.atom, "Solutions"));
        chemistChapter.add(new modelclass(R.drawable.periodictable, "Electrochemistry"));
        chemistChapter.add(new modelclass(R.drawable.testtubes, "Chemical Kinetics"));
        chemistChapter.add(new modelclass(R.drawable.bloodsample, "Surface Chemistry"));
        chemistChapter.add(new modelclass(R.drawable.flask, "General Principles and Processes of Isolation of Elements"));
        chemistChapter.add(new modelclass(R.drawable.testtubes, "The p-Block Elements"));
        chemistChapter.add(new modelclass(R.drawable.chemistry, "The d- and f-Block Elements"));
        chemistChapter.add(new modelclass(R.drawable.atom, "Coordination Compounds"));
        chemistChapter.add(new modelclass(R.drawable.bloodsample, "Haloalkanes and Haloarenes"));
        chemistChapter.add(new modelclass(R.drawable.periodictable, "Alcohols, Phenols, and Ethers"));
        chemistChapter.add(new modelclass(R.drawable.chemistry, "Aldehydes, Ketones, and Carboxylic Acids"));
        chemistChapter.add(new modelclass(R.drawable.flask, "Amines"));
        chemistChapter.add(new modelclass(R.drawable.periodictable, "Biomolecules"));
        chemistChapter.add(new modelclass(R.drawable.chemistry, "Polymers"));
        chemistChapter.add(new modelclass(R.drawable.flask, "Chemistry in Everyday Life"));
        return v;
    }
    public void itemOnclick(modelclass model) {

        String chapter = model.getTopic();
        int chemistflag = 15;

        if (chapter.equals("The Solid State")) {
            chemistflag = 15;
        } else if (chapter.equals("Solutions")) {
            chemistflag = 16;
        } else if (chapter.equals("Electrochemistry")) {
            chemistflag = 17;
        } else if (chapter.equals("Chemical Kinetics")) {
            chemistflag = 18;
        } else if (chapter.equals("Surface Chemistry")) {
            chemistflag = 19;
        } else if (chapter.equals("General Principles and Processes of Isolation of Elements")) {
            chemistflag = 20;
        } else if (chapter.equals("The p-Block Elements")) {
            chemistflag = 21;
        } else if (chapter.equals("The d- and f-Block Elements")) {
            chemistflag = 22;
        } else if (chapter.equals("Coordination Compounds")) {
            chemistflag = 23;
        } else if (chapter.equals("Haloalkanes and Haloarenes")) {
            chemistflag = 24;
        } else if (chapter.equals("Alcohols, Phenols, and Ethers")) {
            chemistflag = 25;
        } else if (chapter.equals("Aldehydes, Ketones, and Carboxylic Acids")) {
            chemistflag = 26;
        } else if (chapter.equals("Amines")) {
            chemistflag = 27;
        } else if (chapter.equals("Biomolecules")) {
            chemistflag = 28;
        } else if (chapter.equals("Polymers")) {
            chemistflag = 29;
        } else if (chapter.equals("Chemistry in Everyday Life")) {
            chemistflag = 30;
        }

        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra("chemistflag", chemistflag);
        startActivity(intent);


    }

}