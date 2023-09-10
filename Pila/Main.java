
public class Main 
{
    public static void main(String[] args) 
    {
        Pila pila = new Pila();
        pila.insertar(14);
        pila.insertar(27);
        pila.insertar(1);
        pila.insertar(15);
        pila.insertar(10);
        pila.insertar(90);
        pila.insertar(71);
        pila.insertar(37);
        pila.insertar(2);
        pila.insertar(48);
        
        System.out.println("tamanio de la pila: "+pila.getTamanio());
        
        System.out.println("Se quitaran 4 elementos de la pila");
        pila.quitar();
        pila.quitar();
        pila.quitar();
        pila.quitar();

        System.out.println("tamanio de la pila es: "+pila.getTamanio());

        System.out.println("La cima de la pila es: "+ pila.obtenerCima());

        System.out.println("Se vaciara la pila");
        pila.vaciar();

        System.out.println("La pila esta vacia ? "+ pila.estaVacia());

    }
}