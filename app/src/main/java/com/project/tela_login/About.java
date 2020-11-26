package com.project.tela_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button btnWelcome = (Button) findViewById(R.id.btn_about);
        Button btnUniftec = (Button) findViewById(R.id.btn_uniftec);

        btnWelcome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent telaAbout = new Intent(About.this, Welcome.class);
                startActivity(telaAbout);
            }
        });

        btnUniftec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ftec.com.br/")));
            }
        });
    }
}