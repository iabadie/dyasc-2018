package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

public class TestTablero {
    
    @Test
    public void testCrearUnTableroCreaUnTableroDeXporYCasillas() {
        Tablero tablero = new Tablero(4,2);
        Assert.assertEquals("4x2", tablero.obtenerTamanoDeTablero());
    }
    
    @Test
    public void testAgregarUnBoteEnUnaCasilla() {
        Tablero tablero = new Tablero(4,2);
        Bote bote = new Bote();
        tablero.agregarBoteEnCasilla(bote,3,1);
        Assert.assertEquals(bote, tablero.obtenerCasilla(3,1));
    }
}