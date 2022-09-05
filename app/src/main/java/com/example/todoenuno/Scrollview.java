package com.example.todoenuno;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Scrollview extends AppCompatActivity {

    Button btnScrollH;
    Button btnScrollN;
    Button btnScrollNormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);

        btnScrollH = findViewById(R.id.btnScrollHMenu);
        btnScrollH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scrollview.this,SHorizontal.class);
                startActivity(intent);

            }
        });

        btnScrollN = findViewById(R.id.btnScrollNMenu);
        btnScrollN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scrollview.this,SNested.class);
                startActivity(intent);
            }
        });

        btnScrollNormal = findViewById(R.id.btnScrollNormalMenu);
        btnScrollNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Scrollview.this,SNormal.class);
                startActivity(intent);
            }
        });

    }
}
