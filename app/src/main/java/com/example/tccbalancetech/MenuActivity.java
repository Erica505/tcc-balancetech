package com.example.tccbalancetech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    LinearLayout menuHome;
    LinearLayout menuPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_menu);


        menuHome = findViewById(R.id.menuHome);
        menuPerfil = findViewById(R.id.menuPerfil);


        menuHome.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MenuActivity.this,
                    MainActivity.class
            );

            startActivity(intent);
        });


        menuPerfil.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MenuActivity.this,
                    PerfilActivity.class
            );

            startActivity(intent);
        });
    }
}

