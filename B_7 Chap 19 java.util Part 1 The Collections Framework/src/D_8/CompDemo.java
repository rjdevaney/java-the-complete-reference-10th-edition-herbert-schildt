/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_8;
import java.util.*;  

/**
 *
 * @author henryubuntu
 */
class CompDemo {

    public static void main(String args[]) {
        // Create a tree set. 
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

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
