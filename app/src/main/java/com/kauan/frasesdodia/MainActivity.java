package com.kauan.frasesdodia;

import static android.os.Build.VERSION_CODES.R;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Não importa o que você decidiu. O que importa é que isso te faz feliz.",
                "Quando pensar em desistir, lembre-se porque começou.",
                "Se não puder fazer tudo, faça tudo que puder",
                "Comece onde você está. Use o que você tem. Faça o que puder",

        };
        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.TextResult);
        texto.setText( frases[numero] );

    }

}