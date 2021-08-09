/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_8;

/**
 *
 * @author henryubuntu
 */
// Demonstrate NIO-based, stream output. Requires JDK 7 or later. 
import java.io.*;
import java.nio.file.*;

class NIOStreamWrite {

    public static void main(String args[]) {
        // Open the file and obtain a stream linked to it. 
        try (OutputStream fout
                = new BufferedOutputStream(
                        Files.newOutputStream(Paths.get("test.txt")))) {
            // Write some bytes to the stream. 
            for (int i = 0; i < 26; i++) {
                fout.write((byte) ('A' + i));
            }

        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
