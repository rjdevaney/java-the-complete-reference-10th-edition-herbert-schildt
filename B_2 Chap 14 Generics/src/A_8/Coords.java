/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_8;

/**
 *
 * @author henryubuntu
 */
// This class holds an array of coordinate objects. 
class Coords<T extends TwoD> {

    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}
