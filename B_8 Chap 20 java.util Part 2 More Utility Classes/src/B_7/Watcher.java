/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_7;

/**
 *
 * @author henryubuntu
 */
/* Demonstrate the Observable class and the
   Observer interface.
 */
import java.util.*;

// This is the observing class.
class Watcher implements Observer {

    public void update(Observable obj, Object arg) {
        System.out.println("update() called, count is "
                + ((Integer) arg).intValue());
    }
}
