/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_4;

/**
 *
 * @author henryubuntu
 */
class BlockLambdaDemo2 {

    public static void main(String args[]) {

        // This block lambda that reverses the charactrers in a string. 
        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Lambda reversed is "
                + reverse.func("Lambda"));
        System.out.println("Expression reversed is "
                + reverse.func("Expression"));
    }
}
