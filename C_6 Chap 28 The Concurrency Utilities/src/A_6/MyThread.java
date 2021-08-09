/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_6;

/**
 *
 * @author henryubuntu
 */

import java.util.concurrent.*;  

// A thread of execution that uses a Phaser.  
class MyThread implements Runnable {

    Phaser phsr;
    String name;

    MyThread(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run() {

        while (!phsr.isTerminated()) {
            System.out.println("Thread " + name + " Beginning Phase "
                    + phsr.getPhase());

            phsr.arriveAndAwaitAdvance();

            // Pause a bit to prevent jumbled output. This is for illustration  
            // only. It is not required for the proper opration of the phaser. 
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
