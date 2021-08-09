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
class ObserverDemo {

    public static void main(String args[]) {
        BeingWatched observed = new BeingWatched();
        Watcher observing = new Watcher();

        /* Add the observing to the list of observers for
       observed object.  */
        observed.addObserver(observing);

        observed.counter(10);
    }
}
