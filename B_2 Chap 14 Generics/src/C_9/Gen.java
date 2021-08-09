/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_9;

/**
 *
 * @author henryubuntu
 */
// Generics and arrays. 
class Gen<T extends Number> {

    T ob;

    T vals[]; // OK 

    Gen(T o, T[] nums) {
        ob = o;

        // This statement is illegal. 
        // vals = new T[10]; // can't create an array of T 
        // But, this statement is OK. 
        vals = nums; // OK to assign reference to existent array 
    }
}
