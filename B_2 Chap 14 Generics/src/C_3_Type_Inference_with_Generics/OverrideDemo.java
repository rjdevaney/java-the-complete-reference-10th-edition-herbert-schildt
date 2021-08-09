/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_3_Type_Inference_with_Generics;

/**
 *
 * @author henryubuntu
 */
// Demonstrate generic method override. 
class OverrideDemo {

    public static void main(String args[]) {

        // Create a Gen object for Integers. 
//        MyClass<Integer, String> mcOb = new MyClass<Integer, String>(98, "A String");
        MyClass<Integer, String> mcOb = new MyClass<>(98, "A String");

        if(mcOb.isSame(new MyClass<> (1, "test")))
            System.out.println("Same");
    }
}
