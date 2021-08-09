/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_3;

/**
 *
 * @author henryubuntu
 */
// Inner class demo
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*
  <applet code="InnerClassDemo" width=200 height=100>
  </applet>
 
 */

public class InnerClassDemo extends Frame {

    String msg = "";
    
    public InnerClassDemo() {
        addMouseListener(new MyMouseAdapter());
        addWindowListener(new MyWindowAdapter());
    }

    // Inner class to handle mouse pressed events.
    class MyMouseAdapter extends MouseAdapter {

        public void mousePressed(MouseEvent me) {
            msg = "Mouse Pressed.";
            repaint();
        }
    }
    
    class MyWindowAdapter extends WindowAdapter {

        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
    
    public void paint (Graphics g){
        g.drawString(msg, 20, 80);
    }
    
    public static void main(String[] args) {
        InnerClassDemo appwin = new InnerClassDemo();
        
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("InnerClassDemo");
        appwin.setVisible(true);
    }
}
