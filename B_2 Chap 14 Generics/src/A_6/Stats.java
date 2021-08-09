/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_6;

/**
 *
 * @author henryubuntu
 */
// In this version of Stats, the type argument for 
// T must be either Number, or a class derived 
// from Number. 
class Stats<T extends Number> {

    T[] nums; // array of Number or subclass 

    // Pass the constructor a reference to   
    // an array of type Number or subclass. 
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases. 
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;
    }
}
