package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Buttons extends AppCompatActivity {

    TextView lblMensaje;
    Button btnBotonSimple;
    ToggleButton btnToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        lblMensaje = findViewById(R.id.lblMensaje);

        btnBotonSimple = findViewById(R.id.btnBotonSimple);
        btnBotonSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblMensaje.setText("Botón simple pulsado!");
            }
        });

        btnToggle = findViewById(R.id.btnToggle);
        btnToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (btnToggle.isChecked()) {
                    lblMensaje.setText("Botón Toggle: On");
                } else {
                    lblMensaje.setText("Botón Toggle: Off");
                }
            }
        });
    }
}