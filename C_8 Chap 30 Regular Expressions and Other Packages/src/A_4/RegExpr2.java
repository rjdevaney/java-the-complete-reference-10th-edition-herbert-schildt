/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_4;

/**
 *
 * @author henryubuntu
 */
// Use find() to find a subsequence. 
import java.util.regex.*;

class RegExpr2 {

    public static void main(String args[]) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 8");

        System.out.println("Looking for Java in Java 8.");

        if (mat.find()) {
            System.out.println("subsequence found");
        } else {
            System.out.println("No Match");
        }
    }
}
