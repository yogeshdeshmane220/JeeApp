package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Start extends AppCompatActivity {
        CardView c1,c2,c3,c4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        c1 = findViewById(R.id.physics);
        c2 = findViewById(R.id.chemistry);
        c3 = findViewById(R.id.mathematics);
        c4 = findViewById(R.id.lastyear);
        ImageView log = findViewById(R.id.logout);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this,Physicis.class);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this,chemsitry.class);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this,mathematics.class);
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start.this,quize.class);
                Intent ilast = new Intent(Start.this,MainActivity.class);
                ilast.putExtra("tushar",100);
                startActivity(intent);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Start.this,login.class));
            }
        });
    }
}