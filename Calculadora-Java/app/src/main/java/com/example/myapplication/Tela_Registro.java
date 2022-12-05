package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela_Registro extends AppCompatActivity {
    Button btnVoltar2, btnCadastro;
    EditText edtNome, edtEmail, edtTelefone;
    String Nome, Email, Telefone, CadResultado;
    TextView txtResultado2;
    Intent i;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVoltar2 = findViewById(R.id.btnTela3);
        btnVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(Tela_Registro.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnCadastro = findViewById(R.id.btnCadastro);
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNome = findViewById(R.id.edtNome);
                Nome = edtNome.getText().toString().trim();

                edtEmail = findViewById(R.id.edtEmail);
                Email = edtEmail.getText().toString().trim();

                edtTelefone = findViewById(R.id.edtTelefone);
                Telefone = edtTelefone.getText().toString().trim();

                CadResultado = Nome + Email + Telefone;

                txtResultado2 = findViewById(R.id.txtResultado2);
                txtResultado2.setText(CadResultado);
            }
        });
    }
}