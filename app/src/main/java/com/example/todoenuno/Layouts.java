package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Layouts extends AppCompatActivity {
    //Instanciamos los botones
    Button btnConstraint, btnFrame, btnLinear, btnTable, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        btnConstraint = findViewById(R.id.btnLAConstraint);
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Layouts.this, Layout_Constraint.class);
                startActivity(intent);
            }
        });

        btnFrame = findViewById(R.id.btnLAFrames);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Layouts.this, Layout_Frame.class);
                startActivity(intent);
            }
        });

        btnLinear = findViewById(R.id.btnLALinear);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Layout_Linear.class);
                startActivity(intent);
            }
        });

        btnTable = findViewById(R.id.btnLATable);
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(), Table.class);
                //startActivity(intent);

            }
        });

        btnRegresar = findViewById(R.id.btnLARegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Layouts.this, "Regresando al menú principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}