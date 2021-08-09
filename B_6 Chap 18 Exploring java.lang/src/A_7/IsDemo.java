/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_7;

/**
 *
 * @author henryubuntu
 */
// Demonstrate several Is... methods.
class IsDemo {

    public static void main(String args[]) {
        char a[] = {'a', 'b', '5', '?', 'A', ' '};

        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                System.out.println(a[i] + " is a digit.");
            }
            if (Character.isLetter(a[i])) {
                System.out.println(a[i] + " is a letter.");
            }
            if (Character.isWhitespace(a[i])) {
                System.out.println(a[i] + " is whitespace.");
            }
            if (Character.isUpperCase(a[i])) {
                System.out.println(a[i] + " is uppercase.");
            }
            if (Character.isLowerCase(a[i])) {
                System.out.println(a[i] + " is lowercase.");
            }
        }
    }
}
