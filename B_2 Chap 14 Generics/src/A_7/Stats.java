/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_7;

/**
 *
 * @author henryubuntu
 */
// Use a wildcard.  
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

    // Determine if two averages are the same. 
    // Notice the use of the wildcard. 
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }

        return false;
    }
}
