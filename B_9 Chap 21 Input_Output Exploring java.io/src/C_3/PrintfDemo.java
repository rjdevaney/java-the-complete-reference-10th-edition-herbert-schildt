/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_3;

/**
 *
 * @author henryubuntu
 */
// Demonstrate printf(). 
class PrintfDemo {

    public static void main(String args[]) {
        System.out.println("Here are some numeric values "
                + "in different formats.\n");

        System.out.printf("Various integer formats: ");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Default floating-point format: %f\n",
                1234567.123);
        System.out.printf("Floating-point with commas: %,f\n",
                1234567.123);
        System.out.printf("Negative floating-point default: %,f\n",
                -1234567.123);
        System.out.printf("Negative floating-point option: %,(f\n",
                -1234567.123);

        System.out.println();

        System.out.printf("Line up positive and negative values:\n");
        System.out.printf("% ,.2f\n% ,.2f\n",
                1234567.123, -1234567.123);
    }
}
