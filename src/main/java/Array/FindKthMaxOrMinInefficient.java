package Array;

import java.util.Arrays;
import java.util.Collections;

public class FindKthMaxOrMinInefficient {

    public static int findMin(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int findMax(int[] arr, int k){
//        Arrays.sort(arr ,  Collections.reverseOrder());
//        return arr[k-1];
        int[] l= Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        return l[k-1];
    }


    public static void main(String[] args) {
        int[] arr={2,23,4,5,3};
      int a=  FindKthMaxOrMinInefficient.findMax(arr, 1);
        int b= FindKthMaxOrMinInefficient.findMin(arr, 1);
        System.out.println(a);
        System.out.println(b);
    }
}
