/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_2;

/**
 *
 * @author henryubuntu
 */
// Using break as a civilized form of goto. 
class Break {

    public static void main(String args[]) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break.");
                    if (t) {
                        break second; // break out of second block
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
