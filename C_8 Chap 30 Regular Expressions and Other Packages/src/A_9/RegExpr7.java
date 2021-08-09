/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_9;

/**
 *
 * @author henryubuntu
 */
// Use a character class. 
import java.util.regex.*;

class RegExpr7 {

    public static void main(String args[]) {
        // Match lowercase words. 
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while (mat.find()) {
            System.out.println("Match: " + mat.group());
        }
    }
}
