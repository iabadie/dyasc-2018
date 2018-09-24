package ar.edu.untref.dyasc;

public class Libro extends Producto {

    public Libro(double precio) {
        super(precio);
    }

    @Override
    public double obtenerPrecio(double descuento) {
        return this.precio - (this.precio * descuento);
    }

}
