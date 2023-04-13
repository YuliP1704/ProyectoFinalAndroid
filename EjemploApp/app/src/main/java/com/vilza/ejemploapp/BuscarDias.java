package com.vilza.ejemploapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BuscarDias extends AppCompatActivity {

    TextView titulo;
    TextView pregunta;
    Button buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_dias);

        titulo = findViewById(R.id.texto1);
        pregunta = findViewById(R.id.texto2);
        buscar = findViewById(R.id.btnBuscar2);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}