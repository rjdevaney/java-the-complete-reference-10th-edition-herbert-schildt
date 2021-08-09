/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_2;

/**
 *
 * @author henryubuntu
 */
// Demonstrate a method reference to a generic method 
// declared inside a non-generic class. 
// A functional interface that operates on an array 
// and a value, and returns an int result. 
interface MyFunc<T> {

    int func(T[] vals, T v);
}
