/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_8;

/**
 *
 * @author henryubuntu
 */
// Use the ? quantifier. 
import java.util.regex.*;

class RegExpr6 {

    public static void main(String args[]) {
        // Use reluctant matching behavoir. 
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find()) {
            System.out.println("Match: " + mat.group());
        }
    }
}
