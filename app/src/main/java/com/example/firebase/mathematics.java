package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class mathematics extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewpg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math);
        tab = findViewById(R.id.tab);
        viewpg = findViewById(R.id.viewpg);
        mathPageAdapter adapter = new mathPageAdapter(getSupportFragmentManager());
        viewpg.setAdapter(adapter);
        tab.setupWithViewPager(viewpg);
    }
}