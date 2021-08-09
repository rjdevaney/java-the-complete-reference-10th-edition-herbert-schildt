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
public interface MyIF {
    // This is a "normal" interface method declaration. 
    // It does NOT define a default implementation. 

    int getNumber();

    // This is a default method. Notice that it provides 
    // a default implementation. 
    default String getString() {
        return "Default String";
    }

    // This is a static interface method. 
    static int getDefaultNumber() {
        return 0;
    }
}
