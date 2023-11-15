public class Main {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();
        
        arbol.insertar(20);
        arbol.insertar(15);
        arbol.insertar(25);
        arbol.insertar(10);
        arbol.insertar(18);
        arbol.insertar(5);
        arbol.insertar(19);
        arbol.insertar(17);
        arbol.insertar(1);

        arbol.mostrarArbolAVL();

        arbol.buscar(20);
        arbol.eliminar(15);
        arbol.mostrarArbolAVL();
    }
}
