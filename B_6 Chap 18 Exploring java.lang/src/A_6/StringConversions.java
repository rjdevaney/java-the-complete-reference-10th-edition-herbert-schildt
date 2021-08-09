/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_6;

/**
 *
 * @author henryubuntu
 */
/* Convert an integer into binary, hexadecimal,
   and octal.
 */
class StringConversions {

    public static void main(String args[]) {
        int num = 19648;

        System.out.println(num + " in binary: "
                + Integer.toBinaryString(num));

        System.out.println(num + " in octal: "
                + Integer.toOctalString(num));

        System.out.println(num + " in hexadecimal: "
                + Integer.toHexString(num));
    }
}
