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
class MyClass<T> {

    private T val;

    // A constructor that takes an argument. 
    MyClass(T v) {
        val = v;
    }

    // This is the default constructor. 
    MyClass() {
        val = null;
    }

    // ... 
    T getVal() {
        return val;
    };
}
