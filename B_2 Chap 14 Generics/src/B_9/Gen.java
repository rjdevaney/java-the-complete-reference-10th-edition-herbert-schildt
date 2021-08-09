/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_9;

/**
 *
 * @author henryubuntu
 */
// A generic subclass. 
class Gen<T> extends NonGen {

    T ob; // declare an object of type T  

    // Pass the constructor a reference to   
    // an object of type T.  
    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    // Return ob.  
    T getob() {
        return ob;
    }
}
