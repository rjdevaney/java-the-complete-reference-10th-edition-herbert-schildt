/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_0;

/**
 *
 * @author henryubuntu
 */
// Demonstrate the %n and %% format specifiers. 
import java.util.*;

class FormatDemo3 {

    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        fmt.format("Copying file%nTransfer is %d%% complete", 88);
        System.out.println(fmt);
        fmt.close();
    }
}
