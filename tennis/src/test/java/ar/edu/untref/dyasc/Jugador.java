package ar.edu.untref.dyasc;

public class Jugador {
    
    private int puntos;
    
    public Jugador() {
        this.puntos = 0;
    }

    public void anotarPunto() {
        
        this.puntos+=15;
    }

    public int getPuntos() {
        return this.puntos;
    }

}
