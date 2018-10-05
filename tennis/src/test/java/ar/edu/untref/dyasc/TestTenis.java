package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestTenis {
    
    @Test
    public void unJugadorSumaUnPunto() {
        Jugador jugador1 = new Jugador();
        jugador1.anotarPunto();
        Assert.assertEquals("15", jugador1.obtenerPuntos());
    }
    
    @Test
    public void unJugadorSumaUnPuntoDe30A40() {
        Jugador jugador1 = new Jugador();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        Assert.assertEquals("40", jugador1.obtenerPuntos());
    }
    
    @Test
    public void siJugadorTiene40PuntosYSumaUnoGanaUnGame() {
        Jugador jugador1 = new Jugador();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        Assert.assertEquals(1, jugador1.obtenerGames());
    }
}
