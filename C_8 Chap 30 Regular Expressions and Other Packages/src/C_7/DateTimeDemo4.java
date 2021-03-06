/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_7;

/**
 *
 * @author henryubuntu
 */
// Parse a date and time. 
import java.time.*;
import java.time.format.*;

class DateTimeDemo4 {

    public static void main(String args[]) {

        // Obtain a LocalDateTime object by parsing a date and time string. 
        LocalDateTime curDateTime
                = LocalDateTime.parse("June 21, 2014 12:01 AM",
                        DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));

        // Now, display the parsed date and time. 
        System.out.println(curDateTime.format(
                DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
