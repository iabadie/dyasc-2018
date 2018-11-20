package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")

public class TestCrucero {
    @Test
    public void crearUnCrucero() {
        Crucero crucero = new Crucero(1,1, true);
        Assert.assertNotNull(crucero.obtenerParte(1, 1));;
    }
    
    @Test
    public void testEstadoDeParteDeCruceroEsNullSiLasCoordenadasNoCorrespondenAUnaParteDelCrucero() {
        Crucero crucero = new Crucero(1,1, true);
        Assert.assertNull(crucero.obtenerParte(1, 2));;
    }
    
    @Test
    public void testCrearUnCruceroHorizontalOcupaCasillasEnFormaHorizontal() {
        Crucero crucero = new Crucero(1,1, true);
        Assert.assertNotNull(crucero.obtenerParte(3, 1));;
    }
    
    @Test
    public void testCrearUnCruceroVerticalOcupaCasillasEnFormaVertical() {
        Crucero crucero = new Crucero(1,1, false);
        Assert.assertNotNull(crucero.obtenerParte(1, 3));;
    }
    
}
