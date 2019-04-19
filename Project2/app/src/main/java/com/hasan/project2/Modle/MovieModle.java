package com.hasan.project2.Modle;

public class MovieModle {
    private String name;
    private String length;
    private String details;
    private int posterID;
    private int rating = 0;
    private boolean watched = false;

    public MovieModle(String name, String length, String details, int posterID, int rating, boolean watched) {
        this.name = name;
        this.length = length;
        this.details = details;
        this.posterID = posterID;
        this.rating = rating;
        this.watched = watched;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPosterID() {
        return posterID;
    }

    public void setPosterID(int posterID) {
        this.posterID = posterID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        return name;
    }
}
