/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_1;

/**
 *
 * @author henryubuntu
 */
// Demonstrate CharArrayReader. 
// This program uses try-with-resources. It requires JDK 7 or later. 
import java.io.*;

public class CharArrayReaderDemo {

    public static void main(String args[]) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        int length = tmp.length();
        char c[] = new char[length];

        tmp.getChars(0, length, c, 0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("input1 is:");
            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

        try (CharArrayReader input2 = new CharArrayReader(c, 0, 5)) {
            System.out.println("input2 is:");
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
