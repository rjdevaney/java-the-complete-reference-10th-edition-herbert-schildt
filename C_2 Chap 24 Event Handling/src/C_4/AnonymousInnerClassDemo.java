/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_4;

/**
 *
 * @author henryubuntu
 */
// Anonymous inner class demo.

import java.awt.event.*;
import java.awt.*;

/*
  <applet code="AnonymousInnerClassDemo" width=200 height=100>
  </applet>
 */

public class AnonymousInnerClassDemo extends Frame {

    String msg = "";
    
    public AnonymousInnerClassDemo() {
        
        // Anonymous inner class to handle mouse pressed events.
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                msg = "Mouse Pressed.";
                repaint();
            }
        });

        // Anonymous inner class to handle window close events.
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
        
        public void paint(Graphics g) {
            g.drawString(msg, 20, 80);
        }
        
        public static void main(String[] args) {
            AnonymousInnerClassDemo appwin = new AnonymousInnerClassDemo();
            
            appwin.setSize(new Dimension(200, 150));
            appwin.setTitle("AnonymousInnerClassDemo");
            appwin.setVisible(true);
    }
}

