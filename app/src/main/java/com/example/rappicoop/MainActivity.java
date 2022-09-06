package com.example.rappicoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nom, ape, edad, corr, con;
    Button aceptar, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Registro");

        nom = (EditText)findViewById(R.id.editNombre);
        ape = (EditText)findViewById(R.id.editApellido);
        edad = (EditText)findViewById(R.id.editEdad);
        corr = (EditText)findViewById(R.id.editCorreo);
        con = (EditText)findViewById(R.id.editContraseña);
        aceptar = (Button)findViewById(R.id.btnAceptar);
        cancelar = (Button)findViewById(R.id.btnCancelar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}