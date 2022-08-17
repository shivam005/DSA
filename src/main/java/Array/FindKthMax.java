package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthMax {

    public static int max(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>( );
        for(int i=0;i<k;i++){
            priorityQueue.add(arr[i]);
        }
        // priorityQueue =[54, 34, 43, 3, 2, 5]

        for(int i=k; i<= arr.length-1;i++){
            if(priorityQueue.peek() < arr[i]){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }

        }
        return priorityQueue.peek();
    }

    public static int min(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            priorityQueue.add(arr[i]);
        }
        // priorityQueue =[54, 34, 43, 3, 2, 5]

        for(int i=k; i<= arr.length-1;i++){
            if(priorityQueue.peek() > arr[i]){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }

        }
        return priorityQueue.peek();
    }
    public static void main(String[] args) {

        int[] arr= {3,34,5,43,2,54,111,2};
        System.out.println(FindKthMax.max(arr, 2));
        System.out.println(FindKthMax.min(arr, 4));

    }
}
