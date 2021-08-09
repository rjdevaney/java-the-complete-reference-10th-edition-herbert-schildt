/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_2;

/**
 *
 * @author henryubuntu
 */
// Use thenComparing() to sort by last, then first name.  
import java.util.*;

// A comparator that compares last names.  
class CompLastNames implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        int i, j;

        // Find index of beginning of last name. 
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
