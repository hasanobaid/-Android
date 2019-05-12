package net.mistshop.projecttwo;

public class Restaurant {
    private String name;
    private String description;
    private int rating;
    private int imageID;

    public Restaurant() {

    }

    public Restaurant(String name, String description, int rating, int imageID) {
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
