package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSoma, btnSubtracao, btnMultiplicar, btnDividir, btnTela2, btnTela3;
    Integer Soma, Subtracao, Multiplicar, Dividir;
    EditText edtValor1, edtValor2;
    TextView txtResultado;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSoma = findViewById(R.id.btnSoma);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtValor1 = findViewById(R.id.edtValor1);
                edtValor2 = findViewById(R.id.edtValor2);

                Soma = 1 + 1;

                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Soma);
            }
        });

        btnSubtracao = findViewById(R.id.btnSubtracao);
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtValor1 = findViewById(R.id.edtValor1);
                edtValor2 = findViewById(R.id.edtValor2);

                Subtracao = 1 - 1;

                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Subtracao);
            }
        });

        btnMultiplicar = findViewById(R.id.btnSubtracao);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtValor1 = findViewById(R.id.edtValor1);
                edtValor2 = findViewById(R.id.edtValor2);

                Multiplicar = 1 * 1;

                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Multiplicar);
            }
        });

        btnDividir = findViewById(R.id.btnSubtracao);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtValor1 = findViewById(R.id.edtValor1);
                edtValor2 = findViewById(R.id.edtValor2);

                Dividir = 1 * 1;

                txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText(Dividir);
            }
        });

        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, CalculadoraIMC.class);
                startActivity(i);
            }
        });

        btnTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(MainActivity.this, Tela_Registro.class);
                startActivity(i);
            }
        });
    }
}