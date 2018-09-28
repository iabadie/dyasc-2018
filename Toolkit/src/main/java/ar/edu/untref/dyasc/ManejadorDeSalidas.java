package ar.edu.untref.dyasc;

public class ManejadorDeSalidas {
    SalidaDeImpresion _salidaDeTexto;
    SalidaDeImpresion _salidaPorConsola;
    SalidaDeImpresion _candidato;
    String[] destino;

    public ManejadorDeSalidas() {
        _salidaDeTexto = new SalidaDeTexto();
        _salidaPorConsola = new SalidaPorConsola();
        _candidato = _salidaPorConsola; 
        _salidaPorConsola.establecerSiguiente(_salidaDeTexto);
        String parametrosDestino = System.getProperty("bitacora.destino");
        destino = parametrosDestino != null ? parametrosDestino.split(",") : new String[0];
    }

    public void imprimirSalida(String registro) {
        for (int i = 0; i < destino.length; i++) {
            _candidato.manejarSalida(destino[i], registro);
        }
    }
}
