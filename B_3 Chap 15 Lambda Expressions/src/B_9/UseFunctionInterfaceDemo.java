/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_9;

/**
 *
 * @author henryubuntu
 */
// Use the Function built-in functional interface. 
// Import the Function interface. 
import java.util.function.Function;

class UseFunctionInterfaceDemo {

    public static void main(String args[]) {

        // This block lambda computes the factorial of an int value. 
        // This time, Function is the functional interface. 
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("The factoral of 3 is " + factorial.apply(3));
        System.out.println("The factoral of 5 is " + factorial.apply(5));
    }
}
