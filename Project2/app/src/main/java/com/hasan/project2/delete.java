package com.hasan.project2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.hasan.project2.Modle.MovieList;
import com.hasan.project2.Modle.MovieModle;

public class delete extends AppCompatActivity {
    Button delete;
    Spinner deleteSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        loadview();
    }

    private void loadview() {
        delete = (Button) findViewById(R.id.delete);
        deleteSpin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<MovieModle> adapter = new ArrayAdapter<MovieModle>(
                this, android.R.layout.simple_spinner_item, MovieList.movie);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        deleteSpin.setAdapter(adapter);
    }

    public void onClickDelete(View view) {
        MovieList.deleteMovie(deleteSpin.getSelectedItem().toString());
        Intent intent = new Intent(delete.this, MainActivity.class);
        startActivity(intent);
    }
}
