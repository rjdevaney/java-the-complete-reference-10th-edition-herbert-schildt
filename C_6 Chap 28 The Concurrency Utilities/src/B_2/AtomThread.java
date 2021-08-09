/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_2;

/**
 *
 * @author henryubuntu
 */

import java.util.concurrent.atomic.*; 

// A thread of execution that increments count. 
class AtomThread implements Runnable {

    String name;

    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }

    public void run() {

        System.out.println("Starting " + name);

        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " got: "
                    + Shared.ai.getAndSet(i));
        }
    }
}
