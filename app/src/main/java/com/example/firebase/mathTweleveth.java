package com.example.firebase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class mathTweleveth extends Fragment implements  SelectItem {
    RecyclerView recyclerView;
    ArrayList<modelclass> mathChapter;
    mathTwelveAdapter mathAdapter;

    public mathTweleveth() {
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_math_tweleveth, container, false);
        recyclerView = v.findViewById(R.id.mathtweleve);
        mathChapter = new ArrayList<>();
        mathAdapter = new mathTwelveAdapter(getActivity(),mathChapter,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mathAdapter);
        mathChapter.add(new modelclass(R.drawable.math, "Matrices & Determinants"));
        mathChapter.add(new modelclass(R.drawable.venndiagram, "Permutations and Combinations"));
        mathChapter.add(new modelclass(R.drawable.logarithm, "Relations & Functions"));
        mathChapter.add(new modelclass(R.drawable.educate, "Sequence and Series"));
        mathChapter.add(new modelclass(R.drawable.venndiagram, "Sets"));
        mathChapter.add(new modelclass(R.drawable.math, "Straight Lines"));
        mathChapter.add(new modelclass(R.drawable.algebra, "Trigonometric Functions"));
        mathChapter.add(new modelclass(R.drawable.logarithm,"Vector algebra and three-dimensional Geometry"));

        return v;
    }


//    Applications of Derivatives
//    Applications of the Integrals
//    Complex Numbers and Quadratic Equations
//    Conic Sections
//    Continuity and Differentiability
//    Differential Equations
//    Integration
//    Inverse Trigonometric Functions
//    Limits and Derivatives
//    Matrices & Determinants
//    Permutations and Combinations
//    Relations & Functions
//    Relations and Functions
//    Sequence and Series
//            Sets
//    Straight Lines
    public void itemOnclick(modelclass model) {

        String chapter = model.getTopic();
        int mathFlag = 9;
        if (chapter.equals("Matrices & Determinants")) {
            mathFlag = 9;
        } else if (chapter.equals("Permutations and Combinations")) {
            mathFlag = 10;
        } else if (chapter.equals("Relations & Functions") || chapter.equals("Relations and Functions")) {
            mathFlag = 11;
        } else if (chapter.equals("Sequence and Series")) {
            mathFlag = 12;
        } else if (chapter.equals("Sets")) {
            mathFlag = 13;
        }
        else if (chapter.equals("Straight Lines")) {
            mathFlag = 13;
        }
        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra("mathflag", mathFlag);
        startActivity(intent);

    }


}