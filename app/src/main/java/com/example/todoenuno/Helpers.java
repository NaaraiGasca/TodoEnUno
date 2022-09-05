package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Helpers extends AppCompatActivity {

    Button btnGuideline, btnFlow, btnGroup, btnMockview, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpers);

        //Boton de Guide Line
        btnGuideline = findViewById(R.id.btnHGuideline);
        btnGuideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Helpers.this, HGuideline.class);
                startActivity(intent);
            }
        });


        //Boton de Flow
        btnFlow = findViewById(R.id.btnHFlow);
        btnFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Helpers.this, HFlow.class);
                startActivity(intent);
            }
        });


        //Boton de Group
        btnGroup = findViewById(R.id.btnHGroup);
        btnGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Helpers.this, HGroup.class);
                startActivity(intent);
            }
        });


        //Boton de Mock View
        btnMockview = findViewById(R.id.btnHMockview);
        btnMockview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Helpers.this, HMockview.class);
                startActivity(intent);
            }
        });


        //Boton de Regresar
        btnRegresar = findViewById(R.id.btnHRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Helpers.this, "Regresando al menú principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}