package com.example.tecinfo.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button bt_login = (Button) findViewById(R.id.bt_login);
        Button bt_cadastro = (Button) findViewById(R.id.bt_cadastro);

        final EditText nome = findViewById(R.id.edit_nome);
        final EditText senha = findViewById(R.id.edit_senha);


        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( ActivityB.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityB.this, ActivityC.class);
                intent.putExtra("nome", nome.getText().toString());
                startActivity(intent);
                finish();
            }
        });




    }
}
