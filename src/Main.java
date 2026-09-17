
import java.util.Scanner;

/**
 * Clase principal del programa Pizza-Track.
 *
 * Contiene el menú que permite al usuario
 * registrar, deshacer, rehacer y consultar pedidos.
 * 
 */
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Creamos el sistema de gestión
        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println("       PIZZA-TRACK");
            System.out.println("==============================");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    // Pedimos el nombre
                    System.out.print("\nIngrese el nombre de la pizza: ");
                    String nombre = teclado.nextLine();

                    // Creamos el arreglo fijo de 3 ingredientes
                    String[] ingredientes = new String[3];

                    // Pedimos los 3 ingredientes
                    for (int i = 0; i < 3; i++) {

                        System.out.print(
                            "Ingrese el ingrediente " + (i + 1) + ": "
                        );

                        ingredientes[i] = teclado.nextLine();
                    }

                    // Creamos la pizza
                    Pizza pizza = new Pizza(nombre, ingredientes);

                    // Registramos la pizza
                    gestion.registrarPizza(pizza);

                    break;

                case 2:

                    // Deshacer último pedido
                    gestion.deshacer();

                    break;

                case 3:

                    // Recuperar último pedido deshecho
                    gestion.rehacer();

                    break;

                case 4:

                    // Mostrar pizza que está en el tope
                    gestion.mostrarPedidoActual();

                    break;

                case 0:

                    System.out.println("\nPrograma finalizado.");

                    break;

                default:

                    System.out.println(
                        "\nOpción inválida. Intente nuevamente."
                    );
            }

        } while (opcion != 0);

        teclado.close();
    }
}
