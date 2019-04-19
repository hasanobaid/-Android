package com.hasan.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.hasan.project2.Modle.MovieList;
import com.hasan.project2.Modle.MovieModle;

import java.util.List;

public class detailes extends AppCompatActivity {
    TextView title;
    TextView detail;
    TextView length;
    ImageView imageView2;
    RatingBar rating;
    CheckBox watched;
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes);
        loadView();
    }

    private void loadView() {
        title = (TextView) findViewById(R.id.title);
        detail = (TextView) findViewById(R.id.detailes);
        length = (TextView) findViewById(R.id.length);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        rating = (RatingBar) findViewById(R.id.ratingBar);
        watched = (CheckBox) findViewById(R.id.checkBox);

        Intent intent = getIntent();
        int id = (int) intent.getExtras().get("id");

        MovieModle m = MovieList.movie.get(id);

        title.setText(m.getName());
        detail.setText(m.getDetails());
        length.setText("Running Time: " + m.getLength());
        imageView2.setImageResource(m.getPosterID());
        rating.setRating((float) m.getRating());
        watched.setEnabled(false);
        if (m.isWatched()) {
            watched.setChecked(true);
        }


    }

}
