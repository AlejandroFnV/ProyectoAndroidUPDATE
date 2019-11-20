package com.example.proyectoandroidupdate.model;

public class Invoice {
    private int num_comandas;
    private double precio;

    public Invoice(int num_comandas, double precio) {
        this.num_comandas = num_comandas;
        this.precio = precio;
    }

    public int getNum_comandas() {
        return num_comandas;
    }

    public void setNum_comandas(int num_comandas) {
        this.num_comandas = num_comandas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "num_comandas=" + num_comandas +
                ", precio=" + precio +
                '}';
    }
}
