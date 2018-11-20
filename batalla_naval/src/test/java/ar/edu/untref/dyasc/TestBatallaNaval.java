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
    
    @Test
    public void testDispararSobreUnaUnidadDebeDevolverEstadoTocado(){
        Tablero tablero = new Tablero(6,6);
        tablero.agregarCruceroEnCasillas(1, 1, true);
        Assert.assertEquals("TOCADO", tablero.dispararHacia(1,1)); 
    }
    
    @Test
    public void testDispararSobreUnaUnidadDebeDevolverEstadoHundido(){
        Tablero tablero = new Tablero(6,6);
        tablero.agregarCruceroEnCasillas(1, 1, true);
        tablero.dispararHacia(1,1);
        Assert.assertEquals("HUNDIDO", tablero.dispararHacia(1,1)); 
    }
    
    @Test
    public void testDispararPosicionLejosDeUnaUnidadDebeDevolverEstadoAgua(){
        Tablero tablero = new Tablero(6,6);
        tablero.agregarCruceroEnCasillas(1, 1, true);
        tablero.dispararHacia(1,1);
        Assert.assertEquals("AGUA", tablero.dispararHacia(1,2)); 
    }
}
