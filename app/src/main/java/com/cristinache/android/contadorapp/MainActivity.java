package com.cristinache.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variables de instancia
    private EditText cConteo;
    private Button bContar;
    private Button bReiniciar;
    private int i = 0;
    private final String TEXTO_CONTEO = "campoConteo"; //es la llave

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        i = Integer.parseInt(cConteo.getText().toString());
        outState.putInt(TEXTO_CONTEO, i);

    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se busca los id y se convierten al tipo de dato del widget
        cConteo = (EditText) findViewById(R.id.campoConteo);
        bContar = (Button) findViewById(R.id.botonContar);
        bReiniciar = (Button) findViewById(R.id.botonReiniciar);

        if (savedInstanceState != null){
                i = savedInstanceState.getInt(TEXTO_CONTEO);
        }

        bContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                String s = Integer.toString(i);
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
