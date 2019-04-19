package com.hasan.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.hasan.project2.Modle.MovieList;

public class detailes extends AppCompatActivity {
TextView title ;
TextView detail ;
TextView length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes);
    loadView();
    }

    private void loadView() {
title= (TextView)findViewById(R.id.title);
        detail= (TextView)findViewById(R.id.detailes);
        length= (TextView)findViewById(R.id.length);
        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("id");

        MovieList movieList = new MovieList();
        title.setText(movieList.getMovie().get(id).getName());
        detail.setText(movieList.getMovie().get(id).getDetails());
        length.setText(movieList.getMovie().get(id).getLength());


    }

}
