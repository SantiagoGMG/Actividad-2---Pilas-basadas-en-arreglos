
package listasimple;

public class Main {
    
        public static void main(String[] args) {
//      a. Inserta en la lista los valores 5, 59, 91, -17, 73, 34, 40
//      b. Elimina los índices 2 y 3
//      c. Imprime solamente el índice 3
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
        
        lista.insertar(5);
        lista.insertar(59);
        lista.insertar(91);
        lista.insertar(-17);
        lista.insertar(73);
        lista.insertar(34);
        lista.insertar(40);
        
        lista.eliminar(2);
        lista.eliminar(3);
        
            System.out.println(lista.obtener(3));
         
    }
}
