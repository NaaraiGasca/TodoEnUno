package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    //Instanciamos los botones
    Button btnTextos, btnBotones, btnWidgets, btnLayouts, btnContainers,
            btnHelpers, btnGoogle, btnLegacy, btnAcercade, btnScroll, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);

        //Boton de Textos
        btnTextos = findViewById(R.id.btnMPTextos);
        btnTextos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Textos.class);
                startActivity(intent);
            }
        });


        //Boton de Botones
        btnBotones = findViewById(R.id.btnMPBotones);
        btnBotones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Buttons.class);
                startActivity(intent);
            }
        });


        //Boton de Widgets
        btnWidgets = findViewById(R.id.btnMPWidgets);
        btnWidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Widgets.class);
                startActivity(intent);
            }
        });


        //Boton de Layouts
        btnLayouts = findViewById(R.id.btnMPLayouts);
        btnLayouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Layouts.class);
                startActivity(intent);
            }
        });


        //Boton de Containers
        btnContainers = findViewById(R.id.btnMPContainers);
        btnContainers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Containers.class);
                startActivity(intent);
            }
        });


        //Boton de helpers
        btnHelpers = findViewById(R.id.btnMPHelpers);
        btnHelpers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Helpers.class);
                startActivity(intent);
            }
        });


        //Boton de Google
        btnGoogle = findViewById(R.id.btnMPGoogle);
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Google.class);
                startActivity(intent);
            }
        });


        //Boton de Legacy
        btnLegacy = findViewById(R.id.btnMPLegacy);
        btnLegacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Legacy.class);
                startActivity(intent);
            }
        });

        //Boton de Scroll
        btnScroll = findViewById(R.id.btnMPScrollview);
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuPrincipal.this, Scrollview.class);
                startActivity(intent);
            }
        });


        //Boton de Acerca de...
        btnAcercade = findViewById(R.id.btnMPAcercade);
        btnAcercade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCreditos();
            }
        });


        //Boton de Salida
        btnSalir = findViewById(R.id.btnMPSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuPrincipal.this, "Saliendo de la Aplicacion", Toast.LENGTH_LONG).show();
                finishAffinity(); //Cierra toda la app
            }
        });
    }


    //METODOS

    //Metodo Acerca de...
    public void getCreditos(){
        new AlertDialog.Builder(this)
                .setTitle("ACERCA DE..")
                .setMessage("" +
                        "Salma Naarai Gasca Mendoza\n" +
                        "Profesora: Rocio Elizabeth Pulido Alba \n" +
                        "Movil 2022-B \n" +
                        "vrs 001").setPositiveButton("Aceptar", null).show();
    }
}