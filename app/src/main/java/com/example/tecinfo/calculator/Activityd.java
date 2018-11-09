package com.example.tecinfo.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Activityd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        Button bt_inicio = (Button) findViewById(R.id.bt_inicio);
        Button bt_calcular = (Button) findViewById(R.id.bt_calcular);

        TextView tx_nome = findViewById(R.id.nome);
        TextView tx_sobrenome = findViewById(R.id.sobrenome);
        TextView tx_formacao = findViewById(R.id.formacao);
        TextView tx_idade = findViewById(R.id.idade);
        TextView tx_telefone = findViewById(R.id.telefone);
        TextView tx_data = findViewById(R.id.data);

        Intent intentRecebido = getIntent();
        String nome = intentRecebido.getStringExtra("nome");
        String sobrenome = intentRecebido.getStringExtra("sobrenome");
        String formacao = intentRecebido.getStringExtra("formacao");
        String idade = intentRecebido.getStringExtra("idade");
        String telefone = intentRecebido.getStringExtra("telefone");
        String data = intentRecebido.getStringExtra("data");

        tx_nome.setText(nome);
        tx_sobrenome.setText(sobrenome);
        tx_formacao.setText(formacao);
        tx_idade.setText(idade);
        tx_telefone.setText(telefone);
        tx_data.setText(data);

        bt_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Activityd.this, ActivityB.class);
                startActivity(intent);
                finish();
            }
        });

        bt_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Activityd.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
