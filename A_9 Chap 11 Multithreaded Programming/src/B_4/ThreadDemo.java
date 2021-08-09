/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_4;

/**
 *
 * @author henryubuntu
 */
class ThreadDemo {

    private static NewThread NewThread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // A factory method that creates and starts a thred.
    public static NewThread createAndStart(){
        NewThread nt = NewThread();
        nt.t.start();
        return nt;
        
    }
    
    public static void main(String args[]) {
        new NewThread().t.start(); // create and start a new thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }

    
}
