package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

public class TestBatallaNaval {
    @Test
    public void agregarUnBoteOcupaUnaCasilla(){
        Bote bote = new Bote();
        Casilla casilla = new Casilla();
        casilla.agregarBote(bote);
        Assert.assertNotNull(casilla.revisarCasilla());
    }
}
