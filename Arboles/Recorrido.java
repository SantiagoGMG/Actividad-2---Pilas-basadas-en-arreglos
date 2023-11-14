/** 
 * Enumeración que representa diferentes tipos de recorridos en un árbol.
*/
public enum Recorrido {
    /**
     * Recorrido en preorden: Raíz, Izquierda, Derecha.
     * Visita primero la raíz, luego el hijo izquierdo y finalmente el
     * hijo derecho.
     */
    PREFIJO,

    /**
     * Recorrido en inorden: Izquierda, Raíz, Derecha.
     * Visita primero el hijo izquierdo, luego la raíz y finalmente el
     * hijo derecho.
     */
    INFIJO,

    /**
     * Recorrido en postorden: Izquierda, Derecha, Raíz.
     * Visita primero el hijo izquierdo, luego el hijo derecho y
     * finalmente la raíz.
     */
    POSFIJO;
}
