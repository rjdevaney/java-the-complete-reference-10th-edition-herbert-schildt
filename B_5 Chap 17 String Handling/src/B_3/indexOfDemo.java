/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_3;

/**
 *
 * @author henryubuntu
 */
// Demonstrate indexOf() and lastIndexOf().
class indexOfDemo {

    public static void main(String args[]) {
        String s = "Now is the time for all good men "
                + "to come to the aid of their country.";

        System.out.println(s);
        System.out.println("indexOf(t) = "
                + s.indexOf('t'));
        System.out.println("lastIndexOf(t) = "
                + s.lastIndexOf('t'));
        System.out.println("indexOf(the) = "
                + s.indexOf("the"));
        System.out.println("lastIndexOf(the) = "
                + s.lastIndexOf("the"));
        System.out.println("indexOf(t, 10) = "
                + s.indexOf('t', 10));
        System.out.println("lastIndexOf(t, 60) = "
                + s.lastIndexOf('t', 60));
        System.out.println("indexOf(the, 10) = "
                + s.indexOf("the", 10));
        System.out.println("lastIndexOf(the, 60) = "
                + s.lastIndexOf("the", 60));
    }
}
