/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_1;

/**
 *
 * @author henryubuntu
 */
// Use split(). 
import java.util.regex.*;

class RegExpr9 {

    public static void main(String args[]) {

        // Match lowercase words. 
        Pattern pat = Pattern.compile("[ ,.!]");

        String strs[] = pat.split("one two,alpha9 12!done.");

        for (int i = 0; i < strs.length; i++) {
            System.out.println("Next token: " + strs[i]);
        }

    }
}
