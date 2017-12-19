package labwork_ada;
import java.util.*;
public class Lab2_QuickSortTime {
    public static void quickSort(int arr[], int start, int end){
        if(start <= end){
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }}
        public static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int pIndex = start;
        for(int i = start; i < end ; i++){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
            int temp = arr[end];
                arr[end] = arr[pIndex];
                arr[pIndex] = temp;
        
        
        return pIndex;
    }
    public static void main(String... args){
        int arr[] = {7,2,1,6,8,5,3,4};
        int start = 0;
        int end = 7;
        
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");
        
        long nanoTime1 = System.nanoTime();
        quickSort(arr, start, end);
        
        long nanoTime2 = System.nanoTime() - nanoTime1;
        double seconds = (double)nanoTime2 / 1000000000.0;
        System.out.println("Time taken: " + seconds);
        System.out.println(Arrays.toString(arr));
        
    }
}
