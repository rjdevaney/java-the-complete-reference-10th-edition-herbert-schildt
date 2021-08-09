/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_8;

/**
 *
 * @author henryubuntu
 */
class Wrong<T> {
    // Wrong, no static variables of type T. 

    static T ob;

    // Wrong, no static method can use T. 
    static T getob() {
        return ob;
    }
}
