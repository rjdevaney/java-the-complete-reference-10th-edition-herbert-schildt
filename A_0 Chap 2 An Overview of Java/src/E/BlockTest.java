/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E;

/**
 *
 * @author henryubuntu
 */
/*
  Demonstrate a block of code.
  
  Call this file "BlockTest.java"
 */
class BlockTest {

    public static void main(String args[]) {
        int x, y;

        y = 20;

        // the target of this loop is a block
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;
        }
    }
}
