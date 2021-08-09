/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_9;

/**
 *
 * @author henryubuntu
 */
// Demonstrate FileReader. 
// This program uses try-with-resources. It requires JDK 7 or later. 
import java.io.*;

class FileReaderDemo {

    public static void main(String args[]) {

        try (FileReader fr = new FileReader("FileReaderDemo.java")) {
            int c;

            // Read and display the file. 
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
