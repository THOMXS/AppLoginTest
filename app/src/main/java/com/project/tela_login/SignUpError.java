package com.project.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_error);
        Button btnSignUp = (Button) findViewById(R.id.btn_signup);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telaSignUpError = new Intent(SignUpError.this, SignUp.class);
                startActivity(telaSignUpError);
        }
    });
    }
}