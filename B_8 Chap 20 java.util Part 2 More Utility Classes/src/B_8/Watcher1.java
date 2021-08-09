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
/* An object may be observed by two or more
   observers.
 */
import java.util.*;

// This is the first observing class.
class Watcher1 implements Observer {

    public void update(Observable obj, Object arg) {
        System.out.println("update() called, count is "
                + ((Integer) arg).intValue());
    }
}
