/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_2;
import java.util.*;

/**
 *
 * @author henryubuntu
 */
// Sort by entire name when last names are equal.
class CompThenByFirstName implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}
