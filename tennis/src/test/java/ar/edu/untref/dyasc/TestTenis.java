package ar.edu.untref.dyasc;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestTenis {

    Jugador jugador1 = new Jugador("Pepe");
    Jugador jugador2 = new Jugador("Pablo");
	Partido partido = new Partido(jugador1, jugador2);
	
    @Test
    public void unJugadorSumaUnPunto() {
        partido.sumarPunto("Pepe");
        Assert.assertEquals("15", partido.obtenerPuntos("Pepe"));
    }

    @Test
    public void unJugadorSumaUnPuntoDe30A40() {
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        Assert.assertEquals("40", partido.obtenerPuntos("Pepe"));
    }

    @Test
    public void siJugadorTiene40PuntosYSumaUnoGanaUnGame() {
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        Assert.assertEquals(1, partido.obtenerGames("Pepe"));
    }

    @Test
    public void ambosJugadoresTienen40PuntosElQueAnotaElPuntoTieneVentaja() {
        for(int i = 0; i<3; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pablo");
        }
        partido.sumarPunto("Pablo");
        Assert.assertEquals("AV", partido.obtenerPuntos("Pablo"));
    }
    
    @Test
    public void siUnJugadorTieneAVyGanaUnPuntoEntoncesGanaUnGame() {
        for(int i = 0; i<3; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pablo");
        }
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        Assert.assertEquals(1, partido.obtenerGames("Pablo"));
    }
    
    @Test
    public void siUnJugadorTieneAVyElOtroJugadorAnotaUnPuntoAmbosVuelvenConA40() {
        for(int i = 0; i<3; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pablo");
        }
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pepe");
        Assert.assertEquals("40", partido.obtenerPuntos("Pepe"));
        Assert.assertEquals("40", partido.obtenerPuntos("Pablo"));
    }

    @Test
    public void siUnJugadorGana6GamesGanaUnSet() {
        for(int i=0; i<6; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
        }
        Assert.assertEquals(1, partido.obtenerSets("Pepe"));
    }

    @Test
    public void siUnJugadorGanaUnGameAmbosJugadoresComienzanConCeroPuntos() {
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        Assert.assertEquals("0", partido.obtenerPuntos("Pepe"));
        Assert.assertEquals("0", partido.obtenerPuntos("Pablo"));
    }

    @Test
    public void siUnJugadorGanaUnSetAmbosJugadoresComienzanConCeroGames() {
        for(int i=0; i<6; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
        }
        Assert.assertEquals(0, partido.obtenerGames("Pepe"));
        Assert.assertEquals(0, partido.obtenerGames("Pablo"));
    }
    
    @Test
    public void siUnJugadorTieneCincoGamesYAnotaOtroConDiferenciaDeDosGanaUnSet(){
        for(int i=0; i<4; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
        }

        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");        

        Assert.assertEquals(1, partido.obtenerSets("Pepe"));
    }
    
    @Test
    public void siUnJugadorTieneCincoGamesElOtroTieneCuatroYGanaOtroGameSinDiferenciaNoGanaSet(){
        for(int i=0; i<4; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
        }

        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");

        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
    
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        
        Assert.assertEquals(0, partido.obtenerSets("Pepe"));
    }
    
    @Test
    public void siUnJugadorTieneCincoGamesElOtroTieneCuatroYGanaOtroGameConDiferenciaGanaSet(){
        for(int i=0; i<4; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
        }

        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
    
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        
        Assert.assertEquals(1, partido.obtenerSets("Pepe"));
    }
    
    @Test
    public void siUnJugadorTieneCincoGamesElOtroTieneCuatroYGanaOtroGameSinDiferenciaJueganTieBrake(){
        for(int i=0; i<4; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
        }

        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        
        for(int j=0; j<6; j++) {
        	partido.sumarPuntoTieBrake("Pepe");
            partido.sumarPuntoTieBrake("Pablo");
        }
    	partido.sumarPuntoTieBrake("Pepe");
        
    	Assert.assertEquals(0, partido.obtenerSets("Pepe"));
    }
    
    @Test
    public void seJuegaTieBrakeYGanaUnSet(){
        for(int i=0; i<4; i++) {
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            partido.sumarPunto("Pepe");
            
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
            partido.sumarPunto("Pablo");
        }

        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        partido.sumarPunto("Pablo");
        
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        partido.sumarPunto("Pepe");
        
        for(int j=0; j<6; j++) {
        	partido.sumarPuntoTieBrake("Pepe");
        }
    	partido.sumarPuntoTieBrake("Pablo");
    	partido.sumarPuntoTieBrake("Pepe");
        
    	Assert.assertEquals(1, partido.obtenerSets("Pepe"));
    	Assert.assertEquals(0, partido.obtenerGames("Pepe"));
    }
    
    @Test
    public void comprobamosQueHayUnGanador(){
    	
    	for(int j=0; j<3; j++) {
    	   	for(int i=0; i<6; i++) {
                partido.sumarPunto("Pepe");
                partido.sumarPunto("Pepe");
                partido.sumarPunto("Pepe");
                partido.sumarPunto("Pepe");
        	}
    	}
    	
    	Assert.assertTrue(partido.ganador().equals("Pepe"));
    }
}