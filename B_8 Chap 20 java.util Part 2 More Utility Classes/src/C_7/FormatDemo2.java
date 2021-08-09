/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_7;

/**
 *
 * @author henryubuntu
 */
// Demonstrate the %f and %e format specifiers. 
import java.util.*;

class FormatDemo2 {

    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        for (double i = 1.23; i < 1.0e+6; i *= 100) {
            fmt.format("%f %e", i, i);
            System.out.println(fmt);
        }
        fmt.close();
    }
}
