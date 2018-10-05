package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestTenis {
    
    private Jugador jugador1 = new Jugador("Pepe");
    
    @Test
    public void unJugadorSumaUnPunto() {
        jugador1.anotarPunto();
        Assert.assertEquals("15", jugador1.obtenerPuntos());
    }
    
    @Test
    public void unJugadorSumaUnPuntoDe30A40() {
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        Assert.assertEquals("40", jugador1.obtenerPuntos());
    }
    
    @Test
    public void siJugadorTiene40PuntosYSumaUnoGanaUnGame() {
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        jugador1.anotarPunto();
        Assert.assertEquals(1, jugador1.obtenerGames());
    }
    
    @Test
    public void ambosJugadoresTienen40PuntosElQueAnotaElPuntoTieneVentaja() {
        
        Jugador jugador2 = new Jugador("Pablo");
        Partido partido = new Partido(jugador1, jugador2);
        
        for(int i = 0; i<3; i++) {
            jugador1.anotarPunto();
            jugador2.anotarPunto();
        }
        partido.sumarPunto("Pablo");
        
        Assert.assertEquals("AV", partido.obtenerPuntos("Pablo"));
    }
}
