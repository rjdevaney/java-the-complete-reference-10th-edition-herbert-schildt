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
// This applet does NOT use an inner class.

import java.awt.*;
import java.awt.event.*;

/*
  <applet code="MousePressedDemo" width=200 height=100>
  </applet>
 
 */

public class MousePressedDemo extends Frame {

    String msg = "";
    public MousePressedDemo() {
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }
    
    public void paint (Graphics g){
        g.drawString (msg, 20,100);
    }
    
    public static void main(String[] args) {
        MousePressedDemo appwin = new MousePressedDemo();
        
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("MousePressedDemo");
        appwin.setVisible(true);
    }
}
