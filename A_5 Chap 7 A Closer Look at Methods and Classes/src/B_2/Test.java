/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_2;

/**
 *
 * @author henryubuntu
 */
/* This program demonstrates the difference between
   public and private.
 */
class Test {

    int a; // default access
    public int b; // public access
    private int c; // private access

    // methods to access c
    void setc(int i) { // set c's value
        c = i;
    }

    int getc() { // get c's value
        return c;
    }
}
