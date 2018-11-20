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
    public void testAgregarUnBoteEnUnaCasillaCreaElBote() {
        Tablero tablero = new Tablero(4,2);
        tablero.agregarBoteEnCasilla(3,1);
        Assert.assertNotNull(tablero.obtenerCasilla(3,1));
    }
    
    @Test
    public void testAgregarUnCrucerEnCassillasCreaElCrucero() {
        Tablero tablero = new Tablero(4,2);
        tablero.agregarCruceroEnCasillas(1,1,true);
        Assert.assertNotNull(tablero.obtenerCasilla(1,1));
    }
}