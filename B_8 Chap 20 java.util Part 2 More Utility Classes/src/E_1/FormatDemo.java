/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_1;

/**
 *
 * @author henryubuntu
 */
// Use automatic resource management with Formatter.
import java.util.*;

class FormatDemo {

    public static void main(String args[]) {

        try (Formatter fmt = new Formatter()) {
            fmt.format("Formatting %s is easy %d %f", "with Java", 10, 98.6);
            System.out.println(fmt);
        }
    }
}
