package com.example.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TwoPlayerActivity extends AppCompatActivity {

    private String vez = "X";
    private Integer jogada = 0;
    //variavel que gerencia a matriz do jogo
    private String[]
    celula = {"","","","","","","","",""};

    private ImageView imagem1;
    private ImageView imagem2;
    private ImageView imagem3;
    private ImageView imagem4;
    private ImageView imagem5;
    private ImageView imagem6;
    private ImageView imagem7;
    private ImageView imagem8;
    private ImageView imagem9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);

        //Chama a função para criar os botões
        inicializaObjetos();

        //Cria os eventos de click dos botoes
        carregaListeners();

    }

    private void inicializaObjetos(){
        imagem1 = findViewById(R.id.img1);
        imagem2 = findViewById(R.id.img2);
        imagem3 = findViewById(R.id.img3);
        imagem4 = findViewById(R.id.img4);
        imagem5 = findViewById(R.id.img5);
        imagem6 = findViewById(R.id.img6);
        imagem7 = findViewById(R.id.img7);
        imagem8 = findViewById(R.id.img8);
        imagem9 = findViewById(R.id.img9);
    }

    private void carregaListeners(){
        imagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(1);
            }
        });

        imagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(2);
            }
        });

        imagem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(3);
            }
        });

        imagem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(4);
            }
        });

        imagem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(5);
            }
        });

        imagem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(6);
            }
        });

        imagem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(7);
            }
        });

        imagem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(8);
            }
        });

        imagem9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joga(9);
            }
        });
    }

    public void joga(int i){
        //primeira linha
        if(celula[1] == "X"){
            imagem1.setImageResource(R.drawable.xcertopreto);
        }
        else if(celula[1] == "O"){
            imagem1.setImageResource(R.drawable.ocertopreto);
        }
        else if(celula[1] == ""){
            imagem1.setImageURI(null);
        }
    }
}
