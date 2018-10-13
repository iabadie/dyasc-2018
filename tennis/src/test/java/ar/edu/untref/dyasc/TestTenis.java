package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestTenis {

    @Test
    public void unJugadorSumaUnPunto() {
        Jugador jugador1 = new Jugador("Pepe");
        Jugador jugador2 = new Jugador("Pablo");
        Partido partido = new Partido(jugador1, jugador2);
        partido.sumarPunto("Pepe");
        System.out.print(partido.obtenerPuntos("Pepe"));
        Assert.assertEquals("15", partido.obtenerPuntos("Pepe"));
    }

    @Test
    public void unJugadorSumaUnPuntoDe30A40() {
        Jugador jugador1 = new Jugador("Pepe");
        Jugador jugador2 = new Jugador("Pablo");
        Partido partido = new Partido(jugador1, jugador2);
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        Assert.assertEquals("40", partido.obtenerPuntos("Pepe"));
    }

    @Test
    public void siJugadorTiene40PuntosYSumaUnoGanaUnGame() {
        Jugador jugador1 = new Jugador("Pepe");
        Jugador jugador2 = new Jugador("Pablo");
        Partido partido = new Partido(jugador1, jugador2);
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        Assert.assertEquals(1, partido.obtenerGames("Pepe"));
    }

    @Test
    public void ambosJugadoresTienen40PuntosElQueAnotaElPuntoTieneVentaja() {
        Jugador jugador1 = new Jugador("Pepe");
        Jugador jugador2 = new Jugador("Pablo");
        Partido partido = new Partido(jugador1, jugador2);
        for(int i = 0; i<3; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pablo");
        }
        partido.sumarPunto("Pablo");
        Assert.assertEquals("AV", partido.obtenerPuntos("Pablo"));
    }
}
