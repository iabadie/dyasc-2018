package ar.edu.untref.dyasc;

public class Bote extends Unidad {
    
    public Bote(int x, int y) {
        this.partes = new Parte[1];
        this.partes[0] = new Parte(x, y);
    }
}
