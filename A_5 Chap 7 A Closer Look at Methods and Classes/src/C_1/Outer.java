/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_1;

/**
 *
 * @author henryubuntu
 */
// Define an inner class within a for loop.
class Outer {

    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {

                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
