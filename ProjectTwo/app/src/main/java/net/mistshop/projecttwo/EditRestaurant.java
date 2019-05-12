package net.mistshop.projecttwo;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;

import com.google.gson.Gson;


public class EditRestaurant extends AppCompatActivity {
    EditText name;
    EditText desc;
    RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_restaurant);

        /*
        *         SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();

        String booksString = gson.toJson(books);

        editor.putString("123", booksString);
        editor.commit();
        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();*/

        name = (EditText) findViewById(R.id.editName);
        desc = (EditText) findViewById(R.id.editDesc);
        ratingBar = (RatingBar) findViewById(R.id.editRating);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();

/*
        String restString = gson.toJson();
*/





    }
}
