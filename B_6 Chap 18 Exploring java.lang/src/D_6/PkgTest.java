/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D_6;

/**
 *
 * @author henryubuntu
 */
// Demonstrate Package
class PkgTest {

    public static void main(String args[]) {
        Package pkgs[];

        pkgs = Package.getPackages();

        for (int i = 0; i < pkgs.length; i++) {
            System.out.println(
                    pkgs[i].getName() + " "
                    + pkgs[i].getImplementationTitle() + " "
                    + pkgs[i].getImplementationVendor() + " "
                    + pkgs[i].getImplementationVersion()
            );
        }

    }
}
