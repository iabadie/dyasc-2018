package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

public class TestBatallaNaval {
    @Test
    public void agregarUnBoteOcupaUnaCasilla(){
        Tablero tablero = new Tablero(4,4);
        Bote bote = new Bote();
        tablero.agregarBoteEnCasilla(bote, 3, 1);
        Assert.assertNotNull(tablero.obtenerCasilla(3, 1));
    }
}
