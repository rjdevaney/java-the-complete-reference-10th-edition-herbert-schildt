/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_7;

/**
 *
 * @author henryubuntu
 */
// A poor way to use assert!!! 
class AssertDemo {
    // get a random number generator 

    static int val = 3;

    // Return an integer. 
    static int getnum() {
        return val--;
    }

    public static void main(String args[]) {
        int n = 0;

        for (int i = 0; i < 10; i++) {

            assert (n = getnum()) > 0; // This is not a good idea! 

            System.out.println("n is " + n);
        }
    }
}
