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
// This class defines a method called countMatching() that 
// returns the number of items in an array that are equal  
// to a specified value. Notice that countMatching() 
// is generic, but MyArrayOps is not. 
class MyArrayOps {

    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) {
                count++;
            }
        }

        return count;
    }
}
