package listadoble;

public class ListaDoblementeEnlazada {

    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int longitud;

    public ListaDoblementeEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.longitud = 0;
    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo; // Si la lista está vacía, el último nodo es el primero
        } else {
            
            nuevoNodo.setAnterior(ultimoNodo); // El nodo anterior al nuevo nodo es el último nodo ultimoNodo
            ultimoNodo.setSiguiente(nuevoNodo); // El siguiente del último nodo es el nuevo nodo 
            ultimoNodo = nuevoNodo; // El nuevo nodo se convierte en el último nodo
        }
        longitud++;
    }

    public int obtener(int indice) {
        if (indice < 0 || indice >= longitud) {
            System.err.println("Indice fuera de rango");
            return -1;
        }
        Nodo actuaNodo = primerNodo;

        if (indice == 0) {
            return primerNodo.getDato();
        } else if (indice == longitud - 1) {
            return ultimoNodo.getDato();
        }
        //si el indice es menor que la mitad de la longitud
        if (indice < longitud / 2) {
            actuaNodo=primerNodo;
            for (int i = 0; i < indice; i++) {
                actuaNodo = actuaNodo.getSiguiente();
            }
            //si el indice a buscar esta despues de la mitad   
        } else {
             actuaNodo=ultimoNodo;
            for (int i = longitud - 1; i > indice; i--) {
                actuaNodo = actuaNodo.getAnterior();
            }

        }

        return actuaNodo.getDato();
    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= longitud) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo nodoEliminar;
        if (indice == 0) {
            nodoEliminar = primerNodo;
            primerNodo = primerNodo.getSiguiente();
        } else if (indice == longitud - 1) {
            nodoEliminar = ultimoNodo;
            ultimoNodo = ultimoNodo.getAnterior();
            ultimoNodo.setSiguiente(null);
        } else {
            Nodo nodoActual;
            if (indice < longitud / 2) {
                
                nodoActual = primerNodo;
                for (int i = 0; i < indice; i++) {
                    
                    nodoActual = nodoActual.getSiguiente();
                }
            } else {
                nodoActual = ultimoNodo;
                for (int i = longitud - 1; i > indice; i--) 
                {
                    
                    nodoActual = nodoActual.getAnterior();
                }
            }
            nodoEliminar = nodoActual;
            nodoActual.getAnterior().setSiguiente(nodoActual.getSiguiente());
            nodoActual.getSiguiente().setAnterior(nodoActual.getAnterior());
        }
        
        nodoEliminar.setAnterior(null);
        nodoEliminar.setSiguiente(null);
        longitud--;
        
    }

    public int longitud() {
        return longitud;
    }
}
