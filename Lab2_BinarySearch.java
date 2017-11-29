package labwork_JavaProgramming;

import java.util.Arrays;
import java.util.Scanner;
public class Lab2_BinarySearch {
    private static int BinarySearch(int arr[], int x){
        int end = arr.length - 1;
        int start = 0;   
        while(start <= end){
            int mid = (start + end) / 2;
            
            if (arr[mid] == x)
                return mid;
            else if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }}
        return -1;
    }
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
        int ans = BinarySearch(arr, elem);
        
        System.out.println("Ans = " + ans);
    }}
