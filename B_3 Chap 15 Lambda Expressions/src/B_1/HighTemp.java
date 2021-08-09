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
// A class that stores the temperature high for a day. 
class HighTemp {

    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    // Return true if the invoking HighTemp object has the same 
    // temperature as ht2. 
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // Return true if the invoking HighTemp object has a temperature 
    // that is less than ht2. 
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
