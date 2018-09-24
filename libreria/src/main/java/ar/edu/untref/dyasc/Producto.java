package ar.edu.untref.dyasc;

public abstract class Producto {
    protected double precio = 0;

    public Producto(double precio) {
        this.precio = precio;
    }

    public abstract double obtenerPrecio(double descuento);
}
