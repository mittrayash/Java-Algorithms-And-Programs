/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

interface X{
    int i = 4;
}

interface Y{
    int i = 8;
}


public class InterfaceTest implements X, Y {
    
    public static void main(String[] args) {
        System.out.println("i is " + X.i);
    }
}
