/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_6;

/**
 *
 * @author henryubuntu
 */
// An improved version of the "Descision Maker" 
// program from Chapter 9. This version uses an 
// enum, rather than interface variables, to  
// represent the answers. 
import java.util.Random;

// An enumeration of the possible answers. 
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {

    Random rand = new Random();

    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15) {
            return Answers.MAYBE; // 15% 
        } else if (prob < 30) {
            return Answers.NO;    // 15% 
        } else if (prob < 60) {
            return Answers.YES;   // 30% 
        } else if (prob < 75) {
            return Answers.LATER; // 15% 
        } else if (prob < 98) {
            return Answers.SOON;  // 13% 
        } else {
            return Answers.NEVER; // 2% 
        }
    }
}
