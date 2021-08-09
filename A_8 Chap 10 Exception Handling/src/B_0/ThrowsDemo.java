/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_0;

/**
 *
 * @author henryubuntu
 */
// This program contains an error and will not compile.
class ThrowsDemo {

    static void throwOne() {
        System.out.println("Inside throwOne.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        throwOne();
    }
}
