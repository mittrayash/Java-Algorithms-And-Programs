/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_JavaProgramming;

import java.util.Arrays;
import java.util.Scanner;
public class Lab2_Bubble_Sort {
    private static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }}}}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter " + n + " elements: \n");
    for(int j = 0; j < n ; j++){
        int next = sc.nextInt();
        arr[j] = next;
    }
    bubbleSort(arr);
    System.out.print(Arrays.toString(arr));
}}
