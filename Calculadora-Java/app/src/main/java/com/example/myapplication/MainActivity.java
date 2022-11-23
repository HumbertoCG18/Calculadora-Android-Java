package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSoma, btnSubtracao;
    Integer textValor1, textValor2, Soma, Subtracao;
    EditText textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSoma = findViewById(R.id.btnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Soma = 1 + 1;
                EditText textResultado = findViewById(R.id.txtResultado);
                textResultado.setText(Soma);
            }
        });

        Button btnSubtracao = findViewById(R.id.btnSubtracao);
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Subtracao = 1 - 1;
                EditText textResultado = findViewById(R.id.txtResultado);
                textResultado.setText(Subtracao);
            }
        });
    }
}