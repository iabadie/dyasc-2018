package ar.edu.untref.dyasc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class CuentaCorriente {
    HashMap<Integer,ArrayList<Producto>> productosPorMes = new HashMap<Integer, ArrayList<Producto>>();
    ArrayList<Producto> suscripciones = new ArrayList<Producto>();

    public void agregarProducto(Producto producto, Integer mes) {
        if (productosPorMes.get(mes) == null) {
            productosPorMes.put(mes, new ArrayList<Producto>());
        }
        productosPorMes.get(mes).add(producto);       
    }

    public ArrayList<Producto> obtenerListaDeProductos(Integer mes) {
        return productosPorMes.get(mes);
    }

    public void agregarSuscripcion(Producto producto) {
        suscripciones.add(producto);
    }

    public ArrayList<Producto> obtenerListaDeSuscripciones() {
        return suscripciones;
    }
}
