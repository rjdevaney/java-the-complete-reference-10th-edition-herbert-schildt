/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_2;

/**
 *
 * @author henryubuntu
 */
// A simple example that uses RecursiveTask<V>. 
import java.util.concurrent.*;

// A RecursiveTask that computes the summation of an array of doubles. 
class Sum extends RecursiveTask<Double> {

    // The sequential threshold value.  
    final int seqThresHold = 500;

    // Array to be accessed. 
    double[] data;

    // Deterines what part of data to process. 
    int start, end;

    Sum(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    // Find the summation of an array of doubles. 
    protected Double compute() {
        double sum = 0;

        // If number of elements is below the sequential threshold, 
        // then process sequentially. 
        if ((end - start) < seqThresHold) {
            // Sum the elements. 
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            // Otherwise, continue to break the data into smaller peices. 

            // Find the midpoint. 
            int middle = (start + end) / 2;

            // Invoke new tasks, using the subdivided data. 
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            // Start each subtask by forking. 
            subTaskA.fork();
            subTaskB.fork();

            // Wait for the subtasks to return, and aggregate the results. 
            sum = subTaskA.join() + subTaskB.join();
        }
        // Return the final sum. 
        return sum;
    }
}
