package org.smosquera.poo;

public class Fruta extends Producto{
    public Fruta (String name, Double price) {
        super(name, price);
    }

    public Fruta (String name, Double price, double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    private double weight;
    private String color;
}
