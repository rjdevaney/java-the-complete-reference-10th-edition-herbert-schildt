/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_3;

/**
 *
 * @author henryubuntu
 */

import C_2.*;
import java.util.concurrent.*;

// Demonstrate parallel execution.  
class RecurTaskDemo {

    public static void main(String args[]) {
        // Create a task pool. 
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        // Initialize nums with values that alternate between 
        // positive and negative. 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i % 2) == 0) ? i : -i);
        }

        Sum task = new Sum(nums, 0, nums.length);

        // Start the ForkJoinTasks.  Notice that in this case, 
        // invoke() returns a result. 
        double summation = fjp.invoke(task);

        System.out.println("Summation " + summation);
    }
}
