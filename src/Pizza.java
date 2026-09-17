
/**
 * Clase que representa una pizza dentro del sistema Pizza-Track.
 * Cada pizza tiene un nombre y exactamente 3 ingredientes.
 */
public class Pizza {

    // Nombre de la pizza
    public String nombre;

    // Arreglo fijo para almacenar los 3 ingredientes
    public String[] ingredientes;
    

    /**
     * Constructor de la clase Pizza.
     *
     */
    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    /**
     * Muestra la información de la pizza.
     */
    public void mostrarPizza() {
        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes:");

        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("- " + ingredientes[i]);
        }
    }
}


