/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_6;

/**
 *
 * @author henryubuntu
 */
class B extends A {

    void meth() { // ERROR! Can't override.
        System.out.println("Illegal!");
    }
}
