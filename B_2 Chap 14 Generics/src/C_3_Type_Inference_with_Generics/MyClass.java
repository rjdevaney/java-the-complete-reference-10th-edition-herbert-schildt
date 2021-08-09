/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_3_Type_Inference_with_Generics;

/**
 *
 * @author henryubuntu
 */
class MyClass<T, V> {
    T ob1;
    V ob2;
    
    MyClass(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }
    // ...
        
    boolean isSame (MyClass<T, V> o){
        if(ob1 == o.ob1 && ob2 == o.ob2) return true;
        else return false;
    }
    
}
