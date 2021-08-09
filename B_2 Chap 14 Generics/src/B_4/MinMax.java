/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_4;

import B_3.*;

/**
 *
 * @author henryubuntu
 */
// A generic interface example. 
// A Min/Max interface. 
interface MinMax<T extends Comparable<T>> {

    T min();

    T max();
}
