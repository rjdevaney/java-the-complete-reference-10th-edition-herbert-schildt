/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_2;

/**
 *
 * @author henryubuntu
 */
// A simple example that uses walkFileTree( ) to display a directory tree. 
// Requires JDK 7 or later.  
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

// Create a custom version of SimpleFileVisitor that overrides 
// the visitFile( ) method. 
class MyFileVisitor extends SimpleFileVisitor<Path> {

    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs)
            throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
