/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_1;

/**
 *
 * @author henryubuntu
 */
// Demonstrate a field-width specifier. 
import java.util.*;

class FormatDemo4 {

    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        fmt.format("|%f|%n|%12f|%n|%012f|",
                10.12345, 10.12345, 10.12345);

        System.out.println(fmt);

        fmt.close();
    }
}
