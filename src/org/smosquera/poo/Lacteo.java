package org.smosquera.poo;

public class Lacteo extends Producto{

    public Lacteo (String name, Double price) {
        super(name, price);
    }

    public Lacteo (String name, double price, int amount, int proteins) {
        super(name, price);
        this.amount = amount;
        this.proteins = proteins;
    }

    public int getAmount() {
        return amount;
    }

    public int getProteins() {
        return proteins;
    }

    private int amount;
    private int proteins;


}
