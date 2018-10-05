package ar.edu.untref.dyasc;

public class Jugador {
    
    private int puntos;
    private String puntajes[];

    public Jugador() {
        this.puntos = 0;
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

    public String getPuntos() {
        return this.puntajes[this.puntos];
    }

}
