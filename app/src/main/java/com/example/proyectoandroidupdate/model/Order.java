package com.example.proyectoandroidupdate.model;

public class Order {
    private int num_unidades;
    private double precio;
    private boolean entregado;

    public Order(int num_unidades, double precio, boolean entregado) {
        this.num_unidades = num_unidades;
        this.precio = precio;
        this.entregado = entregado;
    }

    public int getNum_unidades() {
        return num_unidades;
    }

    public void setNum_unidades(int num_unidades) {
        this.num_unidades = num_unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    @Override
    public String toString() {
        return "Order{" +
                "num_unidades=" + num_unidades +
                ", precio=" + precio +
                ", entregado=" + entregado +
                '}';
    }
}
