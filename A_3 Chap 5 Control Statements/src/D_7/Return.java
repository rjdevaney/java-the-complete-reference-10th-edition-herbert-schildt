/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_7;

/**
 *
 * @author henryubuntu
 */
// Demonstrate return.
class Return {

    public static void main(String args[]) {
        boolean t = true;

        System.out.println("Before the return.");

        if (t) {
            return; // return to caller
        }
        System.out.println("This won't execute.");
    }
}
