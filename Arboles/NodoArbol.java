//se crea una clase generica que pueda manejar cualquier tipo de dato
public class NodoArbol<T> {
    // Se crea sus variables
    private T dato; // se crea una variable generica para poder almacenar lo que sea
    private boolean esBinario = false;
    private NodoArbol<T> primerHijo; // se crea el nodo primerHijo de tipo generico
    private NodoArbol<T> siguienteHermano;// se crea el nodo siguienteHermano de tipo generico

    /**
     * Constructor que recibe como parametro el dato generico e inicializa el primer
     * hijo y el siguiente hermano
     * 
     * @param dato
     */
    public NodoArbol(T dato) {
        this.dato = dato;
        primerHijo = null;
        siguienteHermano = null;
    }

    /**
     * Este metodo sirve agregar nodos hijos a nuestro arbol
     * 
     * @param hijo //es el nodo hijo que agregaremos
     */
    public void agregarHijo(NodoArbol<T> hijo) {
        // Si no hay nodos hijos en nuestro arbol se crea el primer hijo
        if (primerHijo == null) {
            primerHijo = hijo;
        } else {
            // si ya hay un hijo se crea a sus nodos hermanos
            NodoArbol<T> hermano = this.primerHijo;
            // si el arbol es binario y si se quiere agregar otro nodo hermano pero ya hay
            // un nodo hermano arrojara un
            // mensaje en pantalla si en dado no fuera asi se agrega
            if (esBinario) {
                if (hermano.siguienteHermano != null) {
                    System.err.println("El nodo ya tiene un hijo, no se debe agregar " + hijo.getDato());
                } else {
                    hermano.siguienteHermano = hijo;
                }
                // si el arbol no es binario se puede agregar hermanos hasta que el siguiente
                // hermano sea nulo
            } else {
                while (hermano.siguienteHermano != null) {
                    hermano = hermano.siguienteHermano;
                }
                // se asigna el nodo hermano siguiente a ese como hijo
                hermano.siguienteHermano = hijo;
            }
        }
    }

    /**
     * Sirve para obtener al primer hijo
     * 
     * @return primerHijo
     */
    public NodoArbol<T> obtenerPrimerHijo() {
        return primerHijo;
    }

    /**
     * Sirve para obtener al hermano del nodo hijo y a sus demas hermanos si usamos
     * bien el metodo
     * 
     * @return siguienteHermano
     */
    public NodoArbol<T> obtenerSiguienteHermano() {
        return siguienteHermano;
    }

    /**
     * Sirve para obtener el dato de lo que queramos
     * 
     * @return dato
     */
    public T getDato() {
        return dato;
    }

    /**
     * Sirve para verificar si nuestro arbol es binario
     * 
     * @return esBinario
     */
    public boolean esBinario() {
        return esBinario;
    }

    /**
     * Sirve para establecer que tipo es nuestro arbol
     * 
     * @param esBinario
     */
    public void setEsBinario(boolean esBinario) {
        this.esBinario = esBinario;
    }

    /**
     * Sirve para imprimir el arbol en prefijo
     * 
     * @param
     */
    public void imprimirEnPrefijo() {
        System.out.print(dato + "\t");
        NodoArbol<T> hijo = primerHijo;

        while (hijo != null) {
            hijo.imprimirEnPrefijo();
            hijo = hijo.siguienteHermano;
        }
    }

    /**
     * Sirve para imprimir el arbol en infijo
     * 
     * @param
     */
    public void imprimirEnInfijo() {
        NodoArbol<T> hijo = primerHijo;

        if (hijo != null) {
            hijo.imprimirEnInfijo();
        }

        System.out.print(dato + "\t");
        while (hijo != null) {
            hijo = hijo.siguienteHermano;
            if (hijo != null) {
                hijo.imprimirEnInfijo();
            }
        }
    }

    /**
     * sirve para imprimir el arbol en posfijo
     * 
     * @param
     */
    public void imprimirEnPosfijo() {
        NodoArbol<T> hijo = primerHijo;

        while (hijo != null) {
            hijo.imprimirEnPosfijo();
            hijo = hijo.siguienteHermano;
        }

        System.out.print(dato + "\t");
    }
}