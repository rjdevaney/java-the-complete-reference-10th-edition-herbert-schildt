/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_2;

/**
 *
 * @author henryubuntu
 */
// Demonstrate toDegrees() and toRadians().
class Angles {

    public static void main(String args[]) {
        double theta = 120.0;

        System.out.println(theta + " degrees is "
                + Math.toRadians(theta) + " radians.");

        theta = 1.312;
        System.out.println(theta + " radians is "
                + Math.toDegrees(theta) + " degrees.");
    }
}
