/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_8;

/**
 *
 * @author henryubuntu
 */
// Four-dimensional coordinates. 
class FourD extends ThreeD {

    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}
