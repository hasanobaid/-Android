package com.hasan.project2.Modle;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private List<MovieModle> movie = new ArrayList<>();

    public void addMovie(MovieModle movies) {
        movie.add(movies);
    }

    public void deleteMovie(MovieList movies) {
        movie.remove(movies);
    }

    public List<MovieModle> getMovie() {
        return this.movie;
    }
}
