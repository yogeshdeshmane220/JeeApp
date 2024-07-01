package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class chemsitry extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewpg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemsitry);
        tab = findViewById(R.id.tab);
        viewpg = findViewById(R.id.viewpg);
        ChemistPageAdapter adapter = new ChemistPageAdapter(getSupportFragmentManager());
        viewpg.setAdapter(adapter);
        tab.setupWithViewPager(viewpg);
    }
}