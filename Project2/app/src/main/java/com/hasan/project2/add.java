package com.hasan.project2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hasan.project2.Modle.MovieList;
import com.hasan.project2.Modle.MovieModle;

public class add extends AppCompatActivity {
    EditText title;
    EditText length;
    EditText details;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        loadview();
    }

    private void loadview() {
        title = (EditText) findViewById(R.id.title);
        details = (EditText) findViewById(R.id.details);
        length = (EditText) findViewById(R.id.length);
        add = (Button) findViewById(R.id.add);
    }

    public void onClickAdd(View view) {
        String titles = title.getText().toString();
        String detailes = details.getText().toString();
        String lengths = length.getText().toString();
        MovieList movieList = new MovieList();
        movieList.addMovie(new MovieModle(titles, lengths, detailes));
        Intent intent = new Intent(add.this , MainActivity.class );
        startActivity(intent);
    }

}
