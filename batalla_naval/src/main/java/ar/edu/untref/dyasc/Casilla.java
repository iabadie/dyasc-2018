package ar.edu.untref.dyasc;

public class Casilla {
    private Bote bote = null;
    public void agregarBote(Bote bote) {
        this.bote = bote;
    }
    
    public Bote revisarCasilla() {
        return bote;
    }
    
}
