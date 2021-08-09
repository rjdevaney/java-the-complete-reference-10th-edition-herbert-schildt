/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_0;

/**
 *
 * @author henryubuntu
 */
// Use arguments indexes to simplify the 
// creation of a custom time and date format. 
import java.util.*;

class FormatDemo6 {

    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
