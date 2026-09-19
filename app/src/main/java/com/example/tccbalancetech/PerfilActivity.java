package com.example.tccbalancetech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    ImageButton btnMenuPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_perfil);


        btnMenuPerfil = findViewById(R.id.btnMenuPerfil);



        btnMenuPerfil.setOnClickListener(v -> {

            Intent intent = new Intent(
                    PerfilActivity.this,
                    MenuActivity.class
            );

            startActivity(intent);

        });

    }
}