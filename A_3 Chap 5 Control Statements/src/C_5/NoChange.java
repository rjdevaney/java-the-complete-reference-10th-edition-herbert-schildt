/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_5;

/**
 *
 * @author henryubuntu
 */
// The for-each loop is essentially read-only. 
class NoChange {

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // no effect on nums 
        }

        System.out.println();

        for (int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
