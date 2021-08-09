/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_2;

/**
 *
 * @author henryubuntu
 */
// Overriding a generic method in a generic class. 
class Gen<T> {

    T ob; // declare an object of type T  

    // Pass the constructor a reference to   
    // an object of type T.  
    Gen(T o) {
        ob = o;
    }

    // Return ob.  
    T getob() {
        System.out.print("Gen's getob(): ");
        return ob;
    }
}
