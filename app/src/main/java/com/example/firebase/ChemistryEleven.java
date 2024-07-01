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


public class ChemistryEleven extends Fragment implements SelectItem {
        RecyclerView recyclerView;
        ArrayList<modelclass> chemistChapter;
        ChemistElevenAdapter chemistAdapter;

    public ChemistryEleven() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chemistry_eleven, container, false);
        recyclerView = v.findViewById(R.id.chmistrec);
        chemistChapter = new ArrayList<>();
        chemistAdapter = new ChemistElevenAdapter(getActivity(),chemistChapter,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(chemistAdapter);


        chemistChapter.add(new modelclass(R.drawable.chemistry, "Some Basic Concepts of Chemistry"));
        chemistChapter.add(new modelclass(R.drawable.atom, "Structure of Atom"));
        chemistChapter.add(new modelclass(R.drawable.periodictable, "Classification of Elements and Periodicity in Properties"));
        chemistChapter.add(new modelclass(R.drawable.testtubes, "Chemical Bonding and Molecular Structure"));
        chemistChapter.add(new modelclass(R.drawable.bloodsample, "States of Matter"));
        chemistChapter.add(new modelclass(R.drawable.flask, "Thermodynamics"));
        chemistChapter.add(new modelclass(R.drawable.testtubes, "Equilibrium"));
        chemistChapter.add(new modelclass(R.drawable.chemistry, "Redox Reactions"));
        chemistChapter.add(new modelclass(R.drawable.atom, "Hydrogen"));
        chemistChapter.add(new modelclass(R.drawable.bloodsample, "The s-Block Elements"));
        chemistChapter.add(new modelclass(R.drawable.periodictable, "The p-Block Elements"));
        chemistChapter.add(new modelclass(R.drawable.chemistry, "Organic Chemistry - Some Basic Principles and Techniques"));
        chemistChapter.add(new modelclass(R.drawable.flask, "Hydrocarbons"));
        chemistChapter.add(new modelclass(R.drawable.periodictable, "Environmental Chemistry"));
        return v;
    }

    public void itemOnclick(modelclass model) {

        String chapter = model.getTopic();
        int chemistflag = 1;

        if (chapter.equals("Some Basic Concepts of Chemistry")) {
            chemistflag = 1;
        } else if (chapter.equals("Structure of Atom")) {
            chemistflag = 2;
        } else if (chapter.equals("Classification of Elements and Periodicity in Properties")) {
            chemistflag = 3;
        } else if (chapter.equals("Chemical Bonding and Molecular Structure")) {
            chemistflag = 4;
        } else if (chapter.equals("States of Matter: Gases and Liquids")) {
            chemistflag = 5;
        } else if (chapter.equals("Chemical Thermodynamics")) {
            chemistflag = 6;
        } else if (chapter.equals("Equilibrium")) {
            chemistflag = 7;
        } else if (chapter.equals("Redox Reactions")) {
            chemistflag = 8;
        } else if (chapter.equals("Hydrogen")) {
            chemistflag = 9;
        } else if (chapter.equals("The s-Block Elements (Alkali and Alkaline Earth Metals)")) {
            chemistflag = 10;
        } else if (chapter.equals("The p-Block Elements")) {
            chemistflag = 11;
        } else if (chapter.equals("Organic Chemistry: Some Basic Principles and Techniques")) {
            chemistflag = 12;
        } else if (chapter.equals("Hydrocarbons")) {
            chemistflag = 13;
        } else if (chapter.equals("Environmental Chemistry")) {
            chemistflag = 14;
        }

        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra("chemistflag", chemistflag);
        startActivity(intent);

    }
}