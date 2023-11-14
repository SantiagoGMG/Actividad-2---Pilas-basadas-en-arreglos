public class Main<T> {
    public static void main(String[] args) {

        Arbol<String> arbol = new Arbol("A", false);
        //NodoArbol<String> nodo = new NodoArbol<String>("A");
        System.out.println("Arbol general");
        // NodoArbol<String> nodoA = new NodoArbol<String>("A");
        NodoArbol<String> nodoB = new NodoArbol<String>("B");
        NodoArbol<String> nodoC = new NodoArbol<String>("C");
        NodoArbol<String> nodoD = new NodoArbol<String>("D");
        NodoArbol<String> nodoE = new NodoArbol<String>("E");
        NodoArbol<String> nodoF = new NodoArbol<String>("F");
        NodoArbol<String> nodoG = new NodoArbol<String>("G");
        NodoArbol<String> nodoH = new NodoArbol<String>("H");
        NodoArbol<String> nodoI = new NodoArbol<String>("I");
        NodoArbol<String> nodoJ = new NodoArbol<String>("J");
        NodoArbol<String> nodoK = new NodoArbol<String>("K");
        NodoArbol<String> nodoL = new NodoArbol<String>("L");
        NodoArbol<String> nodoM = new NodoArbol<String>("M");
        NodoArbol<String> nodoN = new NodoArbol<String>("N");
        NodoArbol<String> nodoO = new NodoArbol<String>("O");
        NodoArbol<String> nodoP = new NodoArbol<String>("P");
        NodoArbol<String> nodoQ = new NodoArbol<String>("Q");

        //Hijos de A
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoB);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoC);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoD);
        //Hijos de B
        arbol.agregarNodoArbol(nodoB, nodoE);
        arbol.agregarNodoArbol(nodoB, nodoF);
        //Hijos de F
        arbol.agregarNodoArbol(nodoF, nodoJ);
        arbol.agregarNodoArbol(nodoF, nodoK);
        arbol.agregarNodoArbol(nodoF, nodoL);
        //Hijos de D
        arbol.agregarNodoArbol(nodoD, nodoG);
        arbol.agregarNodoArbol(nodoD, nodoH);
        arbol.agregarNodoArbol(nodoD, nodoI);
        //Hijos de G
        arbol.agregarNodoArbol(nodoG, nodoM);
        //Hijos de M
        arbol.agregarNodoArbol(nodoM, nodoP);
        arbol.agregarNodoArbol(nodoM, nodoQ);
        //Hijos de I
        arbol.agregarNodoArbol(nodoI, nodoN);
        arbol.agregarNodoArbol(nodoI, nodoO);

        arbol.imprimirArbol(Recorrido.PREFIJO);

        arbol.imprimirArbol(Recorrido.INFIJO);

        arbol.imprimirArbol(Recorrido.POSFIJO);
        

        System.out.println("");
        System.out.println("Arbol binario");

        Arbol<String> arbolBinario = new Arbol("A", true);
        
        NodoArbol<String> nodoB2 = new NodoArbol<String>("B");
        NodoArbol<String> nodoC2 = new NodoArbol<String>("C");
        NodoArbol<String> nodoD2 = new NodoArbol<String>("D");
        NodoArbol<String> nodoE2 = new NodoArbol<String>("E");
        NodoArbol<String> nodoF2 = new NodoArbol<String>("F");
        NodoArbol<String> nodoG2 = new NodoArbol<String>("G");
        NodoArbol<String> nodoH2 = new NodoArbol<String>("H");
        NodoArbol<String> nodoI2 = new NodoArbol<String>("I");
        NodoArbol<String> nodoJ2 = new NodoArbol<String>("J");
        NodoArbol<String> nodoK2= new NodoArbol<String>("K");
        NodoArbol<String> nodoL2= new NodoArbol<String>("L");
        NodoArbol<String> nodoM2 = new NodoArbol<String>("M");
        NodoArbol<String> nodoN2 = new NodoArbol<String>("N");
        NodoArbol<String> nodoO2= new NodoArbol<String>("O");
        NodoArbol<String> nodoP2 = new NodoArbol<String>("P");
        NodoArbol<String> nodoQ2 = new NodoArbol<String>("Q");

         //Hijos de A
        arbolBinario.agregarNodoArbol(arbolBinario.obtenerRaiz(), nodoB2);
        //Hijos de B
        arbolBinario.agregarNodoArbol(nodoB2, nodoE2);
        arbolBinario.agregarNodoArbol(nodoB2, nodoC2);
        //Hijo de E
        arbolBinario.agregarNodoArbol(nodoE2, nodoF2);
        //Hijo de F
        arbolBinario.agregarNodoArbol(nodoF2, nodoJ2);
        //Hijo de J
        arbolBinario.agregarNodoArbol(nodoJ2, nodoK2);
        //hijo de K
        arbolBinario.agregarNodoArbol(nodoK2, nodoL2);

        //Hijo de C
        arbolBinario.agregarNodoArbol(nodoC2, nodoD2);
        //Hijo de D
        arbolBinario.agregarNodoArbol(nodoD2, nodoG2);
        //Hijos de G
        arbolBinario.agregarNodoArbol(nodoG2, nodoM2);
        arbolBinario.agregarNodoArbol(nodoG2, nodoH2);
        //hijo de M
        arbolBinario.agregarNodoArbol(nodoM2, nodoP2);
        //Hijo de P
        arbolBinario.agregarNodoArbol(nodoP2, nodoQ2);
        
        //Hijo de H
        arbolBinario.agregarNodoArbol(nodoH2, nodoI2);
        //Hijo de I
        arbolBinario.agregarNodoArbol(nodoI2, nodoN2);
        //Hijo de N
        arbolBinario.agregarNodoArbol(nodoN2, nodoO2);

       arbolBinario.imprimirArbol(Recorrido.PREFIJO);
       arbolBinario.imprimirArbol(Recorrido.INFIJO);
       arbolBinario.imprimirArbol(Recorrido.POSFIJO);

    System.out.println("\n"+ "El arbol esta vacio: " + arbolBinario.estaVacio());
    System.out.println("La altura del arbol es: " + arbolBinario.obtenerAltura());
    System.out.println("SubArbol:");
    arbolBinario.imprimirSubArbol(nodoG2);

    }
}
