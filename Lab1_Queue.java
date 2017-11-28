/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_JavaProgramming;

import java.util.LinkedList;
import java.util.Queue;
public class Lab1_Queue {
    
    public static void main(String[] args) {
        Queue q = new LinkedList();
        
        q.add(2);
        q.add(3);
        q.add(5);
        
        System.out.println(q);
        System.out.println("On peeking through queue: " + q.peek());        
        System.out.println("On removing: " + q.remove());
    }
}
