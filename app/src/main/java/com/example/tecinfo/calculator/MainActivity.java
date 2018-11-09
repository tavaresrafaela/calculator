package com.example.tecinfo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String memoria;
    private String operacao;
    private Double valor1 = 0.0;
    private Double valor2 = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView displayconta = (TextView) findViewById(R.id.displayConta);
        final TextView displayresult = (TextView) findViewById(R.id.displayResult);


        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnsomar         = (Button) findViewById(R.id.btnSomar);
        final Button btnmultiplicacao = (Button) findViewById(R.id.btnMultiplicao);
        final Button btndivisao       = (Button) findViewById(R.id.btnDivisao);
        final Button btnsubtracao     = (Button) findViewById(R.id.btnSubtracao);
        final Button btnvirgula       = (Button) findViewById(R.id.btnVirgula);
        final Button btnigual         = (Button) findViewById(R.id.btnIgual);
        final Button btnapagar        = (Button) findViewById(R.id.btnApagar);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + "9");
            }
        });
        btnvirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = (String) displayconta.getText();
                displayconta.setText(memoria + ",");
            }
        });

        btnapagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                memoria = "";
                displayconta.setText("");
                displayresult.setText("");
            }
        });

        btnsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "+";
                valor1 = Double.parseDouble(displayconta.getText().toString());
                displayresult.setText(displayconta.getText().toString() + "+");
                displayconta.setText("");
            }
        });
        btnsubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "-";
                valor1 = Double.parseDouble(displayconta.getText().toString());
                displayresult.setText(displayconta.getText().toString() + "-");
                displayconta.setText("");
            }
        });
        btnmultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "x";
                valor1 = Double.parseDouble(displayconta.getText().toString());
                displayresult.setText(displayconta.getText().toString() + "x");
                displayconta.setText("");
            }
        });
        btndivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao = "/";
                valor1 = Double.parseDouble(displayconta.getText().toString());
                displayresult.setText(displayconta.getText().toString() + "/");
                displayconta.setText("");
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (displayconta.getText().equals("")){

                    Toast.makeText(getApplicationContext(),
                            "Digite um número", Toast.LENGTH_LONG).show();

                }
                else {

                    //operacao = "=";
                    valor2 = Double.parseDouble(displayconta.getText().toString());
                    displayconta.setText("");
                    String resultado = Calcular(valor1,valor2, operacao);
                    displayresult.setText(resultado);
                }
            }
        });


    }
    public String Calcular(Double valor1, Double valor2, String operacao){

         Double resultado = 0.0;

         if (operacao.equals("+")){
             resultado = valor1+valor2;
         }
         else if (operacao.equals("-")){
             resultado = valor1-valor2;
         }
         else if(operacao.equals("x")){
             resultado = valor1*valor2;
         }
         else if (operacao.equals("/")){
             if (valor2 == 0){
                 Toast.makeText(getApplicationContext(), "Não é possível dividir por 0!", Toast.LENGTH_LONG).show();
             }
             else{
                 resultado = valor1/valor2;
             }
         }


         return resultado.toString();
    }
}
