package com.hasan.project2.Modle;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    public static List<MovieModle> movie = new ArrayList<>();

    public void addMovie(MovieModle movies) {
        movie.add(movies);
    }

    public static void deleteMovie(String title) {
        for (int i = 0; i < movie.size(); i++) {
            if (movie.get(i).getName().equals(title)) {
                movie.remove(movie.get(i));
            }
        }
    }

    public List<MovieModle> getMovie() {
        return this.movie;
    }

    @Override
    public String toString() {
        return movie + "";
    }
}
