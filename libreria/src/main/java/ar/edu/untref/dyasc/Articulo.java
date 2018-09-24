package ar.edu.untref.dyasc;

public class Articulo extends Producto {
    private double iva;

    public Articulo(double precio, double iva) {
        super(precio);
        this.iva = iva;
    }

    @Override
    public double obtenerPrecio(double descuento) {
        double calculado = (this.precio * this.iva) + this.precio;
        return calculado - (calculado * descuento);
    }

}
