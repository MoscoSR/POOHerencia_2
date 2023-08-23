package org.smosquera.poo;

public class Producto {
    public Producto (String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    protected  String name;
    protected  Double price;


}
