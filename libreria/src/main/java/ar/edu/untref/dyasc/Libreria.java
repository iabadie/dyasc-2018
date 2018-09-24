package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Libreria {
    HashMap<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();
    double descuentoPorRegistro = 0.05;
    double descuentoPorSuscripcion = 0.2;

    public void registrarCliente(Cliente cliente) {
        clientes.put(cliente.getDni(), cliente);
    }

    public void cargarProductoDeCliente(Integer dniCliente, Producto producto, Integer mes) {
        clientes.get(dniCliente).cargarProductoEnCuentaCorriente(producto, mes);
    }

    public void suscribirCliente(Integer dniCliente, Producto producto) {
        clientes.get(dniCliente).cargarSuscripcionEnCuentaCorriente(producto);
    }

    public double obtenerValorPorCobrar(Integer dniCliente, Integer mes) {
        Cliente cliente = clientes.get(dniCliente);
        if (cliente == null) {
            clienteInexistente();
        }
        double precio = 0;
        // Calcula la suma del valor de los productos comprados aplicando descuento
        ArrayList<Producto> lista = cliente.obtenerListaDeProductos(mes);
        if (lista != null) {
            Iterator<Producto> itr = lista.iterator();
            while(itr.hasNext()) {
                Producto producto = itr.next();
                precio += producto.obtenerPrecio(descuentoPorRegistro);
            }   
        }
        // Calcula la suma del valor de las suscripciones del cliente
        ArrayList<Producto> suscripciones = cliente.obtenerListaDeSuscripciones();
        if (suscripciones != null) {
            Iterator<Producto> itrSuscripciones = suscripciones.iterator();
            while(itrSuscripciones.hasNext()) {
                Producto producto = itrSuscripciones.next();
                precio += producto.obtenerPrecio(descuentoPorSuscripcion);
            }
        }
        return precio;
    }

    public double obtenerValorPorCobrarAnual(Integer dniCliente) {
        Cliente cliente = clientes.get(dniCliente);
        if (cliente == null) {
                clienteInexistente();
        }
        double precio = 0;
        for(int x = 0; x < 12; x++) {
            precio += obtenerValorPorCobrar(dniCliente, x);
        }
        return precio;
    }
    
    public void clienteInexistente() {
        try {
            throw new Exception("El cliente no existe");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
