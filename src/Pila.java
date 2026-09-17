/**
 * Clase Pila.
 *
 * Implementa una pila manual utilizando
 * una lista ligada de nodos.
 *
 * No se utiliza java.util.Stack.
 */
public class Pila {

    // Representa el elemento que está en el tope
    public Nodo tope;

    /**
     * Constructor de la pila.
     *
     * Inicialmente la pila está vacía.
     */
    public Pila() {
        tope = null;
    }

    /**
     * isEmpty()
     *
     * Verifica si la pila está vacía.
     *
     * 
     */
    public boolean isEmpty() {

        return tope == null;
    }


    /**
     * push()
     *
     * Agrega una Pizza en el tope de la pila.
     *
     *
     */
    public void push(Pizza pizza) {
        //Creamos un nuevo Nodo pasando la nuevaPizza.
        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al antiguo tope
        nuevo.siguiente = tope;

        // El nuevo nodo se convierte en el tope
        tope = nuevo;
    }

    /**
     * pop()
     *
     * Retira la Pizza que está en el tope.
     *
     * 
     */
    public Pizza pop() {

        // Verificamos si la pila está vacía
        if (isEmpty()) {
            return null;
        }

        // Guardamos la pizza del tope
        Pizza pizza = tope.pizza;

        // Movemos el tope al siguiente nodo
        tope = tope.siguiente;

        // Retornamos la pizza retirada
        return pizza;
    }

    /**
     * peek()
     *
     * Permite consultar la Pizza que está
     * en el tope sin retirarla.
     *
     * 
     */
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return tope.pizza;
    }
}

    

