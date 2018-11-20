package ar.edu.untref.dyasc;

public abstract class Unidad {
    Parte[] partes;

    public Parte obtenerParte(int x, int y) {
        String posicion = x+","+y;
        for (Parte parte : this.partes) {
            if (parte.obtenerPosicion().equals(posicion)) {
                return parte;
            }
        }
        return null;
    }
}
