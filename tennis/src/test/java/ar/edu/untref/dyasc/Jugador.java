package ar.edu.untref.dyasc;

public class Jugador {

    private String nombre;
    private int puntos;
    private String puntajes[];
    private int games;
    private int sets;
    private int puntosTieBrake;
    private boolean ganador;

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
        this.puntosTieBrake = 0;
        this.ganador = false;
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
        if(this.sets==3) {
        	this.ganador=true;
        }
    }

    public void igualarCeroGames() {
        this.games = 0;
    }

    public void igualarPuntosACero() {
        this.puntos = 0;
    }
    
    public void anotarPuntosTieBrake(){
    	this.puntosTieBrake+=1;
    }
    
    public int obtenerPuntosTieBrake(){
    	return this.puntosTieBrake;
    }
    
    public boolean esGanador(){
    	return this.ganador;
    }
}
