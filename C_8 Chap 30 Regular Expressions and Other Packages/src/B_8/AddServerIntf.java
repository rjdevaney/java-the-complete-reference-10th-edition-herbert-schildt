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
import java.rmi.*;

public interface AddServerIntf extends Remote {

    double add(double d1, double d2) throws RemoteException;
}
