package com.example.app2telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        ObterDados();
    }

    //Função para chamar os dados da primeira tela
    public void ObterDados()
    {
        Intent obterDadosTela1 = getIntent(); //usado para montrar intenção de puxar os dados
        Usuario user2 = (Usuario) obterDadosTela1.getSerializableExtra("objeto"); //pegando o objeto criado

        //Criação da váriavel textView w linkando com as Views
        TextView campoNomeT2, campoCpfT2, campoEmailT2, campoSenhaT2;
        campoNomeT2 = findViewById(R.id.nomeT2);
        campoCpfT2 = findViewById(R.id.cpfT2);
        campoEmailT2 = findViewById(R.id.emailT2);
        campoSenhaT2 = findViewById(R.id.senhaT2);

        //capturar dados da classe usuário e setar na view
        campoNomeT2.setText("Nome: "+user2.getNome());
        campoCpfT2.setText("Cpf: "+user2.getCpf());
        campoEmailT2.setText("Email: "+user2.getEmail());
        campoSenhaT2.setText("Senha: "+user2.getSenha());



    }
}