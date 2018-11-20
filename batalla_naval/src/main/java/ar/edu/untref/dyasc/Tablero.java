package ar.edu.untref.dyasc;

public class Tablero {
    Unidad[][] tablero;
    int x;
    int y;

    public Tablero(int x, int y) {
        this.tablero = new Unidad[x][y];
        this.x = x;
        this.y = y;
    }
    
    public String obtenerTamanoDeTablero() {
        return x + "x" + y;
    }

    public void agregarBoteEnCasilla(int x, int y) {
        
        tablero[x-1][y-1] = new Bote(x,y);
    }

    public void agregarCruceroEnCasillas(int x, int y, boolean horizontal) {
        Crucero crucero = new Crucero(x,y,horizontal);
        for (int i=0;i<3;i++) {
            if (horizontal) {
                tablero[x-1+i][y-1] = crucero;                                
            } else {
                tablero[x-1][y-1 + i] = crucero;
            }
        }
    }
    
    public Unidad obtenerCasilla(int x, int y) {
        return tablero[x-1][y-1];
    }
}
