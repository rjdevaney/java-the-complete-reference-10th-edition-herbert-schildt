/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_4;

/**
 *
 * @author henryubuntu
 */
// Demonstrate a situation that requires a bridge method. 
class BridgeDemo {

    public static void main(String args[]) {

        // Create a Gen2 object for Strings. 
        Gen2 strOb2 = new Gen2("Generics Test");

        System.out.println(strOb2.getob());
    }
}
