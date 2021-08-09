/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_5;

/**
 *
 * @author henryubuntu
 */
// Demonstrate exception chaining.
class ChainExcDemo {

    static void demoproc() {
        // create an exception
        NullPointerException e
                = new NullPointerException("top layer");

        // add a cause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);

            // display cause exception
            System.out.println("Original cause: "
                    + e.getCause());
        }
    }
}
