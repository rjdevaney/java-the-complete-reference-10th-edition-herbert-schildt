/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_3_MyClass;

/**
 *
 * @author henryubuntu
 */
class MyClass {

    int a;
    int b;

    // initialize a and b individually 
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    // initialize a and b to the same value 
    MyClass(int i) {
        a = i;
        b = i;
    }

    // give a and b default values of 0 
    MyClass() {
        a = 0;
        b = 0;
    }
}
