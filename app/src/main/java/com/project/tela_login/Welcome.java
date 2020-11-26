package com.project.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnLogin = (Button) findViewById(R.id.btn_login);
        Button btnRegister = (Button) findViewById(R.id.btn_register);
        Button btnAbout = (Button) findViewById(R.id.btn_about);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telaLogin = new Intent(Welcome.this, Login.class);
                startActivity(telaLogin);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telaRegister = new Intent(Welcome.this, SignUp.class);
                startActivity(telaRegister);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telaAbout = new Intent(Welcome.this, About.class);
                startActivity(telaAbout);
            }
        });
    }
}