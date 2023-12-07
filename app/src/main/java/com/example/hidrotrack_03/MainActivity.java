package com.example.hidrotrack_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciar las variables
        Button btn12 = findViewById(R.id.btn12);
        Button btn13 = findViewById(R.id.btn13);
        Button btn14 = findViewById(R.id.btn14);
        Button btn15 = findViewById(R.id.btn15);
        Button btn16 = findViewById(R.id.btn16);

        //Ponemos a escuchar los botones y generamos el intent
        //Primero para ir de Home a Consumption
        btn12.setOnClickListener(v -> {
            //Generar el intent para ir a la segunda actividad
            Intent irAConsu = new Intent(MainActivity.this, ActivityWaterConsumption.class);
            startActivity(irAConsu);
        });
        //Segundo para ir de Home a Tips
        btn13.setOnClickListener(v -> {
            //Generar el intent para ir a la segunda actividad
            Intent irATips = new Intent(MainActivity.this, ActivityTips.class);
            startActivity(irATips);
        });
        //Tercero para ir de Home a Progress
        btn14.setOnClickListener(v -> {
            //Generar el intent para ir a la segunda actividad
            Intent irAProgre = new Intent(MainActivity.this, ActivityProgress.class);
            startActivity(irAProgre);
        });
        //Cuarto para ir de Home a Info
        btn15.setOnClickListener(v -> {
            //Generar el intent para ir a la segunda actividad
            Intent irAInfo = new Intent(MainActivity.this, ActivityInfo.class);
            startActivity(irAInfo);
        });
        //Finalmente para ir de Home a Settings
        btn16.setOnClickListener(v -> {
            //Generar el intent para ir a la segunda actividad
            Intent irASet = new Intent(MainActivity.this, ActivitySettings.class);
            startActivity(irASet);
        });


    }
}