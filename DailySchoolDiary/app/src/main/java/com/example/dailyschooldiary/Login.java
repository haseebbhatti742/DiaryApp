package com.example.dailyschooldiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class Login extends AppCompatActivity {

    EditText editTextUsername, editTextPassword;
    Button buttonLogin;
    TextView textViewRegisterLink;
    View parentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewRegisterLink = findViewById(R.id.textViewRegisterLink);

        parentLayout = findViewById(android.R.id.content);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(TextUtils.isEmpty(editTextUsername.getText())){
//                    Snackbar.make(parentLayout, "Please Enter Username or Email", Snackbar.LENGTH_LONG).show();
//                }
//                else if(TextUtils.isEmpty(editTextPassword.getText())){
//                    Snackbar.make(parentLayout, "Please Enter Password", Snackbar.LENGTH_LONG).show();
//                }
//                else {
//                    startActivity(new Intent(Login.this, Home.class));
//                }
                startActivity(new Intent(Login.this, Home.class));
            }
        });

        textViewRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register.class));
            }
        });
    }
}
