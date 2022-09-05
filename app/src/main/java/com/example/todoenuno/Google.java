package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Google extends AppCompatActivity {

    Button btnMaps, btnAds, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        //Boton de Maps
        btnMaps = findViewById(R.id.btnGMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Google.this, GMaps.class);
                startActivity(intent);
            }
        });

        //Boton de Anuncios
        btnAds = findViewById(R.id.btnGAds);
        btnAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Google.this, GAds.class);
                startActivity(intent);
            }
        });

        //Boton al menu principal
        btnRegresar = findViewById(R.id.btnGRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Google.this, "Regresando al menú principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}