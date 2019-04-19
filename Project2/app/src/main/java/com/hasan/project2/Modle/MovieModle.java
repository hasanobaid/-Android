package com.hasan.project2.Modle;

public class MovieModle {
    private String name ;
    private String length;
    private String details ;

    public MovieModle(String name, String length, String details) {
        this.name = name;
        this.length = length;
        this.details = details;
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
}
