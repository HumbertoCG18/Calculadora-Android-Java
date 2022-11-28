package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraIMC extends AppCompatActivity {
    Button btnCalcular, btnVoltar;
    Integer txtAltura, txtPeso;
    EditText txtResultadoIMC, txtSituacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc);
    }
}