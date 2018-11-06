package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

public class TestCasilla {
    
    @Test
    public void testAgregarBoteACasilla() {
        Bote bote = new Bote();
        Casilla casilla = new Casilla();
        casilla.agregarBote(bote);
        Assert.assertNotNull(casilla.revisarCasilla());
    }
}
