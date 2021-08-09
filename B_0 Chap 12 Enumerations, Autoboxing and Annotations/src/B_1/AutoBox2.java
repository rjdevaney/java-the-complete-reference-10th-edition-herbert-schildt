/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_1;

/**
 *
 * @author henryubuntu
 */
// Autoboxing/unboxing takes place with 
// method parameters and return values. 
class AutoBox2 {
    // Take an Integer parameter and return 
    // an int value; 

    static int m(Integer v) {
        return v; // auto-unbox to int 
    }

    public static void main(String args[]) {
        // Pass an int to m() and assign the return value 
        // to an Integer.  Here, the argument 100 is autoboxed 
        // into an Integer.  The return value is also autoboxed 
        // into an Integer. 
        Integer iOb = m(100);

        System.out.println(iOb);
    }
}
