
public class Arbol<T> {
    private NodoArbol<T> raiz; // Se declarala variable nodo generico para poder guardar cualquier tipo de dato
    private boolean esBinario = false;
    /**
     * Constructor para crear nuestro arbol de que tipo sera y su raiz
     * @param dato
     * @param esBinario
     */
    public Arbol(T dato, boolean esBinario) {
        raiz = new NodoArbol<T>(dato);
        raiz.setEsBinario(esBinario);
        this.esBinario = esBinario;
    }

    /**
     * Sirve para obtenermla raiz del arbol
     * @return raiz
     */
    public NodoArbol<T> obtenerRaiz() {
        return raiz;
    }

    /**
     * Sirve para saber si es binario
     * @return esBinario
     */
    public boolean esBinario() {
        return esBinario;
    }
    /**
     * Agrega un nodo al arbol
     * @param nodoRaiz Nodo al que se le añadirá un hijo
     * @param nodoAgregado Nodo que se agregará como hijo
     */
    public void agregarNodoArbol(NodoArbol<T> nodoRaiz, NodoArbol<T> nodoAgregado) {
        if (esBinario) {
            nodoAgregado.setEsBinario(esBinario);
        }

        nodoRaiz.agregarHijo(nodoAgregado);
    }
/**
 * Es un metodo que al llamarlo especificamos como vamos a imprimir nuestro arbol que se tiene un switch case
 * @param recorrido
 */
    public void imprimirArbol(Recorrido recorrido) {
        switch (recorrido.ordinal()) {
            case 0:
                System.out.println("Prefijo: ");
                raiz.imprimirEnPrefijo();
                break;

            case 1:
                System.out.println("\nInfijo: ");
                raiz.imprimirEnInfijo();
                break;

            case 2:
                System.out.println("\nPosfijo: ");
                raiz.imprimirEnPosfijo();
                break;

            default:
                break;
        }
    }
/**
 * Sirve para saber si nuestro arbol esta vacio
 * @return raiz == null
 */
    public boolean estaVacio() {
        return raiz == null;
    }
    /**
     * Sirve para llamar el metodo recursivo para obtener la altura
     * @return obtenerAlturaRecursivo(raiz);
     */
    public int obtenerAltura() {
        return obtenerAlturaRecursivo(raiz);
    }
    /**
     * Sirve para obtener la altura del arbol mediante el recorrido de los hijos de la raiz y sus hermanos
     * comparando la altura maxima entre ellos
     * @param nodo es desde donde va a empezar el recorrido 
     * @return altura
     */
    public int obtenerAlturaRecursivo(NodoArbol<T> nodo) {
        // Si el nodo es nulo, la altura es 0.
        if (nodo == null) {
            return 0;
        } else {
            // Inicializa la altura como 0.
            int altura = 0;
            // Obtiene el primer hijo del nodo.
            NodoArbol<T> hijo = nodo.obtenerPrimerHijo();
    
            // Recorre todos los hermanos del nodo.
            while (hijo != null) {
                // Calcula la altura recursivamente para cada hijo y actualiza la altura máxima.
                altura = Math.max(altura, obtenerAlturaRecursivo(hijo));
                // Obtiene el siguiente hermano.
                hijo = hijo.obtenerSiguienteHermano();
            }
    
            // Retorna la altura del nodo actual más 1.
            return 1 + altura;
        }
    }
    /**
     * Sirve para imprimir SubArboles mediante un nodo que se va a volver la raiz
     * y lo imprime mediante prefijo llamando el metodo prefijo
     * @param nodo desde donde va imprimir 
     */
    public void imprimirSubArbol(NodoArbol<T> nodo)
    {   raiz=nodo;
        raiz.imprimirEnPrefijo();
        
    }
    
    
    
}