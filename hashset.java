/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;
import java.util.*;
/**
 *
 * @author mittr
 */
public class hashset {
    
    public static void main(String... args){
        
        String items[]  = {"apples", "tuna", "bacon", "tuna", "kids"};
       
        List<String> list = Arrays.asList(items);
        System.out.printf("%s \n", list);
        
        
        Set<String> hash = new HashSet<>(list);
        System.out.printf("%s \n", hash);
        
    }
    
    
}
