/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_8;

/**
 *
 * @author henryubuntu
 */
// Demonstrate Console. 
import java.io.*;

class ConsoleDemo {

    public static void main(String args[]) {
        String str;
        Console con;

        // Obtain a reference to the console. 
        con = System.console();
        // If no console available, exit. 
        if (con == null) {
            return;
        }

        // Read a string and then display it. 
        str = con.readLine("Enter a string: ");
        con.printf("Here is your string: %s\n", str);
    }
}
