import java.util.Arrays;

public class BubbleSort
{
   /* public static void main (String args[]){
        int[] arr={13,15,10,23,16};
        ordenar(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }*/

    public static int[] bubbleSort(int arr[])
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int aux = arr[i];
                    arr[i]=arr[j];
                    arr[j]=aux;
                }
                System.out.println("-" + Arrays.toString(arr));
            }

        }
        return arr;
     
    }
}