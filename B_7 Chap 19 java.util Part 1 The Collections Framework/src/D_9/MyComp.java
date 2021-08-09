/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_9;

/**
 *
 * @author henryubuntu
 */
// Use a custom comparator.  
import java.util.*;

// A reverse comparator for strings.  
class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }

    // No need to override equals or the default methods.  
}
