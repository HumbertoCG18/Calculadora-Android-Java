package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela_Registro extends AppCompatActivity {
    Button btnVoltar2, btnCadastrar;
    EditText edtNome, edtEmail, edtTelefone;
    TextView txtNome, txtTelefone, txtEmail, txtCadastroConf;
    String Cadastro;
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
    }
}