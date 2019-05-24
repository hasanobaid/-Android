package com.hasan.labtopapplication.Model;

public class Laptop {
<<<<<<< HEAD
    private String type;
=======
    private String model ;
>>>>>>> b8609765b1730b61a10c07fdb714b2b5d46446f1
    private String company;
    private int price;

    public Laptop(String model, String company, int price) {
<<<<<<< HEAD
        this.type = model;
=======
        this.model = model;
>>>>>>> b8609765b1730b61a10c07fdb714b2b5d46446f1
        this.company = company;
        this.price = price;
    }

<<<<<<< HEAD
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
=======
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
>>>>>>> b8609765b1730b61a10c07fdb714b2b5d46446f1
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
<<<<<<< HEAD

    @Override
    public String toString(){
        return getCompany()+" "+getType();
    }
=======
>>>>>>> b8609765b1730b61a10c07fdb714b2b5d46446f1
}
