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
// Use static import to bring sqrt() and pow() into view. 
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// Compute the hypotenuse of a right triangle. 
class Hypot {

    public static void main(String args[]) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        // Here, sqrt() and pow() can be called by themselves, 
        // without their class name. 
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("Given sides of lengths "
                + side1 + " and " + side2
                + " the hypotenuse is "
                + hypot);
    }
}
