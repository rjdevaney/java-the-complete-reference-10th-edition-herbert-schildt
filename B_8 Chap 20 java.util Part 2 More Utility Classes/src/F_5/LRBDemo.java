/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_5;

/**
 *
 * @author henryubuntu
 */
// Demonstrate a resource bundle.
import java.util.*;

class LRBDemo {

    public static void main(String args[]) {
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB");

        System.out.println("English version: ");
        System.out.println("String for Title key : "
                + rd.getString("title"));

        System.out.println("String for StopText key: "
                + rd.getString("StopText"));

        System.out.println("String for StartText key: "
                + rd.getString("StartText"));

        rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        System.out.println("\nGerman version: ");
        System.out.println("String for Title key : "
                + rd.getString("title"));

        System.out.println("String for StopText key: "
                + rd.getString("StopText"));

        System.out.println("String for StartText key: "
                + rd.getString("StartText"));
    }
}
