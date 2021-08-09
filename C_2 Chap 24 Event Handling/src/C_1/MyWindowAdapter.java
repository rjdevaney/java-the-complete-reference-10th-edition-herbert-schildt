/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_1;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author henryubuntu
 */
// When the close box in the frame is clicked,
// close the window and exit the program.
class MyWindowAdapter extends WindowAdapter {

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
