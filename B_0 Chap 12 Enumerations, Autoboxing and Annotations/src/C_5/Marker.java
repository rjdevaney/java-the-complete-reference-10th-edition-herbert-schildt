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
import java.lang.annotation.*;
import java.lang.reflect.*;

// A marker annotation. 
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

class Marker {

    // Annotate a method using a marker. 
    // Notice that no ( ) is needed. 
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            // Determine if the annotation is present. 
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present.");
            }

        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String args[]) {
        myMeth();
    }
}
