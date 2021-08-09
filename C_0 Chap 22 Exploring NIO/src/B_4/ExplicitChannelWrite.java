/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_4;

/**
 *
 * @author henryubuntu
 */
// Write to a file using NIO. Requires JDK 7 or later.  
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {

    public static void main(String args[]) {

        // Obtain a channel to a file within a try-with-resources block.  
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)) {
            // Create a buffer.  
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            // Write some bytes to the buffer.  
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

            // Reset the buffer so that it can be written.  
            mBuf.rewind();

            // Write the buffer to the output file.  
            fChan.write(mBuf);
            
            for (int h = 0; h < 3; h++) {
                // Write some bytes to the buffer. 
                for (int i = 0; i < 26; i++) {
                    mBuf.put((byte) ('A' + i));
                }

                // Rewind the buffer so that it can be written. 
                mBuf.rewind();

                // Write the buffer to the output file. 
                fChan.write(mBuf);

                // Rewind the buffer so that it can be written to again. 
                mBuf.rewind();
            }

        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
            System.exit(1);
        }
    }
}
