/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_3;

/**
 *
 * @author henryubuntu
 */
// Demonstrate HashSet. 
import java.util.*;

class HashSetDemo {

    public static void main(String args[]) {
        // Create a hash set. 
        HashSet<String> hs = new HashSet<String>();

        // Add elements to the hash set. 
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
