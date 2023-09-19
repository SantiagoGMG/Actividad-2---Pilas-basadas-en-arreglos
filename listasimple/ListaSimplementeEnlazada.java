package listasimple;

public class ListaSimplementeEnlazada {

    private Nodo primerNodo;
    private int longitud;
    private int indice;

    public ListaSimplementeEnlazada() {
        primerNodo = null;
        longitud = 0;
        indice = 0;
    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo nodoActual = primerNodo;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
        longitud++;
    }

    public int obtener(int indice) {
        if (indice < 0 || indice >= longitud) {
            System.err.println("Indice fuera de rango");
            return -1;
        }

        Nodo actuaNodo = primerNodo;

        for (int i = 0; i < indice; i++) {
            actuaNodo = actuaNodo.getSiguiente();
        }
        return actuaNodo.getDato();
    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= longitud) {
            System.err.println("Indice fuera de rango");
            return;
        }
        if (indice == 0) {
            // Si el índice es 0, el nodo a eliminar es el primer nodo.
            primerNodo = primerNodo.getSiguiente();
        } else {
            // Si el índice no es 0, encontramos el nodo anterior al nodo a eliminar.
            Nodo nodoAnterior = primerNodo;
            for (int i = 0; i < indice - 1; i++) {
                nodoAnterior = nodoAnterior.getSiguiente();
            }
            // Ahora, el nodo anterior apuntará al siguiente nodo del nodo a eliminar.
            Nodo nodoEliminar = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nodoEliminar.getSiguiente());
        }
        longitud--;
    }

    public int getLongitud() {
        return longitud;
    }

}
