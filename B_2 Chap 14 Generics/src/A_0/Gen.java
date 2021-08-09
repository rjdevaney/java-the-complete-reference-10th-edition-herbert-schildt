/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_0;

/**
 *
 * @author henryubuntu
 */
// A simple generic class.  
// Here, T is a type parameter that 
// will be replaced by a real type 
// when an object of type Gen is created. 
class Gen<T> {

    T ob; // declare an object of type T 

    // Pass the constructor a reference to  
    // an object of type T. 
    Gen(T o) {
        ob = o;
    }

    // Return ob. 
    T getob() {
        return ob;
    }

    // Show type of T. 
    void showType() {
        System.out.println("Type of T is "
                + ob.getClass().getName());
    }
}
