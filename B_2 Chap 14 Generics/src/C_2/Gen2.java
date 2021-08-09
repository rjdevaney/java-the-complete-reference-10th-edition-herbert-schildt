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
// A subclass of Gen that overrides getob(). 
class Gen2<T> extends Gen<T> {

    Gen2(T o) {
        super(o);
    }

    // Override getob(). 
    T getob() {
        System.out.print("Gen2's getob(): ");
        return ob;
    }
}
