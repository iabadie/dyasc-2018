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
        if(this.jugador1.obtenerPuntos().equals("AV") ||
                this.jugador2.obtenerPuntos().equals("AV") &&
                this.participantes.get(nombre).obtenerPuntos().equals("40")) {
            this.jugador1.igualarA40();
            this.jugador2.igualarA40();
            return;
        }
        if(jugador1.obtenerPuntos()!= jugador2.obtenerPuntos() &&
                this.participantes.get(nombre).obtenerPuntos().equals("40") ||
                this.participantes.get(nombre).obtenerPuntos().equals("AV")) {
            this.participantes.get(nombre).anotarGame();
        } else {
            this.participantes.get(nombre).anotarPunto();
        }
        if(this.participantes.get(nombre).obtenerGames() == 6) {
            this.participantes.get(nombre).anotarSet();
        }
    }

    public String obtenerPuntos(String nombre) {
        return this.participantes.get(nombre).obtenerPuntos();
    }

    public int obtenerGames(String nombre) {
        return this.participantes.get(nombre).obtenerGames();
    }

    public int obtenerSets(String nombre) {
        return this.participantes.get(nombre).obtenerSets();
    }
    
}
