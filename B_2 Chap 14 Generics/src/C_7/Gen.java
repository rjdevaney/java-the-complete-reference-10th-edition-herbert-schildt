/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_7;

/**
 *
 * @author henryubuntu
 */
// Can't create an instance of T. 
class Gen<T> {

    T ob;

    Gen() {
        ob = new T(); // Illegal!!! 
    }
}
