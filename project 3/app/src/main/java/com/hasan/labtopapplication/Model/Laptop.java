package com.hasan.labtopapplication.Model;

public class Laptop {
    private String type;
    private String company;
    private int price;

    public Laptop(String model, String company, int price) {
        this.type = model;
        this.company = company;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString(){
        return getCompany()+" "+getType();
    }
}
