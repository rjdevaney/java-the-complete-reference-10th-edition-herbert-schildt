/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_3;

/**
 *
 * @author henryubuntu
 */
// Demonstrate isInfinite() and isNaN().
class InfNaN {

    public static void main(String args[]) {
        Double d1 = new Double(1 / 0.);
        Double d2 = new Double(0 / 0.);

        System.out.println(d1 + ": " + d1.isInfinite() + ", " + d1.isNaN());
        System.out.println(d2 + ": " + d2.isInfinite() + ", " + d2.isNaN());
    }
}
