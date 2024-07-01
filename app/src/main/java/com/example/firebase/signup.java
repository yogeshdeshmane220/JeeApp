package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    EditText signupemail,signuppassword,signupname;
    Button signupButton;
    TextView gotologin;

    FirebaseDatabase fbdatabase;
    FirebaseAuth firebaseAuth;
    DatabaseReference fbreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signupemail = findViewById(R.id.SignUpmail);
        signupname = findViewById(R.id.SignUpName);
        signuppassword = findViewById(R.id.SignUpPassword);
        signupButton= findViewById(R.id.SignUpButton);
        gotologin = findViewById(R.id.GotoLogin);
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loding");
        progressDialog.setMessage("Please Wait!");

//        signupButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String username = signupname.getText().toString();
//                String useremail = signupemail.getText().toString();
//                String  userpassword = signuppassword.getText().toString();
//                if(userpassword.length()<=6){
//                    Toast.makeText(signup.this, "Password must have more than 6 letter", Toast.LENGTH_SHORT).show();
//                } else if (userpassword.length()>6) {
//                    progressDialog.show();
//
//                    if(!useremail.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(useremail).matches() && !userpassword.isEmpty()){
//
//                        fbdatabase = FirebaseDatabase.getInstance();
//                        fbreference = fbdatabase .getReference("users");
//                        firebaseAuth = FirebaseAuth.getInstance();
//
//                        firebaseAuth.createUserWithEmailAndPassword(useremail,userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                progressDialog.hide();
//                                if(task.isComplete()){
//                                    firebaseAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
//                                        @Override
//                                        public void onComplete(@NonNull Task<Void> task) {
//                                            if(task.isSuccessful()){
//                                                startActivity(new Intent(signup.this,login.class));
//                                                Toast.makeText(signup.this, "verify ur mail", Toast.LENGTH_SHORT).show();
//                                            }
//                                            else{
//                                                Toast.makeText(signup.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                                            }
//
//                                        }
//                                    });
//
//
//
//                                }
//                                else {
//                                    Toast.makeText(signup.this, "Failed to Register", Toast.LENGTH_SHORT).show();
//                                }
//
//                            }
//                        });
//
////                    LoginSignupHelper helper = new LoginSignupHelper(username,userpassword,useremail);
////                    fbreference.child(username).setValue(helper);
////                    Toast.makeText(signup.this, "You Sign Up Successfully", Toast.LENGTH_SHORT).show();
//
////                    Intent signintent = new Intent(signup.this,MainActivity.class);
////                    startActivity(signintent);
//                    }}
//                else {
//                    if(userpassword.isEmpty()){
//                        Toast.makeText(signup.this, "Enter the password", Toast.LENGTH_SHORT).show();
//                    }
//                    if(useremail.isEmpty()){
//                        Toast.makeText(signup.this, "Enter the email", Toast.LENGTH_SHORT).show();
//                    }
//
//                    Toast.makeText(signup.this, "Invalid email", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = signupname.getText().toString();
                String useremail = signupemail.getText().toString();
                String userpassword = signuppassword.getText().toString();

                if (userpassword.length() <= 6) {
                    Toast.makeText(signup.this, "Password must have more than 6 letters", Toast.LENGTH_SHORT).show();
                } else if (!useremail.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(useremail).matches() && !userpassword.isEmpty()) {
                    progressDialog.show();

                    firebaseAuth = FirebaseAuth.getInstance();
                    firebaseAuth.createUserWithEmailAndPassword(useremail, userpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.hide();
                            if (task.isSuccessful()) {
                                firebaseAuth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()) {
                                            Toast.makeText(signup.this, "Verification email sent. Please verify your email.", Toast.LENGTH_SHORT).show();
                                            startActivity(new Intent(signup.this, login.class));
                                            finish();
                                        } else {
                                            Toast.makeText(signup.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            } else {
                                Toast.makeText(signup.this, "Failed to register: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                } else {
                    if (useremail.isEmpty()) {
                        Toast.makeText(signup.this, "Enter the email", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(signup.this, "Invalid email", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this,login.class);
                startActivity(intent);
                finish();
            }
        });

    }
}