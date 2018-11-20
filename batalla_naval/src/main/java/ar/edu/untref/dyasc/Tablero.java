package ar.edu.untref.dyasc;

public class Tablero {
    Casilla[][] tablero;
    int x;
    int y;

    public Tablero(int x, int y) {
        this.tablero = new Casilla[x][y];
        this.x = x;
        this.y = y;
    }
    
    public String obtenerTamanoDeTablero() {
        return x + "x" + y;
    }
}
