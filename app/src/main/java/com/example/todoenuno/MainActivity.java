package com.example.todoenuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Instanciamos los botones de forma global
    Button btnAcceder;
    Button btnSalir;
    //Instanciamos los edit text para validar usuario y contraseña
    EditText txtUsuario;
    EditText txtContrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mensaje de que inicia la app
        Toast.makeText(MainActivity.this, "On create", Toast.LENGTH_LONG).show();

        //Instancias de forma local
        EditText txtUser = findViewById(R.id.txtMUsuario);
        EditText txtContra = findViewById(R.id.txtMContrasenia);
        //Boton de acceder, manda al menu
        btnAcceder = findViewById(R.id.btnMAcceder);
        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = txtUser.getText().toString();
                String contra = txtContra.getText().toString();
                if (user.equals("Naarai") && contra.equals("123456")){
                    Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Boton de salida, sale de la app
        btnSalir = findViewById(R.id.btnMSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Saliendo de la aplicación", Toast.LENGTH_LONG);
                finishAffinity();
            }
        });

    }

}