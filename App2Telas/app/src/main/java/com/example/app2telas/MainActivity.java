package com.example.app2telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Método para a ação do botão
    public void Botao(View view)
    {
        TextView campoNome, campoCPF, campoEmail, campoSenha; //criação de váriavel para linkar com os campos
        String nome, cpf, email, senha; //criação de váriavel tipo String

        //linkar as várias tipo text criada com os campos do arquivo xml
        campoNome = findViewById(R.id.campoNome);
        campoCPF = findViewById(R.id.campoCPF);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);

        //Usa as variáveis String criadas para pegar os dados dos textView e também para passar
        //para a classe e poder transitar esses dados entre as 2 telas
        nome = campoNome.getText().toString();
        cpf = campoCPF.getText().toString();
        email = campoEmail.getText().toString();
        senha = campoSenha.getText().toString();

        Usuario user1 = new Usuario(nome,cpf,email,senha); //criação do usuário objeto

        //intenção de mudança de tela
        Intent mudarTela = new Intent(getApplicationContext(), Tela2.class);

        //Elemento que quer que passe para a próxima tela no caso o objeto
        mudarTela.putExtra("objeto", user1); //enviando a chave do objeto user1

        //Start para mudar de tela
        startActivity(mudarTela);
    }

}