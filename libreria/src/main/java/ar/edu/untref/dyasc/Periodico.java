package ar.edu.untref.dyasc;

public class Periodico extends Producto {
    private int periodicidad;

    public Periodico(double precio, int periodicidad) {
        super(precio);
        this.periodicidad = periodicidad;
    }

    @Override
    public double obtenerPrecio(double descuento) {
        double calculado = this.precio * this.periodicidad;
        return calculado - (calculado * descuento);
    }
}
