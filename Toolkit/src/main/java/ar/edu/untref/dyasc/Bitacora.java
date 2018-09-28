package ar.edu.untref.dyasc;

import java.time.LocalDateTime;

public class Bitacora {
    String nombre = null;
    ManejadorDeSalidas manejadorDeSalidas;
    public Bitacora(String name) {
       manejadorDeSalidas = new ManejadorDeSalidas();
       this.nombre = name;
    }

    public void registrarEvento(String mensaje) {
        String registro = mensaje + "   -   " + LocalDateTime.now() + "\n";
        imprimirEvento(registro);
    }

    private void imprimirEvento(String registro) {
        manejadorDeSalidas.imprimirSalida(registro);
    }
}
