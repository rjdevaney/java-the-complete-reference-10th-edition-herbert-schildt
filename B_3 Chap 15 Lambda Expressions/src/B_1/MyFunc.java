/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_1;

/**
 *
 * @author henryubuntu
 */
// Use an instance method reference with different objects. 
// A functional interface that takes two reference arguments 
// and returns a boolean result. 
interface MyFunc<T> {

    boolean func(T v1, T v2);
}
