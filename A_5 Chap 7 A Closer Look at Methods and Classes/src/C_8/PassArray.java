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
// Use an array to pass a variable number of 
// arguments to a method. 
class PassArray {

    static void vaTest(int v[]) {
        System.out.print("Number of args: " + v.length
                + " Contents: ");

        for (int x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {
        // Notice how an array must be created to 
        // hold the arguments. 
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};

        vaTest(n1); // 1 arg 
        vaTest(n2); // 3 args 
        vaTest(n3); // no args 
    }
}
