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
// This program will not compile
class ScopeErr {

    public static void main(String args[]) {
        int bar = 1;
        {              // creates a new scope
            int bar = 2; // Compile time error -- bar already defined!
        }
    }
}
