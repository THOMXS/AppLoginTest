package com.project.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_error);
        Button btnAbout = (Button) findViewById(R.id.btn_about);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telaLoginError = new Intent(LoginError.this, Login.class);
                startActivity(telaLoginError);
            }
        });
    }
}