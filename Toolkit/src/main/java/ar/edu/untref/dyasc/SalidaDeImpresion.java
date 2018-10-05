package ar.edu.untref.dyasc;

public abstract class SalidaDeImpresion {
    SalidaDeImpresion _proximaSalida = null;

    public abstract void manejarSalida(String salida, String registro);

    public void establecerSiguiente(SalidaDeImpresion salida) {
        _proximaSalida = salida;
    };
}