/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_0;

/**
 *
 * @author henryubuntu
 */
// Use the instanceof operator with a generic class hierarchy.  
class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    // Return ob.   
    T getob() {
        return ob;
    }
}
