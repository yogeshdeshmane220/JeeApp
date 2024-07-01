package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    EditText loginemail,loginpassword;
    Button loginButton;
    TextView gotosignup;
    SharedPreferences loginpreferce;
    boolean loginstatus;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginemail = findViewById(R.id.loginemail);
        loginpassword = findViewById(R.id.loginPassword);
        loginButton = findViewById(R.id.LoginButton);
        gotosignup = findViewById(R.id.goTosignup);
        loginpreferce = getSharedPreferences("loginPrefs",MODE_PRIVATE);
        loginstatus = loginpreferce.getBoolean("loginstatus",false);

        if (loginstatus){
            startActivity(new Intent(login.this,Start.class));
            finish();
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        // loginbutton listner
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usermail = loginemail.getText().toString();
                String userpassword = loginpassword.getText().toString();



                if(usermail.isEmpty() || userpassword.isEmpty()){
                    Toast.makeText(login.this, "Enter the email or password", Toast.LENGTH_SHORT).show();
                    return;

                }
                firebaseAuth.signInWithEmailAndPassword(usermail,userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if(task.isSuccessful()){

                            if(firebaseAuth.getCurrentUser().isEmailVerified()){
                                SharedPreferences.Editor loginprefeditor = loginpreferce.edit();
                                loginprefeditor.putBoolean("loginstatus",true);
                                loginprefeditor.apply();

                                Intent intent = new Intent(login.this,Start.class);
                                startActivity(intent);
                                finish();
                            }
                            else{
                                Toast.makeText(login.this, "verify your email", Toast.LENGTH_SHORT).show();
                            }


                        }
                        else {
                            Toast.makeText(login.this, "Invalid Email or password", Toast.LENGTH_SHORT).show();
                        }

                    }

                });

            }
        });





        gotosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gosignup = new Intent(login.this,signup.class);
                startActivity(gosignup);
            }
        });










    }
}