package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestTenis {
    
    @Test
    public void unJugadorSumaUnPunto() {
        Jugador jugador1 = new Jugador();
        jugador1.anotarPunto();
        Assert.assertEquals(15, jugador1.getPuntos());
    }
    
}
