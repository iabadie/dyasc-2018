package ar.edu.untref.dyasc;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private Integer dni;
    private CuentaCorriente cuentaCorriente = new CuentaCorriente();

    public Cliente(String nombre, String direccion, Integer dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    public void cargarProductoEnCuentaCorriente(Producto producto, Integer mes) {
        cuentaCorriente.agregarProducto(producto, mes);
    }
    
    public void cargarSuscripcionEnCuentaCorriente(Producto producto) {
        cuentaCorriente.agregarSuscripcion(producto);
    }

    public Integer getDni() {
        return dni;
    }

    public ArrayList<Producto> obtenerListaDeProductos(Integer mes) {
        return cuentaCorriente.obtenerListaDeProductos(mes);
    }

    public ArrayList<Producto> obtenerListaDeSuscripciones() {
        return cuentaCorriente.obtenerListaDeSuscripciones();
    }
}
