package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

public class TestBatallaNaval {
    @Test
    public void agregarUnBoteOcupaUnaCasilla(){
        Tablero tablero = new Tablero(4,4);
        tablero.agregarBoteEnCasilla(3, 1);
        Assert.assertNotNull(tablero.obtenerCasilla(3, 1));
    }
    
    @Test
    public void agregarUnCruceroOcupaTresCasillas(){
        Tablero tablero = new Tablero(6,6);
        tablero.agregarCruceroEnCasillas(1, 1, true);
        Assert.assertNotNull(tablero.obtenerCasilla(1, 1));
        Assert.assertNotNull(tablero.obtenerCasilla(2, 1));
        Assert.assertNotNull(tablero.obtenerCasilla(3, 1));
    }
}
