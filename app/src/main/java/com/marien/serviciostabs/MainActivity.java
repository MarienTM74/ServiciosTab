package com.marien.serviciostabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton boton1 =(ImageButton) findViewById(R.id.imageButton);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"Recoleccion Domiciliaria",
                        Toast.LENGTH_SHORT);
                notificacion.show();

                MenuActivity.opcion=1;
                Intent intencion = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intencion);
            }
        });
        ImageButton boton2 =(ImageButton) findViewById(R.id.imageButton2);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"Barrido y Limpieza",
                        Toast.LENGTH_SHORT);
                notificacion.show();

                MenuActivity.opcion=2;
                Intent intencion = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intencion);
            }
        });
        ImageButton boton3 =(ImageButton) findViewById(R.id.imageButton3);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"Corte de Cesped",
                        Toast.LENGTH_SHORT);
                notificacion.show();

                MenuActivity.opcion=3;
                Intent intencion = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intencion);
            }
        });
        ImageButton boton4 =(ImageButton) findViewById(R.id.imageButton4);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"Poda de Arboles",
                        Toast.LENGTH_SHORT);
                notificacion.show();
                MenuActivity.opcion=4;
                Intent intencion = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intencion);
            }
        });
        ImageButton boton5 =(ImageButton) findViewById(R.id.imageButton5);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"Servicios Especiales",
                        Toast.LENGTH_SHORT);
                notificacion.show();

                MenuActivity.opcion=5;
                Intent intencion = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intencion);
            }
        });
        ImageButton boton6 =(ImageButton) findViewById(R.id.imageButton6);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast notificacion =Toast.makeText(MainActivity.this,"Saneamiento",
                        Toast.LENGTH_SHORT);
                notificacion.show();

                MenuActivity.opcion=6;
                Intent intencion = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intencion);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}