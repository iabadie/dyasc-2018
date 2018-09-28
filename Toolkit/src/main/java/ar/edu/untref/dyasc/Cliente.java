package ar.edu.untref.dyasc;

public class Cliente {
    Bitacora miBitacora;

    public Cliente(String name) {
        super();
        this.miBitacora = new Bitacora(name);
    }

    public void accionUno() {
        miBitacora.registrarEvento("Acción 1");
    }

    public void accionDos() {
        miBitacora.registrarEvento("Acción 2");
    }

    public void accionTres() {
        miBitacora.registrarEvento("Acción 3");
    }
}
