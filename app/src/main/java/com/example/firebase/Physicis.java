package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Physicis extends AppCompatActivity {
        TabLayout tab;
        ViewPager viewpg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicis);
        tab = findViewById(R.id.tab);
        viewpg = findViewById(R.id.viewpg);

        PageAdapter adapter = new PageAdapter(getSupportFragmentManager());
        viewpg.setAdapter(adapter);
        tab.setupWithViewPager(viewpg);
    }
}