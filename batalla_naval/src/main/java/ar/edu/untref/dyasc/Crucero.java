package ar.edu.untref.dyasc;

public class Crucero extends Unidad {
    
    public Crucero(int x, int y, boolean horizontal) {
        this.partes = new Parte[3];
        for (int i = 0; i<3; i++) {
            if (horizontal) {
                this.partes[i] = new Parte(x + i,y);
            } else {                
                this.partes[i] = new Parte(x,y + i);
            }
        }
    }
}
