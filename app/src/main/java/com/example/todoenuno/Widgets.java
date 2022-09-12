package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Widgets extends AppCompatActivity {
    Button btnRegresar;
    Button btnWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        //Boton al menu principal
        btnRegresar = findViewById(R.id.btnWRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Widgets.this, "Regresando al menú principal", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnWebview = findViewById(R.id.bmainpw);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent( Widgets.this, Wwebview.class );
                startActivity(i);
            }
        });

    }

    // ir de la view sencilla a la image view
    public void siguiente(View view){
        Intent siguiente= new Intent( this, WImageview.class );
        startActivity(siguiente);
    }

    public void paginaweb(View view){
        Intent paginaweb= new Intent( Widgets.this, Wwebview.class );
        startActivity(paginaweb);
    }

    public void videoweb(View view){
        Intent videoweb= new Intent( this, WVideoview.class );
        startActivity(videoweb);
    }

    public void calendario(View view){
        Intent cale= new Intent( this, Wcalendario.class );
        startActivity(cale);
    }
}