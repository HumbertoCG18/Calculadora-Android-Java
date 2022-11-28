package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSoma, btnSubtracao, btnMultiplicar, btnDividir, btnTela2;
    Integer textValor1, textValor2, Soma, Subtracao, Multiplicar, Dividir;
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
                TextView textResultado = findViewById(R.id.txtResultado);
                textResultado.setText(Soma);
            }
        });

        Button btnSubtracao = findViewById(R.id.btnSubtracao);
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subtracao = 1 - 1;
                TextView textResultado = findViewById(R.id.txtResultado);
                textResultado.setText(Subtracao);
            }
        });

        Button btnMultiplicar = findViewById(R.id.btnSubtracao);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiplicar = 1 * 1;
                TextView textResultado = findViewById(R.id.txtResultado);
                textResultado.setText(Multiplicar);
            }
        });

        Button btnDividir = findViewById(R.id.btnSubtracao);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dividir = 1 * 1;
                TextView textResultado = findViewById(R.id.txtResultado);
                textResultado.setText(Dividir);
            }
        });

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CalculadoraIMC.class);
                startActivity(i);
            }
        });
    }
}