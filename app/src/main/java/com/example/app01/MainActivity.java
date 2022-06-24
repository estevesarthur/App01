package com.example.app01;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnExibeMsgOnClick(View view) {
        int nMsg;
        Random rnd = new Random();
        nMsg = rnd.nextInt(6);
        TextView txtMensagem = findViewById(R.id.txtMensagem);
        if (nMsg == 0)
            txtMensagem.setText("Sejam todos bem vindos ao nosso curso de\nAndroid Studio!");
        else if (nMsg == 1)
            txtMensagem.setText("Desenvolver para Android é legal.\nVamos nos divertir!");
        else if (nMsg == 2)
            txtMensagem.setText("Vamos começar. Temos muito a aprender.");
        else if (nMsg == 3)
            txtMensagem.setText("Que as aulas online sejam boas.");
        else if (nMsg == 4)
            txtMensagem.setText("Fique em casa.\nSe sair use máscara.");
        else if (nMsg == 5)
            txtMensagem.setText("Esta é a mensagem para nMsg == 5");
    }
    public void btnLimpaMsgOnClick(View view) {
        TextView txtMensagem = findViewById(R.id.txtMensagem);
        txtMensagem.setText("...");
        Toast.makeText(this, "Campo mensagem foi limpo", Toast.LENGTH_SHORT).show();
 /*
 Toast t;
 t = Toast.makeText(this, "Campo mensagem foi limpo", Toast.LENGTH_SHORT);
 t.show();
 /**/
    }
}