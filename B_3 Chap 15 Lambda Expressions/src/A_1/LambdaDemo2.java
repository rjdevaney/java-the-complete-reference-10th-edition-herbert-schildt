/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_1;

/**
 *
 * @author henryubuntu
 */
class LambdaDemo2 {

    public static void main(String args[]) {
        // A lambda expression that tests if a number is even. 
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10)) {
            System.out.println("10 is even");
        }
        if (!isEven.test(9)) {
            System.out.println("9 is not even");
        }

        // Now, use a lambda expression that tests if a number 
        // is non-negative. 
        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1)) {
            System.out.println("1 is non-negative");
        }
        if (!isNonNeg.test(-1)) {
            System.out.println("-1 is negative");
        }
    }
}
