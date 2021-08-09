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
// This is wrong!
class MyClass implements MinMax<T>  { //Wrong!

    T[] vals;

    MyClass(T[] o) {
        vals = o;
    }

    // Return the minimum value in vals. 
    public T min() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }

        return v;
    }

    // Return the maximum value in vals. 
    public T max() {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }

        return v;
    }
}
