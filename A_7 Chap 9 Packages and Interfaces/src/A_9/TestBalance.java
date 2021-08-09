/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_9;

import A_8_mypack.*;
/**
 *
 * @author henryubuntu
 */
class TestBalance {

    public static void main(String args[]) {

        /* Because Balance is public, you may use Balance 
       class and call its constructor. */
        Balance test = new Balance("J. J. Jaspers", 99.88);

        test.show(); // you may also call show()
    }
}
