package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private Map<String, Jugador> participantes;
    
    public Partido(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.participantes = new HashMap<String, Jugador>();
        this.participantes.put(jugador1.obtenerNombre(), jugador1);
        this.participantes.put(jugador2.obtenerNombre(), jugador2);
    }

    public void sumarPunto(String nombre) {
        if(jugador1.obtenerPuntos()!= jugador2.obtenerPuntos() &&
                this.participantes.get(nombre).obtenerPuntos().equals("40")) {
            this.participantes.get(nombre).anotarGame();
        } else {
            this.participantes.get(nombre).anotarPunto();
        }
    }

    public String obtenerPuntos(String nombre) {
        return this.participantes.get(nombre).obtenerPuntos();
    }

    public int obtenerGames(String nombre) {
        return this.participantes.get(nombre).obtenerGames();
    }
    
}
