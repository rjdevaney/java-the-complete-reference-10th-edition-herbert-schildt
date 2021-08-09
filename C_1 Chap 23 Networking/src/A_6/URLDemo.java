/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_6;

/**
 *
 * @author henryubuntu
 */

// Demonstrate URL. 
import java.net.*; 
class URLDemo { 
  public static void main(String args[]) throws MalformedURLException { 
    URL hp = new URL("http://www.HerbSchildt.com/WhatsNew"); 
 
    System.out.println("Protocol: " + hp.getProtocol()); 
    System.out.println("Port: " + hp.getPort()); 
    System.out.println("Host: " + hp.getHost()); 
    System.out.println("File: " + hp.getFile()); 
    System.out.println("Ext:" + hp.toExternalForm()); 
  } 
}
