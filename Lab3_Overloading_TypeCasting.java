/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_JavaProgramming;

public class Lab3_Overloading_TypeCasting {
    
    Lab3_Overloading_TypeCasting(int a, long b){
        System.out.println("This is method 1!");
    }
    
    Lab3_Overloading_TypeCasting(String a, long b){
        System.out.println("This is method 2!");
    }
    
    
    public static void main(String[] args) {
        Lab3_Overloading_TypeCasting obj = new Lab3_Overloading_TypeCasting(23, 45);
        Lab3_Overloading_TypeCasting obj2 = new Lab3_Overloading_TypeCasting("Hello", 45);
    }
}
