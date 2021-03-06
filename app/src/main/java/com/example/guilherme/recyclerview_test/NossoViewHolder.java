package com.example.guilherme.recyclerview_test;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NossoViewHolder extends RecyclerView.ViewHolder {
    final TextView nome;
    final TextView descricao;
    final TextView preco;
    final TextView autor;

    public NossoViewHolder(View view) {
        super(view);
        nome = (TextView) view.findViewById(R.id.item_livro_nome);
        descricao = (TextView) view.findViewById(R.id.item_livro_descricao);
        preco = (TextView) view.findViewById(R.id.item_livro_preco);
        autor = (TextView) view.findViewById(R.id.item_livro_autor);

    }

}
