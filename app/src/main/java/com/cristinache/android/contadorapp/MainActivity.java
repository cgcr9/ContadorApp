package com.cristinache.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variables de instancia
    EditText cConteo;
    Button bContar;
    Button bReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se busca los id y se convierten al tipo de dato del widget
        cConteo = (EditText) findViewById(R.id.campoConteo);
        bContar = (Button) findViewById(R.id.botonContar);
        bReiniciar = (Button) findViewById(R.id.botonReiniciar);

        bContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = cConteo.getText().toString();
                int i = Integer.parseInt(s);
                i++;
                s = Integer.toString(i);
                cConteo.setText(s); //Se visualiza el nuevo valor en el EditText
            }
        });

        bReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cConteo.setText("0"); //el conteo se muestra a 0
            }
        });
    }
}
