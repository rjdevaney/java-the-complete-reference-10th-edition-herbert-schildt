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
// Demonstrate the key event handlers.
import java.awt.*;
import java.awt.event.*;

public class SimpleKey extends Frame
        implements KeyListener {

    String msg = "";
    String keyState = "";

    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    // Handle a key press.
    public void keyPressed(KeyEvent ke) {
        keyState = "Key Down";
        repaint();
    }

    // Handle a key release.
    public void keyReleased(KeyEvent ke) {
        keyState = "Key Up";
        repaint();
    }

    // Handle key typed.
    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    // Display keystrokes.
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }
    
    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();
        
        appwin.setSize(new Dimension (200, 150));
        appwin.setTitle("SimpleKey");
        appwin.setVisible(true);
        
    }
}
    



//import java.awt.*;
//import java.awt.event.*;
//import java.applet.*;
//
//public class SimpleKey extends Applet
//        implements KeyListener {
//
//    String msg = "";
//    int X = 10, Y = 20; // output coordinates
//
//    public void init() {
//        addKeyListener(this);
//    }
//
//    public void keyPressed(KeyEvent ke) {
//        showStatus("Key Down");
//    }
//
//    public void keyReleased(KeyEvent ke) {
//        showStatus("Key Up");
//    }
//
//    public void keyTyped(KeyEvent ke) {
//        msg += ke.getKeyChar();
//        repaint();
//    }
//
//    // Display keystrokes.
//    public void paint(Graphics g) {
//        g.drawString(msg, X, Y);
//    }
//}
