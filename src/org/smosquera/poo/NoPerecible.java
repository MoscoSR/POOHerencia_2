package org.smosquera.poo;

public class NoPerecible extends Producto {
    public NoPerecible (String name, Double price, int content, int calories) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    public int getContent() {
        return content;
    }

    public int getCalories() {
        return calories;
    }

    private int content;
    private int calories;
}
