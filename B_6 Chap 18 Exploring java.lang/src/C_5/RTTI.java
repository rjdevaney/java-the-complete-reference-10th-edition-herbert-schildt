/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_5;

/**
 *
 * @author henryubuntu
 */
class RTTI {

    public static void main(String args[]) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;

        clObj = x.getClass(); // get Class reference
        System.out.println("x is object of type: "
                + clObj.getName());

        clObj = y.getClass(); // get Class reference
        System.out.println("y is object of type: "
                + clObj.getName());
        clObj = clObj.getSuperclass();
        System.out.println("y's superclass is "
                + clObj.getName());
    }
}
