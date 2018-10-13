package ar.edu.untref.dyasc;

public class Jugador {

    private String nombre;
    private int puntos;
    private String puntajes[];
    private int games;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.games = 0;
        this.puntajes = new String[5];
        this.puntajes[0]="0";
        this.puntajes[1]="15";
        this.puntajes[2]="30";
        this.puntajes[3]="40";
        this.puntajes[4]="AV";
    }

    public void anotarPunto() {
        this.puntos+=1;
    }

    public String obtenerPuntos() {
        return this.puntajes[this.puntos];
    }

    public int obtenerGames() {
        return this.games;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public void anotarGame() {
        this.games += 1;
    }

}
