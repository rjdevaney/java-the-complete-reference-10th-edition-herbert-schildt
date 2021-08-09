/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_9_The_Numeric_Type_Wrappers;

/**
 *
 * @author henryubuntu
 */
// Demonstrate a type wrapper. 
class Wrap {

    public static void main(String args[]) {

        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb); // displays 100 100 
    }
}
