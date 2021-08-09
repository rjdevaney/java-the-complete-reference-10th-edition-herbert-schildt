/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_1;

/**
 *
 * @author henryubuntu
 */
// A's j is not accessible here.
class B extends A {

    int total;

    void sum() {
        total = i + j; // ERROR, j is not accessible here
    }
}
