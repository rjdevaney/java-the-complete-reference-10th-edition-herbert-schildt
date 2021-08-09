/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_4;

/**
 *
 * @author henryubuntu
 */
// A subclass of Gen. 
class Gen2 extends Gen<String> {

    Gen2(String o) {
        super(o);
    }

    // A String-specific override of getob(). 
    String getob() {
        System.out.print("You called String getob(): ");
        return ob;
    }
}
