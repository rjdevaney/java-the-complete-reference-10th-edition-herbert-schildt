/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_0;

import C_1.*;

/**
 *
 * @author henryubuntu
 */
// Use the default method. 
class DefaultMethodDemo {

    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();

        // Can call getNumber(), because it is explicitly 
        // implemented by MyIFImp: 
        System.out.println(obj.getNumber());

        // Can also call getString(), because of default 
        // implementation: 
        System.out.println(obj.getString());
    }
}
