/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_9;

/**
 *
 * @author henryubuntu
 */
// Demonstrate an inner class.
class Outer {

    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an innner class
    class Inner {

        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
