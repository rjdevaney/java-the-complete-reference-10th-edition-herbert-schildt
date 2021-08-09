/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_5;

/**
 *
 * @author henryubuntu
 */
// Stats attempts (unsuccessfully) to  
// create a generic class that can compute 
// the average of an array of numbers of 
// any given type. 
// 
// The class contains an error! 
class Stats<T> {

    T[] nums; // nums is an array of type T 

    // Pass the constructor a reference to   
    // an array of type T. 
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases. 
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue(); // Error!!! 
        }
        return sum / nums.length;
    }
}
