/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork_JavaProgramming;

import java.util.Stack;

public class Lab1_Stack {
    
    public static void main(String... args){
        Stack st = new Stack();
        // PUSH
        st.push(1);
        st.push(2);
        st.push(34);
        st.push(424);
        System.out.println("stack: " + st); 
        // PEEK
        System.out.println("Peek : " + st.peek());
        //POP
        st.pop();
        System.out.println("stack: " + st); 
        //search
        System.out.println("Position of 34 in stack : " + st.search(34));
        System.out.println("If element not found, search returns: " + st.search(324));
    }
}