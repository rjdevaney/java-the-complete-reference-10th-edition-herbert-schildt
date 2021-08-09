/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_6;

/**
 *
 * @author henryubuntu
 */
import java.lang.annotation.*;
import java.lang.reflect.*;

// A single-member annotation. 
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {

    int value(); // this variable name must be value 
}

class Single {

    // Annotate a method using a marker. 
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            MySingle anno = m.getAnnotation(MySingle.class);

            System.out.println(anno.value()); // displays 100 

        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
