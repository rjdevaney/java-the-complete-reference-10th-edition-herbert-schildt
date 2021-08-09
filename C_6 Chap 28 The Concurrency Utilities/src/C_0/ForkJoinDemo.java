/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_0;

/**
 *
 * @author henryubuntu
 */

import B_9.*;
import java.util.concurrent.*;  
import java.util.*; 

// Demonstrate parallel execution.  
class ForkJoinDemo {

    public static void main(String args[]) {
        // Create a task pool. 
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[100000];

        // Give nums some values. 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        System.out.println("A portion of the original sequence:");

        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        // Start the main ForkJoinTask. 
        fjp.invoke(task);

        System.out.println("A portion of the transformed sequence"
                + " (to four decimal places):");
        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ", nums[i]);
        }
        System.out.println();
    }
}
