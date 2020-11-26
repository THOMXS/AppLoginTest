package com.project.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();

        Button btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText txtEmail = (EditText) findViewById(R.id.txt_email);
                EditText txtPassword = (EditText) findViewById(R.id.txt_password);
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();
                if (email.equals("vittoria_thomasini@acad.ftec.com.br") == true && password.equals("123456") == true) {
                    Intent intentLoginSuccess = new Intent(Login.this, LoginSuccess.class);
                    startActivity(intentLoginSuccess);
                } else {
                    Intent intentLoginError = new Intent(Login.this, LoginError.class);
                    startActivity(intentLoginError);
                }
            }
        });
        @Override
        public void onStart(){
            super.onStart();
            // Check if user is signed in (non-null) and update UI accordingly.
            FirebaseUser currentUser = mAuth.getCurrentUser();
            updateUI(currentUser);
        }
    }
}