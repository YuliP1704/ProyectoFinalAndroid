package com.vilza.ejemploapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tareas extends AppCompatActivity {

    TextView tareas;
    Button cerrarSesion;
    Button buscar;
    Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas);

        tareas = findViewById(R.id.tareas);
        cerrarSesion = findViewById(R.id.btnCerrarSesion);
        buscar = findViewById(R.id.btnBuscar);
        crear = findViewById(R.id.btnCrear2);

        cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}