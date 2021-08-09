/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_3_How_Generics_Improve_Type_Safety;

/**
 *
 * @author henryubuntu
 */
// NonGen is functionally equivalent to Gen 
// but does not use generics.  
class NonGen {

    Object ob; // ob is now of type Object 

    // Pass the constructor a reference to   
    // an object of type Object 
    NonGen(Object o) {
        ob = o;
    }

    // Return type Object. 
    Object getob() {
        return ob;
    }

    // Show type of ob.  
    void showType() {
        System.out.println("Type of ob is "
                + ob.getClass().getName());
    }
}
