/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_8;

/**
 *
 * @author henryubuntu
 */
// Loops may be nested.
class Nested {

    public static void main(String args[]) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
