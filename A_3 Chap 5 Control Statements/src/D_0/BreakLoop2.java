/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_0;

/**
 *
 * @author henryubuntu
 */
// Using break to exit a while loop. 
class BreakLoop2 {

    public static void main(String args[]) {
        int i = 0;

        while (i < 100) {
            if (i == 10) {
                break; // terminate loop if i is 10
            }
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete.");
    }
}
