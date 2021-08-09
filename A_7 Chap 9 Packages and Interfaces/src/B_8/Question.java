/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_8;

/**
 *
 * @author henryubuntu
 */
import java.util.Random;

class Question implements SharedConstants {

    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return NO;           // 30%
        } else if (prob < 60) {
            return YES;          // 30%
        } else if (prob < 75) {
            return LATER;        // 15%
        } else if (prob < 98) {
            return SOON;         // 13%
        } else {
            return NEVER;        // 2%
        }
    }
}
