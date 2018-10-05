package ar.edu.untref.dyasc;

import java.io.FileWriter;
import java.io.IOException;

public class SalidaDeTexto extends SalidaDeImpresion{

    @Override
    public void manejarSalida(String salida, String registro) {
        if (salida != null && salida.endsWith(".txt")) {
            FileWriter escritor;
            try {
                escritor = new FileWriter(salida, true);
                escritor.write(registro);
                escritor.close();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        } else if(_proximaSalida != null) {
            _proximaSalida.manejarSalida(salida, registro);
        } else {
            System.out.println("No se especificó una salida de impresión");
        }
    }
}
