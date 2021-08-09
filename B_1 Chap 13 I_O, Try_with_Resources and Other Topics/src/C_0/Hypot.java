/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_0;

/**
 *
 * @author henryubuntu
 */
// Compute the hypotenuse of a right triangle. 
class Hypot {

    public static void main(String args[]) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        // Notice how sqrt() and pow() must be qualified by 
        // their class name, which is Math. 
        hypot = Math.sqrt(Math.pow(side1, 2)
                + Math.pow(side2, 2));

        System.out.println("Given sides of lengths "
                + side1 + " and " + side2
                + " the hypotenuse is "
                + hypot);
    }
}
