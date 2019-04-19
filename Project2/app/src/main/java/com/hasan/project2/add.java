package com.hasan.project2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;

import com.hasan.project2.Modle.MovieList;
import com.hasan.project2.Modle.MovieModle;

public class add extends AppCompatActivity {
    EditText title;
    EditText length;
    EditText details;
    Button add;
    RatingBar ratingBar;
    CheckBox watched;

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
        ratingBar = (RatingBar) findViewById(R.id.ratingBar2);
        watched = (CheckBox) findViewById(R.id.checkBox2);

    }

    public void onClickAdd(View view) {
        String titles = title.getText().toString();
        String detailes = details.getText().toString();
        String lengths = length.getText().toString();
        float r = ratingBar.getRating();
        boolean wat = watched.isChecked();

/*        MovieList movieList = new MovieList();
        movieList.addMovie(new MovieModle(titles, lengths, detailes, R.drawable.defaultposter, (int) r, wat));*/

        MovieList.movie.add(new MovieModle(titles, lengths, detailes, R.drawable.defaultposter, (int) r, wat));
        Intent intent = new Intent(add.this, MainActivity.class);
        startActivity(intent);
    }

}
