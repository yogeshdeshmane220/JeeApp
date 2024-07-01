package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class quize extends AppCompatActivity {

//
//
//        TextView question, next;
//        TextView text_clock;
//        RadioGroup radioGroup;
//        QuizeModel demo;
//        ArrayList<QuizeModel> list;
//        CountDownTimer countDownTimer;
//        RadioButton op1, op2, op3, op4;
//        int currentpos = 0;
//        int score = 0;
//        RadioButton selectedButton;
//        DatabaseReference databaseReference;
//
//
//        @SuppressLint("MissingInflatedId")
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_quize);
//            next = findViewById(R.id.next);
//            question = findViewById(R.id.question);
//            radioGroup = findViewById(R.id.options);
//            op1 = findViewById(R.id.op1);
//            op2 = findViewById(R.id.op2);
//            op3 = findViewById(R.id.op3);
//            op4 = findViewById(R.id.op4);
//            text_clock = findViewById(R.id.text_clock);
//            list = new ArrayList<>();
//
//          listadd();
//
////            databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://fir-c005d-default-rtdb.firebaseio.com");
////            databaseReference.addValueEventListener(new ValueEventListener() {
////                @Override
////                public void onDataChange(@NonNull DataSnapshot snapshot) {
////                    System.out.println("error1");
////                    for(DataSnapshot dt:snapshot.child("last_year").getChildren()){
////                        String questions = dt.child("questions").getValue(String.class);
////                        String option1 = dt.child("option1").getValue(String.class);
////                        String option2 = dt.child("option2").getValue(String.class);
////                        String option3 = dt.child("option3").getValue(String.class);
////                        String option4 = dt.child("option4").getValue(String.class);
////                        String answer = dt.child("answer").getValue(String.class);
////                        System.out.println(questions);
////                        System.out.println(option1);
////
////                        QuizeModel model = new QuizeModel(questions,option1,option2,option3,option4,answer);
////                        list.add(model);
////                        setdataToViews();
////                    }
////
////                }
////
////                @Override
////                public void onCancelled(@NonNull DatabaseError error) {
////                    Toast.makeText(quize.this, "error", Toast.LENGTH_SHORT).show();
////                    System.out.println("error");
////                }
////            });
//
//
//            countDownTimer = new CountDownTimer(60000, 1000) {
//                public void onTick(long millisUntilFinished) {
//                    long minutes = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished);
//                    long seconds = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % 60;
//                    text_clock.setText(String.format("%02d:%02d", minutes, seconds));
//                }
//
//                public void onFinish() {
//                    text_clock.setText("00:00");
//                    endQuiz();
//                }
//            }.start();
//
//
//
////     Intent i = new Intent(quize.this,MainActivity.class);
////     i.getIntExtra("last",100);
////            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
////                @Override
////                public void onCheckedChanged(RadioGroup group, int checkedId) {
////                    selectedButton = findViewById(checkedId);
////                    Toast.makeText(quize.this, "Selected " + selectedButton.getText(), Toast.LENGTH_SHORT).show();
////
////                }
////            });
//
////            next.setOnClickListener(new View.OnClickListener() {
//////                QuizeModel model = list.get(currentpos);
////                @Override
////                public void onClick(View v) {
////
////                    int selectedId = radioGroup.getCheckedRadioButtonId();
////                    if (selectedId == -1) {
////                        Toast.makeText(quize.this, "Please select an option", Toast.LENGTH_SHORT).show();
////                        return;
////                    }
////
////                    selectedButton = findViewById(selectedId);
////
////                    if (selectedButton.getText().toString().equals(list.get(currentpos).getAns())) {
////                        score++;
////                        Log.d("Yogesh Deshmane", "Score: " + score);
////                    }
////
////
////                    if (currentpos >= list.size()) {
////                        endQuiz();
////                        delayStartScoreActivity();
////                    } else {
////                        setdataToViews();
////                    }
////                    selectedButton.setChecked(false);
////                    currentpos++;
////                }
////            });
////            setdataToViews();
//
////            next.setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View v) {
////                    int selectedId = radioGroup.getCheckedRadioButtonId();
////                    if (selectedId == -1) {
////                        Toast.makeText(quize.this, "Please select an option", Toast.LENGTH_SHORT).show();
////                        return;
////                    }
////
////                    selectedButton = findViewById(selectedId);
////
////                    if (list.isEmpty()) {
////                        Toast.makeText(quize.this, "Quiz data is not available", Toast.LENGTH_SHORT).show();
////                        return;
////                    }
////
////                    if (currentpos < list.size()) {
////                        if (selectedButton.getText().toString().equals(list.get(currentpos).getAns())) {
////                            score++;
////                            Log.d("Yogesh Deshmane", "Score: " + score);
////                        }
////                        setdataToViews();
////                        selectedButton.setChecked(false);
////                        currentpos++;
////                    } else {
////                        endQuiz();
////                        delayStartScoreActivity();
////                    }
////                }
////            });
////
////
////        }
//
//         void listadd() {
//            list.add(new QuizeModel("What is the chemical formula for water?", "H2O", "CO2", "NaCl", "C6H12O6", "H2O"));
//            list.add(new QuizeModel("Which planet is known as the 'Red Planet'?", "Mercury", "Venus", "Mars", "Jupiter", "Mars"));
//            list.add(new QuizeModel("What is the largest organ in the human body?", "Heart", "Brain", "Liver", "Skin", "Skin"));
//            list.add(new QuizeModel("Who discovered the theory of general relativity?", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking", "Albert Einstein"));
//            list.add(new QuizeModel("Which country is known as the 'Land of the Rising Sun'?", "China", "India", "Japan", "Russia", "Japan"));
//
//            list.add(new QuizeModel("What is the SI unit of electric current?", "Watt", "Ampere", "Volt", "Ohm", "Ampere"));
//            list.add(new QuizeModel("Which scientist is known for the discovery of the electron?", "Ernest Rutherford", "James Chadwick", "J.J. Thomson", "Niels Bohr", "J.J. Thomson"));
//            list.add(new QuizeModel("Which is the lightest gas?", "Hydrogen", "Helium", "Oxygen", "Nitrogen", "Hydrogen"));
//            list.add(new QuizeModel("What is the chemical symbol for gold?", "Ag", "Fe", "Au", "Cu", "Au"));
//            list.add(new QuizeModel("Which is the largest planet in our solar system?", "Mercury", "Venus", "Saturn", "Jupiter", "Jupiter"));
//            list.add(new QuizeModel("What is the unit of pressure?", "Pascal", "Newton", "Watt", "Joule", "Pascal"));
//            list.add(new QuizeModel("Which is the hardest substance known?", "Diamond", "Graphite", "Quartz", "Topaz", "Diamond"));
//            list.add(new QuizeModel("Who proposed the theory of evolution by natural selection?", "Charles Darwin", "Gregor Mendel", "Louis Pasteur", "Alfred Wegener", "Charles Darwin"));
//            list.add(new QuizeModel("Which gas is responsible for the ozone layer depletion?", "Oxygen", "Carbon Dioxide", "Methane", "Chlorofluorocarbons (CFCs)", "Chlorofluorocarbons (CFCs)"));
//            list.add(new QuizeModel("Which is the largest gland in the human body?", "Liver", "Pancreas", "Kidney", "Spleen", "Liver"));
//            list.add(new QuizeModel("What is the chemical formula for table salt?", "H2O", "CO2", "NaCl", "C6H12O6", "NaCl"));
//            list.add(new QuizeModel("Who developed the theory of relativity?", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking", "Albert Einstein"));
//            list.add(new QuizeModel("What is the unit of electric power?", "Watt", "Volt", "Ampere", "Ohm", "Watt"));
//            list.add(new QuizeModel("Which metal is the best conductor of electricity?", "Gold", "Silver", "Copper", "Aluminum", "Silver"));
//            list.add(new QuizeModel("What is the chemical symbol for iron?", "Ag", "Fe", "Au", "Cu", "Fe"));
//
//        }
//
//
//
//
//
//
//        private void endQuiz() {
//            countDownTimer.cancel(); // Stop the countdown timer
//
//            // Create and show a custom dialog to display the score
//            Dialog dialog = new Dialog(quize.this, R.style.dialog);
//            dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
//            dialog.setContentView(R.layout.result);
//
//            TextView scoreTextView = dialog.findViewById(R.id.score);
//            scoreTextView.setText(String.valueOf(score));
//
//            dialog.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    finish();
//                    startActivity(new Intent(quize.this,MainActivity.class));
//                    dialog.dismiss();
//
//                }
//            });
//
//            dialog.show();
//        }
//
//        private void delayStartScoreActivity() {
//            int delayMilliseconds = 10000; // Adjust the delay time as needed (in milliseconds)
//
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    startActivity(new Intent(quize.this,Start.class));
//                }
//            }, delayMilliseconds);
//        }
//
//
//
////        private void setdataToViews(int currentpos) {
////            question.setText(list.get(currentpos).getQuestion());
////            op1.setText(list.get(currentpos).getOp1());
////            op2.setText(list.get(currentpos).getOp2());
////            op3.setText(list.get(currentpos).getOp3());
////            op4.setText(list.get(currentpos).getOp4());
////        }
//    private void setdataToViews() {
//                demo = list.get(currentpos);
//                question.setText(demo.getQuestion());
//                op1.setText(demo.getOp1());
//                op2.setText(demo.getOp2());
//                op3.setText(demo.getOp3());
//                op4.setText(demo.getOp4());
//                System.out.println("setting data");
////        if (currentpos >= 0 && currentpos < list.size()) {
////            demo = list.get(currentpos);
////            question.setText(demo.getQuestion());
////            op1.setText(demo.getOp1());
////            op2.setText(demo.getOp2());
////            op3.setText(demo.getOp3());
////            op4.setText(demo.getOp4());
////            System.out.println("setting data");
////        } else {
////            // Handle the case where currentpos is invalid
////            Toast.makeText(quize.this, "Invalid question index", Toast.LENGTH_SHORT).show();
////        }
//
//            }
TextView question, next;
    TextView text_clock;
    RadioGroup radioGroup;
    ArrayList<QuizeModel> list ;
    CountDownTimer countDownTimer;
    RadioButton op1, op2, op3, op4;
    int currentpos = 0;
    int score = 0;
    QuizeModel model;
    RadioButton selectedButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.next);
        question = findViewById(R.id.question);
        radioGroup = findViewById(R.id.options);
        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);
        text_clock = findViewById(R.id.text_clock);
        list = new ArrayList<>();
        model = new QuizeModel();
        listadd();
            setdataToViews(currentpos);
        countDownTimer = new CountDownTimer(60000, 1000) {
            public void onTick(long millisUntilFinished) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished);
                long seconds = TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) % 60;
                text_clock.setText(String.format("%02d:%02d", minutes, seconds));
            }

            public void onFinish() {
                text_clock.setText("00:00");
                endQuiz();
            }
        }.start();

        setdataToViews(currentpos);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                selectedButton = findViewById(checkedId);
                Toast.makeText(quize.this, "Selected " + selectedButton.getText(), Toast.LENGTH_SHORT).show();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedButton.getText().toString().equals(list.get(currentpos).getAns())) {
                    score++;
                    Log.d("Yogesh Deshmane", "Score: " + score);
                }
                selectedButton.setChecked(false);
                currentpos++;
                if (currentpos == list.size()) {
                    endQuiz();
                    delayStartScoreActivity();

                } else {
                    setdataToViews(currentpos);
                }
            }
        });

    }

    private void listadd() {
        list.add(new QuizeModel("What is the chemical formula for water?", "H2O", "CO2", "NaCl", "C6H12O6", "H2O"));
        list.add(new QuizeModel("Which planet is known as the 'Red Planet'?", "Mercury", "Venus", "Mars", "Jupiter", "Mars"));
        list.add(new QuizeModel("Who discovered the theory of general relativity?", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking", "Albert Einstein"));
        list.add(new QuizeModel("What is the largest organ in the human body?", "Heart", "Brain", "Liver", "Skin", "Skin"));
        list.add(new QuizeModel("Which country is known as the 'Land of the Rising Sun'?", "China", "India", "Japan", "Russia", "Japan"));

        list.add(new QuizeModel("What is the SI unit of electric current?", "Watt", "Ampere", "Volt", "Ohm", "Ampere"));
        list.add(new QuizeModel("Which scientist is known for the discovery of the electron?", "Ernest Rutherford", "James Chadwick", "J.J. Thomson", "Niels Bohr", "J.J. Thomson"));
        list.add(new QuizeModel("Which is the lightest gas?", "Hydrogen", "Helium", "Oxygen", "Nitrogen", "Hydrogen"));
        list.add(new QuizeModel("What is the chemical symbol for gold?", "Ag", "Fe", "Au", "Cu", "Au"));
        list.add(new QuizeModel("Which is the largest planet in our solar system?", "Mercury", "Venus", "Saturn", "Jupiter", "Jupiter"));
        list.add(new QuizeModel("What is the unit of pressure?", "Pascal", "Newton", "Watt", "Joule", "Pascal"));
        list.add(new QuizeModel("Which is the hardest substance known?", "Diamond", "Graphite", "Quartz", "Topaz", "Diamond"));
        list.add(new QuizeModel("Who proposed the theory of evolution by natural selection?", "Charles Darwin", "Gregor Mendel", "Louis Pasteur", "Alfred Wegener", "Charles Darwin"));
        list.add(new QuizeModel("Which gas is responsible for the ozone layer depletion?", "Oxygen", "Carbon Dioxide", "Methane", "Chlorofluorocarbons (CFCs)", "Chlorofluorocarbons (CFCs)"));
        list.add(new QuizeModel("Which is the largest gland in the human body?", "Liver", "Pancreas", "Kidney", "Spleen", "Liver"));
        list.add(new QuizeModel("What is the chemical formula for table salt?", "H2O", "CO2", "NaCl", "C6H12O6", "NaCl"));
        list.add(new QuizeModel("Who developed the theory of relativity?", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking", "Albert Einstein"));
        list.add(new QuizeModel("What is the unit of electric power?", "Watt", "Volt", "Ampere", "Ohm", "Watt"));
        list.add(new QuizeModel("Which metal is the best conductor of electricity?", "Gold", "Silver", "Copper", "Aluminum", "Silver"));
        list.add(new QuizeModel("What is the chemical symbol for iron?", "Ag", "Fe", "Au", "Cu", "Fe"));

    }


    private void endQuiz() {
        countDownTimer.cancel(); // Stop the countdown timer

        // Create and show a custom dialog to display the score
        Dialog dialog = new Dialog(quize.this, R.style.dialog);
        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        dialog.setContentView(R.layout.result);

        TextView scoreTextView = dialog.findViewById(R.id.score);
        scoreTextView.setText(String.valueOf(score));

        dialog.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(quize.this,Start.class));
                dialog.dismiss();

            }
        });

        dialog.show();
    }

    private void delayStartScoreActivity() {
        int delayMilliseconds = 10000; // Adjust the delay time as needed (in milliseconds)

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(quize.this, Start.class));
            }
        }, delayMilliseconds);
    }



    private void setdataToViews(int currentpos) {

        question.setText(list.get(currentpos).getQuestion());
        op1.setText(list.get(currentpos).getOp1());
        op2.setText(list.get(currentpos).getOp2());
        op3.setText(list.get(currentpos).getOp3());
        op4.setText(list.get(currentpos).getOp4());
    }
}