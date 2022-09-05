package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Layout_Table extends AppCompatActivity {

    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_table);

        btnRegresar = findViewById(R.id.btnLATRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Layout_Table.this, "Regresando al menú de Layouts", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}