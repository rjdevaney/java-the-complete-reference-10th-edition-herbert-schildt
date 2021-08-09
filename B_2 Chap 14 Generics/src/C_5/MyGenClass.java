/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_5;

/**
 *
 * @author henryubuntu
 */
// Ambiguity caused by erasure on  
// overloaded methods. 
class MyGenClass<T, V> {

    T ob1;
    V ob2;

    // ... 
    // These two overloaded methods are ambiguous 
    // and will not compile. 
    void set(T o) {
        ob1 = o;
    }

    void set(V o) {
        ob2 = o;
    }
}
