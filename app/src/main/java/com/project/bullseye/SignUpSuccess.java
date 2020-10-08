package com.project.bullseye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_success);
        Button btnAbout = (Button) findViewById(R.id.btn_about);
        Intent intentSignUp = getIntent();
        String name = intentSignUp.getStringExtra("Name");

        TextView textName = (TextView) findViewById(R.id.title);
        textName.setText("Olá " + name + ". Cadastro realizado com sucesso");

        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telaSignUpSucess = new Intent(SignUpSuccess.this, Login.class);
                startActivity(telaSignUpSucess);
            }
        });
    }
}