/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_9;
import java.util.*;  

/**
 *
 * @author henryubuntu
 */
class CompDemo {

    public static void main(String args[]) {
        
        MyComp mc = new MyComp(); // Create a comparator
        
        // Pass a reverse order version of  MyComp to TreeSet.
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());

        // Add elements to the tree set. 
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Display the elements. 
        for (String element : ts) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}
