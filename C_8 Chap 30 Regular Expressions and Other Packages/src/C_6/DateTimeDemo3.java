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
// Create a custom date and time format. 
import java.time.*;
import java.time.format.*;

class DateTimeDemo3 {

    public static void main(String args[]) {

        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime.format(
                DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
