package com.hasan.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hasan.project2.Modle.MovieList;

public class delete extends AppCompatActivity {
EditText title;
Button delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        loadview();
    }

    private void loadview() {
        title=(EditText)findViewById(R.id.title);
        delete=(Button)findViewById(R.id.delete);
    }

    public void onClickDelete(View view) {
        String titles =  title.getText().toString() ;
        MovieList movieList = new MovieList() ;
        movieList.deleteMovie(titles);
        Intent intent = new Intent(delete.this , MainActivity.class );
        startActivity(intent);
    }
}
