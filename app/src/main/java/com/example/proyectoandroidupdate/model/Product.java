package com.example.proyectoandroidupdate.model;

public class Product {
    private String nombre;
    private double precio;
    private String imagenProd;

    public Product(String nombre, double precio, String imagenProd) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagenProd = imagenProd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagenProd() {
        return imagenProd;
    }

    public void setImagenProd(String imagenProd) {
        this.imagenProd = imagenProd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", imagenProd='" + imagenProd + '\'' +
                '}';
    }
}
