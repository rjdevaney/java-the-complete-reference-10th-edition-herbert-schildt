/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_6;

/**
 *
 * @author henryubuntu
 */
// A simple generic class. 
class MyClass<T> {

    private T val;

    // A constructor that takes an argument. 
    MyClass(T v) {
        val = v;
    }

    // The default constructor. This constructor 
    // is NOT used by this program. 
    MyClass() {
        val = null;
    }
    // ... 

    T getVal() {
        return val;
    };
}
