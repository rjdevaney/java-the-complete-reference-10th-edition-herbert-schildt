/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_4_p2;

/**
 *
 * @author henryubuntu
 */
class Protection2 extends A_3_p1.Protection {

    Protection2() {
        System.out.println("derived other package constructor");

//  class or package only
//  System.out.println("n = " + n);
//  class only
//  System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
