/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_4;

/**
 *
 * @author henryubuntu
 */
import java.util.concurrent.Exchanger;

// A Thread that constructs a string. 
class MakeString implements Runnable {

    Exchanger<String> ex;
    String str;

    MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();

        new Thread(this).start();
    }

    public void run() {
        char ch = 'A';

        for (int i = 0; i < 3; i++) {

            // Fill Buffer 
            for (int j = 0; j < 5; j++) {
                str += ch++;
            }

            try {
                // Exchange a full buffer for an empty one. 
                str = ex.exchange(str);
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }
}
