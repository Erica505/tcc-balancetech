package com.example.tccbalancetech;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    ImageButton btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


        btnMenu = findViewById(R.id.btnMenu);


        btnMenu.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    MenuActivity.class
            );

            startActivity(intent);
        });
    }
}