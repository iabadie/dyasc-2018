package Toolkit;

public class SalidaPorConsola extends SalidaDeImpresion {
    String formato = "CONSOLA";

    @Override
    public void manejarSalida(String salida, String registro) {
        if (salida != null && salida.equals(formato)) {
            System.out.print(registro);
        } else if(_proximaSalida != null) {
            _proximaSalida.manejarSalida(salida, registro);
        } else {
            System.out.println("No se especificó una salida de impresión");
        }
    }
}
