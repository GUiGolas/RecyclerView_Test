package com.example.guilherme.recyclerview_test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NossoAdapter extends RecyclerView.Adapter{

    private List<Livro> livros;
    private Context context;

    public NossoAdapter(List<Livro> livros, Context context) {
        this.livros = livros;
        this.context = context;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_livro, parent, false);

        NossoViewHolder holder = new NossoViewHolder(view);

        return holder;
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        NossoViewHolder holder = (NossoViewHolder) viewHolder;

        Livro livro  = livros.get(position) ;

        holder.nome.setText(livro.getNomeLivro());
        holder.autor.setText(livro.getNomeAutor());
        holder.descricao.setText(livro.getDescricao());
        holder.preco.setText(livro.getPreco().toString());



    }

    @Override
    public int getItemCount() {
        return livros.size();
    }
}

