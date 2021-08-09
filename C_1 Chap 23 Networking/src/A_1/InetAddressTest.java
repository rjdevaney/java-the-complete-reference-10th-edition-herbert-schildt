/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_1;

/**
 *
 * @author henryubuntu
 */
// Demonstrate InetAddress. 
import java.net.*;

public class InetAddressTest {
    
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        
        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);
        
        InetAddress SW[] = InetAddress.getAllByName("www.nba.com");
        for (int i=0; i<SW.length; i++)
            System.out.println(SW[i]);
    }
}
