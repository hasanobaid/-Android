package com.hasan.labtopapplication.Model;

public class Laptop {
    private String model ;
    private String company;
    private int price;

    public Laptop(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
