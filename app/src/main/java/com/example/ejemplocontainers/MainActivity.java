package com.example.ejemplocontainers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  {

    RecyclerView rvNum;
    Spinner spinner;

    private static final int LISTA_NUMEROS = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNum = findViewById(R.id.rvNumeros);

        rvNum.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        LinearLayoutManager  linearLayoutManager = new LinearLayoutManager(this);
        rvNum.setLayoutManager(linearLayoutManager);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(LISTA_NUMEROS);

        rvNum.setAdapter(recyclerAdapter);

    }



}
