/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_5;

/**
 *
 * @author henryubuntu
 */
// Demonstrate left justification. 
import java.util.*;

class LeftJustify {

    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        // Right justify by default 
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();

        // Now, left justify. 
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
    }
}
