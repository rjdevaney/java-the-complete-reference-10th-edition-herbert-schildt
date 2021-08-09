/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_0;

/**
 *
 * @author henryubuntu
 */
// Demonstrate a autoboxing/unboxing. 
class AutoBox {

    public static void main(String args[]) {

        Integer iOb = 100; // autobox an int 

        int i = iOb; // auto-unbox 

        System.out.println(i + " " + iOb);  // displays 100 100 
    }
}
