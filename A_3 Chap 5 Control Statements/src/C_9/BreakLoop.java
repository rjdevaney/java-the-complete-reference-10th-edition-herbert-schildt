/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_9;

/**
 *
 * @author henryubuntu
 */
// Using break to exit a loop. 
class BreakLoop {

    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break; // terminate loop if i is 10
            }
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}
