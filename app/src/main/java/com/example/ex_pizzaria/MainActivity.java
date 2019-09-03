package com.example.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtChopp;
    EditText txtPizzas;
    EditText txtRecheios;
    EditText txtPessoas;
    TextView lblConsumo2;
    TextView lblServicos2;
    TextView lblTotal2;
    TextView lblPorPessoa2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtChopp = findViewById(R.id.txtChopp);
        txtPizzas = findViewById(R.id.txtPizzas);
        txtRecheios = findViewById(R.id.txtRecheios);
        txtPessoas = findViewById(R.id.txtPessoas);
        lblConsumo2 = findViewById(R.id.lblConsumo2);
        lblServicos2 = findViewById(R.id.lblServicos2);
        lblTotal2 = findViewById(R.id.lblTotal2);
        lblPorPessoa2 = findViewById(R.id.lblPorPessoa2);
    }

    public void onCalcular (View v){
        double chopp = Double.parseDouble((txtChopp.getText().toString())) * 7.30;
        double pizzas = Double.parseDouble((txtPizzas.getText().toString())) * 31.50;
        double recheios = Double.parseDouble((txtRecheios.getText().toString())) * 5.90;
        double pessoas = Double.parseDouble((txtPessoas.getText().toString()));



        double consumo = chopp + pizzas + recheios;
        lblConsumo2.setText(String.valueOf(consumo));

        double servicos = consumo / 10;
        lblServicos2.setText(String.valueOf(servicos));

        double total = consumo + servicos;
        lblTotal2.setText(String.valueOf(total));

        double porpessoas = total / pessoas;
        lblPorPessoa2.setText(String.valueOf(porpessoas));

    }
}
