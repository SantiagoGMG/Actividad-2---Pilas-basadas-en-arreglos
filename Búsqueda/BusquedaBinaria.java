import java.util.Arrays;
//import java.util.Random;
import java.util.Scanner;
public class BusquedaBinaria
{
    public static void main (String Ags[])
    {
        int[] arrToQuickSort = new int[1000];
        creacionArr(arrToQuickSort);
        System.out.println("Array ordenado con QuickSort:");
        System.out.println("Antes: " + Arrays.toString(arrToQuickSort));
        int[] arrQuickSort = quickSort(arrToQuickSort);
        System.out.println("ahora "+ Arrays.toString(arrQuickSort));
        System.out.println();
        int buscar;
        System.out.println("Introduce tu numero a buscar");
        Scanner leer = new Scanner(System.in);
        buscar = leer.nextInt();
        System.out.println(busquedaBinaria2(arrToQuickSort,buscar));

    }

    public static void creacionArr(int arrToQuickSort[])
    {

       for(int i=0; i < 1000; i++)
       {
            int generar = (int)(Math.random()*1000);
            arrToQuickSort[i]= generar;
       } 
       
    }

    public static int [] quickSort(int arr[])
    {   
        quickSort(arr,0, arr.length-1);
        return arr;
    }

     private static int [] quickSort(int arr[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = arr[central];
        i = primero;
        j = ultimo;

        do {
            while (arr[i] < pivote)
                i++;
            while (arr[j] > pivote)
                j--;
            if (i <= j) {
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;

                i++;
                j--;
            }
            //System.out.println("-" + Arrays.toString(arr));
        } while (i <= j);

        if (primero < j)
            quickSort(arr, primero, j);

        if (i < ultimo)
            quickSort(arr, i, ultimo);
        return arr;
    }

    public static int busquedaBinaria2 (int arrToQuickSort[], int buscar)
    {
        int inicio = 0;
        int fin = arrToQuickSort.length-1;
        int centro = ((inicio + fin )/2) +1 ;
        boolean termino = false;

        while (termino==false)
        {
            if(inicio==fin)
            {
                if(arrToQuickSort[fin]==buscar)
                {
                    System.out.println("tu numero esta en la poscion: " + fin );
                    termino = true;
                    break;
                }else
                {
                    System.out.println("Tu numero no fue encontrado");
                    termino = true;
                    break;   
                }
    
            }
            if (arrToQuickSort[centro]==buscar)
            {
                System.out.println("tu numero esta en la poscion: " + centro );
                termino = true;
                
            }
            if (centro < buscar) 
            {
                inicio = centro + 1;
                centro = ((inicio + fin)/2) +1;
                
            }
            if(centro > buscar)
            {
                fin = centro - 1;
                centro = ((inicio + fin)/2) +1;
                
            }

        }
        System.out.println("fin del programa");
        return  -1;
    }
}


