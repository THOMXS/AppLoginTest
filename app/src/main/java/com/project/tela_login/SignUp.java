package com.project.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnSave = (Button) findViewById(R.id.btn_save);

        btnSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText txtName = (EditText) findViewById(R.id.txt_name);
                EditText txtAddress = (EditText) findViewById(R.id.txt_address);
                EditText txtNumber = (EditText) findViewById(R.id.txt_number);
                EditText txtCep = (EditText) findViewById(R.id.txt_cep);
                EditText txtComplement = (EditText) findViewById(R.id.txt_complement);
                EditText txtEmail = (EditText) findViewById(R.id.txt_email);

                String Name = txtName.getText().toString();
                String Address = txtAddress.getText().toString();
                String Number = txtNumber.getText().toString();
                String CEP = txtCep.getText().toString();
                String Complement = txtComplement.getText().toString();
                String Email = txtEmail.getText().toString();

                if( Name.equals("") || Address.equals("") || Number.equals("") || CEP.equals("") || Complement.equals("") || Email.equals("")){
                    
                    Intent intentSignUpError = new Intent(SignUp.this, SignUpError.class);
                    startActivity(intentSignUpError);
                } else {
                    Intent intentSignUpSuccess = new Intent(SignUp.this, SignUpSuccess.class);
                    intentSignUpSuccess.putExtra("Name", Name);
                    startActivity(intentSignUpSuccess);
                }
            }
        });
    }
}