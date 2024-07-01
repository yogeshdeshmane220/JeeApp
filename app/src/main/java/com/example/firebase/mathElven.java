package com.example.firebase;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class mathElven extends Fragment implements SelectItem {
    RecyclerView recyclerView;
    ArrayList<modelclass> mathChapter;
    mathElevenAdapter mathAdapter;

    public mathElven() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_math_elven, container, false);
        recyclerView = v.findViewById(R.id.mathrec);
        mathChapter = new ArrayList<>();
       mathAdapter = new mathElevenAdapter(getActivity(),mathChapter,this);
       recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(mathAdapter);
        mathChapter.add(new modelclass(R.drawable.math, "Applications of Derivatives"));
        mathChapter.add(new modelclass(R.drawable.logarithm, "Applications of the Integrals"));
        mathChapter.add(new modelclass(R.drawable.educate, "Complex Numbers and Quadratic Equations"));
        mathChapter.add(new modelclass(R.drawable.cone, "Conic Sections"));
        mathChapter.add(new modelclass(R.drawable.educate,"Continuity and Differentiability"));
        mathChapter.add(new modelclass(R.drawable.venndiagram, "Differential Equations"));
        mathChapter.add(new modelclass(R.drawable.math, "Integration"));
        mathChapter.add(new modelclass(R.drawable.logarithm, "Inverse Trigonometric Functions"));
        mathChapter.add(new modelclass(R.drawable.educate, "Limits and Derivatives"));

//        mathChapter.add(new modelclass(R.drawable.matrices_and_determinants, "Matrices & Determinants"));
//        mathChapter.add(new modelclass(R.drawable.permutations_and_combinations, "Permutations and Combinations"));
//        mathChapter.add(new modelclass(R.drawable.relations_and_functions, "Relations & Functions"));
//        mathChapter.add(new modelclass(R.drawable.sequence_and_series, "Sequence and Series"));
//        mathChapter.add(new modelclass(R.drawable.sets, "Sets"));
//        mathChapter.add(new modelclass(R.drawable.straight_lines, "Straight Lines"));
//        mathChapter.add(new modelclass(R.drawable.trigonometric_functions, "Trigonometric Functions"));
//        mathChapter.add(new modelclass(R.drawable.vector_algebra, "Vector algebra and three-dimensional Geometry"));
        return v;
    }

    public void itemOnclick(modelclass model) {

        String chapter = model.getTopic();
        int mathFlag = 0;

        if (chapter.equals("Applications of the Integrals")) {
            mathFlag = 1;
        } else if (chapter.equals("Complex Numbers and Quadratic Equations")) {
            mathFlag = 2;
        } else if (chapter.equals("Conic Sections")) {
            mathFlag = 3;
        } else if (chapter.equals("Continuity and Differentiability")) {
            mathFlag = 4;
        } else if (chapter.equals("Differential Equations")) {
            mathFlag = 5;
        } else if (chapter.equals("Integration")) {
            mathFlag = 6;
        } else if (chapter.equals("Inverse Trigonometric Functions")) {
            mathFlag = 7;
        } else if (chapter.equals("Limits and Derivatives")) {
            mathFlag = 8;}
//       } else if (chapter.equals("Matrices & Determinants")) {
//            mathFlag = 9;
//        } else if (chapter.equals("Permutations and Combinations")) {
//            mathFlag = 10;
//        } else if (chapter.equals("Relations & Functions") || chapter.equals("Relations and Functions")) {
//            mathFlag = 11;
//        } else if (chapter.equals("Sequence and Series")) {
//            mathFlag = 12;
//        } else if (chapter.equals("Sets")) {
//            mathFlag = 13;
//        }

        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra("mathflag", mathFlag);
        startActivity(intent);

    }

}