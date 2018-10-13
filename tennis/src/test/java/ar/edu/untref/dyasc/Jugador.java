package ar.edu.untref.dyasc;

public class Jugador {

    private String nombre;
    private int puntos;
    private String puntajes[];
    private int games;
    private int sets;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.games = 0;
        this.sets = 0;
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

    public void igualarA40() {
        this.puntos = 3;
    }

    public int obtenerSets() {
        return this.sets;
    }

    public void anotarSet() {
        this.sets += 1;
    }

    public void igualarCeroGames() {
        this.games = 0;
    }

    public void igualarPuntosACero() {
        this.puntos = 0;
    }

}
