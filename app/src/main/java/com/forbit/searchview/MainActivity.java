package com.forbit.searchview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    List<Model> modelList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        toolbar.inflateMenu(R.menu.menu);
        prepareMovieData();
    }

    private void prepareMovieData() {
        Model model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
        model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
        model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
        model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
        model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
        model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
        model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
        model = new Model(R.drawable.penguin, "Penguin");
        modelList.add(model);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem item = menu.findItem(R.id.search);
        return super.onCreateOptionsMenu(menu);
    }
}