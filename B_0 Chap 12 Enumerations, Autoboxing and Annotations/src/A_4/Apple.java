/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_4;

/**
 *
 * @author henryubuntu
 */
// Use an enum constructor. 
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price; // price of each apple 

    // Constructor 
    Apple(int p) {
        price = p;
    }

    // Overloaded constructor 
    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
