
/**
 * Clase encargada de controlar el sistema de pedidos
 * y las operaciones de Undo y Redo.
 */
public class GestionPedidos {

    // Pila principal donde están los pedidos activos
    public Pila pilaPrincipal;

    // Pila secundaria donde se guardan los pedidos deshechos
    public Pila pilaSecundaria;

    /**
     * Constructor.
     *
     * Crea las dos pilas vacías.
     */
    public GestionPedidos() {
        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }

    /**
     * Registra una nueva pizza.
     *
     * La pizza se agrega a la pila principal.
     *
     *
     */
    public void registrarPizza(Pizza pizza) {

        pilaPrincipal.push(pizza);

        /*
         * Cuando se registra una nueva pizza,
         * se elimina el historial de Redo.
         */
        pilaSecundaria = new Pila();

        System.out.println("Pizza registrada correctamente.");
    }

    /**
     * Deshacer (Undo).
     *
     * Retira la última pizza de la pila principal
     * y la pasa a la pila secundaria.
     */
    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaPrincipal.pop();

        pilaSecundaria.push(pizza);

        System.out.println("Pedido deshecho correctamente.");
    }

    /**
     * Rehacer (Redo).
     *
     * Retira la última pizza de la pila secundaria
     * y la devuelve a la pila principal.
     */
    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaSecundaria.pop();

        pilaPrincipal.push(pizza);

        System.out.println("Pedido recuperado correctamente.");
    }

    /**
     * Muestra el pedido actual.
     *
     * Utiliza peek() para consultar la pizza
     * que se encuentra en el tope de la pila.
     */
    public void mostrarPedidoActual() {

        Pizza pizza = pilaPrincipal.peek();

        if (pizza == null) {
            System.out.println("No hay pedidos activos.");
            return;
        }

        System.out.println("\n--- PEDIDO ACTUAL ---");
        pizza.mostrarPizza();
    }
}

