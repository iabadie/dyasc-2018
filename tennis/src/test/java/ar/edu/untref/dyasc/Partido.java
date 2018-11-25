package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private Map<String, Jugador> participantes;
    private boolean tieBrake;
    
    public Partido(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.participantes = new HashMap<String, Jugador>();
        this.participantes.put(jugador1.obtenerNombre(), jugador1);
        this.participantes.put(jugador2.obtenerNombre(), jugador2);
        this.tieBrake = false;
    }

    public void sumarPunto(String nombre) {
    
    	if(!this.tieBrake) {
		    if(this.jugador1.obtenerPuntos().equals("AV") ||
		            this.jugador2.obtenerPuntos().equals("AV") &&
		            this.participantes.get(nombre).obtenerPuntos().equals("40")) {
		        this.jugador1.igualarA40();
		        this.jugador2.igualarA40();
		        return;
		    }
		    if(jugador1.obtenerPuntos()!= jugador2.obtenerPuntos() &&
		            this.participantes.get(nombre).obtenerPuntos().equals("40") ||
		            this.participantes.get(nombre).obtenerPuntos().equals("AV")) {
		        this.participantes.get(nombre).anotarGame();
		        this.jugador1.igualarPuntosACero();
		        this.jugador2.igualarPuntosACero();
		    } else {
		        this.participantes.get(nombre).anotarPunto();
		    }
		    
		    int diferencia = Math.abs(this.jugador1.obtenerGames()-this.jugador2.obtenerGames());
		    if(this.participantes.get(nombre).obtenerGames() == 6 && diferencia>=2){
		        this.participantes.get(nombre).anotarSet();
		        this.jugador1.igualarCeroGames();
		        this.jugador2.igualarCeroGames();
		    }
		    if(this.participantes.get(nombre).obtenerGames() == 6 && diferencia<2) {
		    	this.jugarTieBrake();
		    }
    	}else {
    		sumarPuntoTieBrake(nombre);
    	}
    }
    
    private void jugarTieBrake() {
    	this.tieBrake = true;
	}

	private void sumarPuntoTieBrake(String nombre) {
    	int diferencia = Math.abs(this.jugador1.obtenerPuntosTieBrake()-this.jugador2.obtenerPuntosTieBrake());
    	
    	if(this.participantes.get(nombre).obtenerPuntosTieBrake()>5 && diferencia==2){
    		this.participantes.get(nombre).anotarSet();
    		this.jugador1.igualarCeroGames();
	        this.jugador2.igualarCeroGames();
    	}else {
    		this.participantes.get(nombre).anotarPuntosTieBrake();
    	}
    }

	public String obtenerPuntos(String nombre) {
        return this.participantes.get(nombre).obtenerPuntos();
    }

    public int obtenerGames(String nombre) {
        return this.participantes.get(nombre).obtenerGames();
    }

    public int obtenerSets(String nombre) {
        return this.participantes.get(nombre).obtenerSets();
    }

	public String ganador() {
		String ganador = "";
		if(this.obtenerSets(this.jugador1.obtenerNombre())==3) {
			ganador = this.jugador1.obtenerNombre();
		}else if(this.obtenerSets(this.jugador2.obtenerNombre())==3){
			ganador = this.jugador2.obtenerNombre();
		}else {
			ganador = "nadie";
			System.out.println("No hay ganadores todavía.");
		}
		return ganador;
	}
    
}
