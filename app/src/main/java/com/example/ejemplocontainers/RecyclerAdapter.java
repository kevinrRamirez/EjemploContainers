package com.example.ejemplocontainers;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.NumerosViewHolder>{

    private int mNumeroItems;

    public RecyclerAdapter(int numeroItems)
    {
        mNumeroItems = numeroItems;
    }

    @NonNull
    @Override
    public NumerosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int layoutId = R.layout.lista;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        boolean attachToParent = false;
        View view = layoutInflater.inflate(layoutId,parent,attachToParent);

        NumerosViewHolder numerosViewHolder  = new NumerosViewHolder(view);

        return numerosViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NumerosViewHolder holder, int position) {

        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return mNumeroItems;
    }

    class NumerosViewHolder extends RecyclerView.ViewHolder
    {

        TextView mListaNumeros;

        public NumerosViewHolder(@NonNull View itemView) {
            super(itemView);

            mListaNumeros = itemView.findViewById(R.id.tv_lista);
        }

        void bind (int listaIndex)
        {
            mListaNumeros.setText(String.valueOf(listaIndex));


        }
    }
}
