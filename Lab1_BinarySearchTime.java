package labwork_ada;

import java.util.Arrays;
import java.util.Scanner;
public class Lab1_BinarySearchTime {
    
    public static void main(String... args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements: \n");
        for(int j = 0; j < n ; j++){
            int next = sc.nextInt();
            arr[j] = next;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");
        System.out.println("Enter the element to be searched: ");
        int elem = sc.nextInt();
        
        long nanoTime1 = System.nanoTime();
        int ans = Arrays.binarySearch(arr, elem);
        long nanoTime2 = System.nanoTime() - nanoTime1;
        double seconds = (double)nanoTime2 / 1000000000.0;
        System.out.println("Time taken: " + seconds);
        System.out.println("Ans = " + ans);
    }}
