
package labwork_JavaProgramming;
import java.util.Scanner;

public class Lab3_2DArrayMultiply {
    
    public static void main(String... args){
        int row1, col1, row2, col2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of Matrix 1: ");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        int arr1[][]=new int[row1][col1];
        System.out.println("Enter the " + row1*col1 + " elements of the Martrix: ");
        
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the rows and columns of Matrix 2: ");
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter the " + row2*col2 + " elements of the Martrix: ");
        
        for(int i = 0; i < row2; i++){
            for(int j = 0; j < col2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("----------------------------------");
        if(col2 == row1){
            int arr3[][] = new int[row1][col2];
            
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                        int temp = 0;
                    for(int k = 0; k < row2; k++){
                        temp += arr1[i][k]*arr2[k][j]; 
                    }
                    arr3[i][j] = temp;
                    temp = 0;
                }
            }
            System.out.println("Product of matrices is given by: ");
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            } 
        }
        else{
            System.out.println("Matries are unsuitable for multiplication! Program exiting!");
        }
    }
}
