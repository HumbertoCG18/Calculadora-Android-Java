package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraIMC extends AppCompatActivity {
    Button btnCalcular, btnVoltar;
    Double imc, peso, altura;
    EditText edtPeso, edtAltura;
    TextView txtResultadoIMC, txtSituacao;
    String resultado;
    Intent i;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVoltar = findViewById(R.id.btnTela2);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    i = new Intent(CalculadoraIMC.this, MainActivity.class);
                    startActivity(i);
                }
            });

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtPeso = findViewById(R.id.edtPeso);
                peso = Double.parseDouble(edtPeso.getText().toString());

                edtAltura = findViewById(R.id.edtAltura);
                altura = Double.parseDouble(edtAltura.getText().toString());

                imc = peso/(altura*altura);

                txtResultadoIMC = findViewById(R.id.txtResultadoIMC);
                txtResultadoIMC.setText(Double.toString(imc));

                if(imc < 17){
                    resultado = "Muito abaixo do peso.";
                }

                else if(imc >=17 && imc < 18.5){
                    resultado = "Abaixo do peso.";
                }

                else if(imc >=18.5 && imc < 25){
                    resultado = "Peso normal.";
                }

                else if(imc >= 25 && imc < 30){
                    resultado = "Acima do peso.";
                }

                else if(imc >= 30 && imc < 35){
                    resultado = "Obesidade I";
                }

                else if(imc >= 35 && imc < 40){
                    resultado = "Obesidade II(GRAVE)!";
                }

                else {
                    resultado = "Obesidade III(Mórbida)!!";
                }

                txtSituacao = findViewById(R.id.txtSituacao);
                txtSituacao.setText(resultado);
            }
        });
    }
}