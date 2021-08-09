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
// Demonstrate TwoGen. 
class SimpGen {

    public static void main(String args[]) {

        TwoGen<Integer, String> tgObj
                = new TwoGen<Integer, String>(88, "Generics");

        // Show the types. 
        tgObj.showTypes();

        // Obtain and show values. 
        int v = tgObj.getob1();
        System.out.println("value: " + v);

        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}
