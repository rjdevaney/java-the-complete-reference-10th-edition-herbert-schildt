/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_3;

/**
 *
 * @author henryubuntu
 */
// A simple pattern matching demo. 
import java.util.regex.*;

class RegExpr {

    public static void main(String args[]) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");

        found = mat.matches(); // check for a match 

        System.out.println("Testing Java against Java.");
        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match");
        }

        System.out.println();

        System.out.println("Testing Java against Java 8.");
        mat = pat.matcher("Java 8"); // create a new matcher 

        found = mat.matches(); // check for a match 

        if (found) {
            System.out.println("Matches");
        } else {
            System.out.println("No Match");
        }
    }
}
