import java.util.Arrays;
import java.util.Scanner;
public class BusquedaBinaria
{
    public static void main (String Ags[])
    {
        int[] arrToQuickSort = new int[1000];
        creacionArr(arrToQuickSort);
        System.out.println("Array ordenado con QuickSort:");
        int[] arrQuickSort = quickSort(arrToQuickSort);
        System.out.println(Arrays.toString(arrQuickSort));
        System.out.println();
        int buscar;
        System.out.println("Introduce tu numero a buscar");
        Scanner leer = new Scanner(System.in);
        buscar = leer.nextInt();
        System.out.println(busquedaBinaria(arrToQuickSort,buscar));

    }

    public static void creacionArr(int arrToQuickSort[]) {
        for (int i = 0; i < 1000; i++) {
            int generar;
            boolean repetido;
    
            do {
                generar = (int) (Math.random() * 10000);
                repetido = false;
    
                // Verificar si el valor ya existe en el array
                for (int j = 0; j < i; j++) {
                    if (arrToQuickSort[j] == generar) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
    
            arrToQuickSort[i] = generar;
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
        } while (i <= j);

        if (primero < j)
            quickSort(arr, primero, j);

        if (i < ultimo)
            quickSort(arr, i, ultimo);
        return arr;
    }

    public static int busquedaBinaria (int arrToQuickSort[], int buscar)
    {
        int inicio = 0;
        int fin = arrToQuickSort.length-1;
        boolean termino = false;

        while (!termino) {
            int centro = (inicio + fin) / 2;
    
            if (arrToQuickSort[centro] == buscar) {
                System.out.println("Tu número está en la posición: " + centro);
                termino = true;
            } else if (inicio == fin) {
                System.out.println("Tu número no fue encontrado");
                termino = true;
            } else if (arrToQuickSort[centro] < buscar) {
                inicio = centro + 1;
            } else {
                fin = centro - 1;
            }
        }
        System.out.println("fin del programa");
        return  -1;
    }
}


