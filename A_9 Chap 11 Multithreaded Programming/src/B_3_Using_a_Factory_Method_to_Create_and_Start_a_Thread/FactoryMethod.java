/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_3_Using_a_Factory_Method_to_Create_and_Start_a_Thread;

/**
 *
 * @author henryubuntu
 */
public class FactoryMethod {
    
    // A factory method that creates and starts a thred.
    public static NewThread createAndStart(){
        NewThread myThrd = new NewThread();
        myThrd.t.start();
        return myThrd;
        
    }
}
