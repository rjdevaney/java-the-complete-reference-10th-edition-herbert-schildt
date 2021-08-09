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
// Using concatenation to prevent long lines.
class ConCat {

    public static void main(String args[]) {
        String longStr = "This could have been "
                + "a very long line that would have "
                + "wrapped around.  But string concatenation "
                + "prevents this.";

        System.out.println(longStr);
    }
}
