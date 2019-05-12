package net.mistshop.projecttwo;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();

        final Restaurant[] rests = {
                new Restaurant("Cheesesteak", "Best res", 4, R.drawable.ic_launcher_background),
                new Restaurant("Cheesesteak", "Best res", 4, R.drawable.ic_launcher_background),
                new Restaurant("Cheesesteak", "Best res", 4, R.drawable.ic_launcher_background),
                new Restaurant("Cheesesteak", "Best res", 4, R.drawable.ic_launcher_background),
                new Restaurant("Cheesesteak", "Best res", 4, R.drawable.ic_launcher_background),
                new Restaurant("Cheesesteak", "Best res", 4, R.drawable.ic_launcher_background),
        };


        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        String[] names = new String[rests.length];
        String[] descs = new String[rests.length];
        int[] ratings = new int[rests.length];
        int[] imageIDs = new int[rests.length];

        for (int i = 0; i < rests.length; i++) {
            names[i] = rests[i].getName();
            descs[i] = rests[i].getDescription();
            ratings[i] = rests[i].getRating();
            imageIDs[i] = rests[i].getImageID();
        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        RestCard adapter = new RestCard(names, descs, ratings, imageIDs);
        recycler.setAdapter(adapter);


        String restString = gson.toJson(rests);

        editor.putString("rests", restString);
        editor.commit();


    }
}
