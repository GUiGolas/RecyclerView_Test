package com.example.guilherme.recyclerview_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);


        List<Livro> livros = new ArrayList<Livro>();;
        //popular livros
        PopularLivros(livros);

        // é preciso criar um adapter
        recyclerView.setAdapter(new NossoAdapter(livros, this));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);


    }

    public void PopularLivros(List<Livro> livros)
    {
        livros.add(new Livro("JSF","Jefferson","livro iniciante",59.90));
        livros.add(new Livro("XXX","autor2","livro 2",99.90));
        livros.add(new Livro("O vento levou","Shakes","livro romantcio",9.90));

    }
}
