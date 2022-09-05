package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Layout_Frame extends AppCompatActivity {

    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_frame);

        btnRegresar = findViewById(R.id.btnLAFRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Layout_Frame.this, "Regresando al menú de Layouts", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}