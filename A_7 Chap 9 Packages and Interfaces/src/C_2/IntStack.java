/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_2;

/**
 *
 * @author henryubuntu
 */
interface IntStack {

    void push(int item); // store an item 

    int pop(); // retrieve an item 

    // Because clear( ) has a default, it need not be 
    // implemented by a preexisting class that uses IntStack. 
    default void clear() {
        System.out.println("clear() not implemented.");
    }
}
