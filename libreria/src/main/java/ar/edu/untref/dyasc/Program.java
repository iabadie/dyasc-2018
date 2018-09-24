package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {

        System.out.println("Inicializa librería");
        Libreria libreria = new Libreria();

        //  Crea el cliente Carlos, con dirección av 123 y dni 1331
        Cliente cliente = new Cliente("Carlos", "av 123", 1331);

        // Registra en el sistema
        libreria.registrarCliente(cliente);

        // Creación de productos par ala librería
        Producto libro = new Libro(100);
        Producto libro2 = new Libro(145);

        // Crea articulo con 21% de iva
        Producto articulo1 = new Articulo(50, 0.21);
        Producto diario1 = new Periodico(45, 28);
        Producto revistaDeArmando = new Revista(123, 4);

        // Carga los productos comprados por el cliente a su cuenta corriente
        libreria.cargarProductoDeCliente(1331, articulo1, 5);
        libreria.cargarProductoDeCliente(1331, libro, 5);

        // Carga el segundo libro al mes siguiente a los anteriores
        libreria.cargarProductoDeCliente(1331, libro2, 6);

        // Suscribe anualmente a Carlos a un diario y a una revista
        libreria.suscribirCliente(1331, diario1);
        libreria.suscribirCliente(1331, revistaDeArmando);

        // Resultados en pantalla
        System.out.println("Mes de Mayo: " + libreria.obtenerValorPorCobrar(1331, 5));
        System.out.println("Anual: " + libreria.obtenerValorPorCobrarAnual(1331));

        // Exception - Cliente inexistente
        libreria.obtenerValorPorCobrar(32, 5);
    }
}
