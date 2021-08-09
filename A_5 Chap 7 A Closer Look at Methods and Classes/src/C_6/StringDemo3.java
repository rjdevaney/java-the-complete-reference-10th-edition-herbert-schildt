/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_6;

/**
 *
 * @author henryubuntu
 */
// Demonstrate String arrays.
class StringDemo3 {

    public static void main(String args[]) {
        String str[] = {"one", "two", "three"};

        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "]: "
                    + str[i]);
        }
    }
}
