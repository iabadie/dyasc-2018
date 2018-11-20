package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")

public class TestBote {
    @Test
    public void crearUnBote() {
        Bote bote = new Bote(1,1);
        Assert.assertNotNull(bote.obtenerParte(1, 1));;
    }
    
    @Test
    public void testEstadoDeBoteEsNullSiLasCoordenadasNoCorrespondenAlBote() {
        Bote bote = new Bote(1,1);
        Assert.assertNull(bote.obtenerParte(2, 1));;
    }
    
}
