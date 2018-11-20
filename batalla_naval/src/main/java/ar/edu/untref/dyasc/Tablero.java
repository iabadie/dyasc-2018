package ar.edu.untref.dyasc;

public class Tablero {
    Bote[][] tablero;
    int x;
    int y;

    public Tablero(int x, int y) {
        this.tablero = new Bote[x][y];
        this.x = x;
        this.y = y;
    }
    
    public String obtenerTamanoDeTablero() {
        return x + "x" + y;
    }

    public void agregarBoteEnCasilla(Bote bote, int x, int y) {
        tablero[x-1][y-1] = bote;
    }

    public Bote obtenerCasilla(int x, int y) {
        return tablero[x-1][y-1];
    }
}
