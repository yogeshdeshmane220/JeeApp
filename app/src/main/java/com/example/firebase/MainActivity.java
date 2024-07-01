package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView reycleview;
    ArrayList<questionModel> questionset;
    RecycleAdapter adapter;
    TextView heading;
    String head ="";
    DatabaseReference reference;
    SelectItem item;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reycleview = findViewById(R.id.rcview);
//        heading = findViewById(R.id.heading);
        questionset = new ArrayList<>();
        reycleview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecycleAdapter(MainActivity.this,questionset);
        reycleview.setAdapter(adapter);
        Intent i = getIntent();
        int val = i.getIntExtra("flag",0);

        if (val == 1) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Physical World");
            Toast.makeText(this, "refe"+reference, Toast.LENGTH_SHORT).show();
        } else if (val == 2) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Units and Measurements");
        } else if (val == 3) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Motion in a Straight Line");
        } else if (val == 4) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Motion in a Plane");
        } else if (val == 5) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Laws of Motion");
        } else if (val == 6) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Work, Energy, and Power");
        } else if (val == 7) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/System of Particles and Rotational Motion");
        } else if (val == 8) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Gravitation");
        } else if (val == 9) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Mechanical Properties of Solids");
        } else if (val == 10) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Mechanical Properties of Fluids");
        } else if (val == 11) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Thermal Properties of Matter");
        } else if (val == 12) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Thermodynamics");
        } else if (val == 13) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Kinetic Theory");
        } else if (val == 14) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Oscillations");
        } else if (val == 15) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Waves");
        }
        else if (val == 16) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Electric Charges and Fields");
        } else if (val == 17) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Electrostatic Potential and Capacitance");
        } else if (val == 18) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Current Electricity");
        } else if (val == 19) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Moving Charges and Magnetism");
        } else if (val == 20) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Magnetism and Matter");
        } else if (val == 21) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Electromagnetic Induction");
        } else if (val == 22) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Alternating Current");
        } else if (val == 23) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Electromagnetic Waves");
        } else if (val == 24) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Ray Optics and Optical Instruments");
        } else if (val == 25) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Wave Optics");
        } else if (val == 26) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Dual Nature of Radiation and Matter");
        } else if (val == 27) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Atoms");
        } else if (val == 28) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Nuclei");
        } else if (val == 29) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Semiconductor Electronics: Materials, Devices, and Simple Circuits");
        } else if (val == 30) {
            reference = FirebaseDatabase.getInstance().getReference().child("physics/Communication Systems");
        }

// for chemistry

        Intent chemisti = getIntent();
        int chemistval = chemisti.getIntExtra("chemistflag",0);
        if (chemistval == 1) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Some Basic Concepts of Chemistry");
        }
        if (chemistval == 1) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Some Basic Concepts of Chemistry");
        } else if (chemistval == 2) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Structure of Atom");
        } else if (chemistval == 3) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Classification of Elements and Periodicity in Properties");
        } else if (chemistval == 4) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Chemical Bonding and Molecular Structure");
        } else if (chemistval == 5) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/States of Matter: Gases and Liquids");
        } else if (chemistval == 6) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Chemical Thermodynamics");
        } else if (chemistval == 7) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Equilibrium");
        } else if (chemistval == 8) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Redox Reactions");
        } else if (chemistval == 9) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Hydrogen");
        } else if (chemistval == 10) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/The s-Block Elements (Alkali and Alkaline Earth Metals)");
        } else if (chemistval == 11) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/The p-Block Elements");
        } else if (chemistval == 12) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Organic Chemistry: Some Basic Principles and Techniques");
        } else if (chemistval == 13) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Hydrocarbons");
        } else if (chemistval == 14) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Environmental Chemistry");
        }
        else if (chemistval == 15) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/The Solid State");
        } else if (chemistval == 16) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Solutions");
        } else if (chemistval == 17) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Electrochemistry");
        } else if (chemistval == 18) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Chemical Kinetics");
        } else if (chemistval == 19) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Surface Chemistry");
        } else if (chemistval == 20) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/General Principles and Processes of Isolation of Elements");
        } else if (chemistval == 21) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/The p-Block Elements");
        } else if (chemistval == 22) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/The d- and f-Block Elements");
        } else if (chemistval == 23) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Coordination Compounds");
        } else if (chemistval == 24) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Haloalkanes and Haloarenes");
        } else if (chemistval == 25) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Alcohols, Phenols, and Ethers");
        } else if (chemistval == 26) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Aldehydes, Ketones, and Carboxylic Acids");
        } else if (chemistval == 27) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Amines");
        } else if (chemistval == 28) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Biomolecules");
        } else if (chemistval == 29) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Polymers");
        } else if (chemistval == 30) {
            reference = FirebaseDatabase.getInstance().getReference().child("chemistry/Chemistry in Everyday Life");
        }

        //mathematics
        Intent mathIntent = getIntent();
        int mathFlag = mathIntent.getIntExtra("mathflag", 0);
//    Matrices & Determinants
//    Permutations and Combinations
//    Relations & Functions
//    Relations and Functions
//    Sequence and Series
//            Sets
//    Straight Lines
        if (mathFlag == 1) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Applications of the Integrals");
        } else if (mathFlag == 2) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Complex Numbers and Quadratic Equations");
        } else if (mathFlag == 3) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Conic Sections");
        } else if (mathFlag == 4) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Continuity and Differentiability");
        } else if (mathFlag == 5) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Differential Equations");
        } else if (mathFlag == 6) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Integration");
        } else if (mathFlag == 7) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Inverse Trigonometric Functions");
        } else if (mathFlag == 8) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Limits and Derivatives");
        }
        else if (mathFlag == 9) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Matrices & Determinants");
        }
        else if (mathFlag == 10) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Permutations and Combinations");
        }
        else if (mathFlag == 11) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Relations & Functions");
        }
        else if (mathFlag == 12) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Relations and Functions");
        }
        else if (mathFlag == 13) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Sets");
        }
        else if (mathFlag == 14) {
            reference = FirebaseDatabase.getInstance().getReference().child("math/Straight Lines");
        }


        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                questionset.clear();
                for (DataSnapshot dt : snapshot.getChildren()){
                    String question = dt.child("questions").getValue(String.class);
                    String opt1 = dt.child("option1").getValue(String.class);
                    String opt2 = dt.child("option2").getValue(String.class);
                    String opt3 = dt.child("option3").getValue(String.class);
                    String opt4 = dt.child("option4").getValue(String.class);
                    String ans = dt.child("answer").getValue(String.class);
                    questionModel quest = new questionModel(question,opt1,opt2,opt3,opt4,ans);
                    questionset.add(quest);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {


            }
        });
//        ArrayList<QuizeModel> models = new ArrayList<>();
//        Intent il = getIntent();
//        int lval = il.getIntExtra("last",0);
//        if(lval==100){
//            reference = FirebaseDatabase.getInstance().getReference().child("last_year");
//            reference.addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(@NonNull DataSnapshot snapshot) {
//                    models.clear();
//                    for (DataSnapshot dt : snapshot.getChildren()){
//                        String question = dt.child("questions").getValue(String.class);
//                        String opt1 = dt.child("option1").getValue(String.class);
//                        String opt2 = dt.child("option2").getValue(String.class);
//                        String opt3 = dt.child("option3").getValue(String.class);
//                        String opt4 = dt.child("option4").getValue(String.class);
//                        String ans = dt.child("answer").getValue(String.class);
//                        QuizeModel  quest = new QuizeModel(question,opt1,opt2,opt3,opt4,ans);
//                        models.add(quest);
//                    }
//                    adapter.notifyDataSetChanged();
//                }
//
//                @Override
//                public void onCancelled(@NonNull DatabaseError error) {
//
//
//                }
//            });
//        }



    }
}