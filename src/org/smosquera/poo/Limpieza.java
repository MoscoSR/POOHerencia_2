package org.smosquera.poo;

public class Limpieza extends Producto{
    public Limpieza (String name, Double price) {
        super(name, price);
    }

    public Limpieza (String name, Double price, String components, double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public double getLiters() {
        return liters;
    }

    private String components;
    private  double  liters;

}
