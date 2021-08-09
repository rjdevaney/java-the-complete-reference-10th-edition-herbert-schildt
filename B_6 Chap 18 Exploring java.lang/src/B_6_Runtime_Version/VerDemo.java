/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_6_Runtime_Version;

/**
 *
 * @author henryubuntu
 */
class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();
            
            // Display individual version numbers.
            System.out.println("Major version: "+ ver.major());
            System.out.println("Minor version: "+ ver.minor());
            System.out.println("Security version: "+ ver.security());
        }
}
