package ar.edu.untref.dyasc;

public class Parte {
    int x;
    int y;
    String estado = "OK";
    public Parte(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String obtenerPosicion() {
        return x+","+y;
    }
    
    public String obtenerEstado() {
        return estado;
    }
    
    public String marcarGolpe() {
        if (estado.equals("OK")) {
            estado = "TOCADO";
        } else {            
            estado = "HUNDIDO";
        }
        return estado;
    }
}
