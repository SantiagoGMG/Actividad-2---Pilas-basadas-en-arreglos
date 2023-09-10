public class Pila {
    private Nodo cima;
    private int tamanio;
    
    public Pila()
    {
        
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    

    public void insertar(int dato)
    {
        tamanio++;
        Nodo nodoCreado = new Nodo(dato);
        nodoCreado.setNodo(cima);
        cima=nodoCreado;

    }

    public void desplegarPila () 
    {
        Nodo actual = cima;
        if (actual != null)
        {
            while (actual != null)
            {
                System.out.println(" " + actual.getDato()); 
                actual = actual.getNodo(); 
            }
        }
        else
        {
            System.out.println("La pila está vacía");
        }
    }

    public void quitar()
    {
       
       if(cima !=null)
       {
        cima=cima.getNodo();
        tamanio--;
       }
    }

    public int obtenerCima()
    {
        return cima.getDato();
    }

    public void vaciar()
    {
        for(int i=0; i<10; i++)
        {
            quitar();
            if(cima==null)
            {
                break;
            }
        }
    }

    public boolean estaVacia()
    {
        if(cima==null)
        {
            return true;
        }else
        {
            return false;
        }

    }
}