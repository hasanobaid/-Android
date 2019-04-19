package com.hasan.project2;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.hasan.project2.Modle.MovieList;
import com.hasan.project2.Modle.MovieModle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toListDetailes();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.add) {
            Intent intent = new Intent(MainActivity.this, add.class);
            startActivity(intent);
        } else if (id == R.id.delete) {
            Intent intent = new Intent(MainActivity.this, delete.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void toListDetailes() {
        list = (ListView) findViewById(R.id.list);

        if (MovieList.movie.isEmpty()) {
            MovieList.movie.add(new MovieModle("Small Foot", "1:45", "Genres: Comedy/Kids\nMigo is a friendly Yeti whose world gets turned upside down when he discovers something new", R.drawable.movie1, 4, true));
            MovieList.movie.add(new MovieModle("Guardians of the Galaxy", "2:00", "Genres: Action/Sci-Fi\nPeter Quill finds himself the quarry of relentless bounty hunters after he steals ann orb coveted by a powerful villain", R.drawable.movie2, 4, true));
            MovieList.movie.add(new MovieModle("The Avengers", "2:30", "Genres: Action/Thriller\nWhen Thor's evil brother Loki gains access to an unlimited power S.H.I.E.L.D iniates a superhero squad to stop and defeat the unprecedented threat to Earth", R.drawable.movie3, 4, true));
            MovieList.movie.add(new MovieModle("Harry Potter and The Order of the Phoenix", "2:00", "Genres: Thriller/Mystery\nHarry Potter learns many in the wizarding community do not know the truth about his encounter with Voldemort", R.drawable.movie4, 4, true));
            MovieList.movie.add(new MovieModle("Little Man", "1:30", "Genres: Comedy\nCalvin a short and tiny criminal must pose as a young infant in order to retrieve a stolen diamond who was lost by his idiot partner", R.drawable.movie5, 4, true));
        }


        ArrayAdapter<MovieModle> listAdapter = new ArrayAdapter<MovieModle>(this,
                android.R.layout.simple_list_item_1,
                MovieList.movie);
        list.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(MainActivity.this,
                        detailes.class);
                intent.putExtra("id", (int) id);
                startActivity(intent);
            }
        };

        list.setOnItemClickListener(itemClickListener);


    }
}
