/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_2;

/**
 *
 * @author henryubuntu
 */
// Demonstrate generic method override. 
class OverrideDemo {

    public static void main(String args[]) {

        // Create a Gen object for Integers. 
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Create a Gen2 object for Integers. 
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // Create a Gen2 object for Strings. 
        Gen2<String> strOb2 = new Gen2<String>("Generics Test");

        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
