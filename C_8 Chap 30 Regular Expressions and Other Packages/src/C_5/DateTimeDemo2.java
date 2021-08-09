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
// Demonstrate DateTimeFormatter. 
import java.time.*;
import java.time.format.*;

class DateTimeDemo2 {

    public static void main(String args[]) {

        LocalDate curDate = LocalDate.now();
        System.out.println(curDate.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalTime curTime = LocalTime.now();
        System.out.println(curTime.format(
                DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
    }
}
