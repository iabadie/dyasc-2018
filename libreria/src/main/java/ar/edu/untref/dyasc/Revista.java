package ar.edu.untref.dyasc;

public class Revista extends Producto {
    private int periodicidad;

    public Revista(double precio, int periodicidad) {
        super(precio);
        this.periodicidad = periodicidad;
    }

    @Override
    public double obtenerPrecio(double descuento) {
        double calculado = this.precio * this.periodicidad;
        return calculado - (calculado * descuento);
    }
}
