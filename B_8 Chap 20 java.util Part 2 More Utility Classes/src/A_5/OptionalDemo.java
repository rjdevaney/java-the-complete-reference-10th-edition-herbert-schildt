/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_5;

/**
 *
 * @author henryubuntu
 */
// Demonstrate Optional<T>.
import java.util.*;

class OptionalDemo {

    public static void main(String args[]) {

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) {
            System.out.println("This won't be displayed");
        } else {
            System.out.println("noVal has no value");
        }

        if (hasVal.isPresent()) {
            System.out.println("The string in hasVal is: "
                    + hasVal.get());
        }

        String defStr = noVal.orElse("Default String");
        System.out.println(defStr);
    }
}
