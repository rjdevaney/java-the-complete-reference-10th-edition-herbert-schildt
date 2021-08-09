/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_8;

/**
 *
 * @author henryubuntu
 */
// Demonstrate equals() and equalsIgnoreCase().
class equalsDemo {

    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        System.out.println(s1 + " equals " + s2 + " -> "
                + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " -> "
                + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " -> "
                + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> "
                + s1.equalsIgnoreCase(s4));
    }
}
