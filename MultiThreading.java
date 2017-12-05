/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_JavaProgramming;

public class MultiThreading extends Thread{
    @Override
    public void run() {
       
        for (int i = 0; i < 10; i++) {
            System.out.println("Run : " + (i+1));
        }
    }
    public static void main(String[] args) {
        
        new MultiThreading().start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main : " + (i+1));
        }
    }
}
