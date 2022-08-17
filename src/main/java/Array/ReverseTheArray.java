package Array;

import java.util.Arrays;

public class ReverseTheArray {

    public static int[] reverse(int[] arr){
        int[] arr1 = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[j]=arr[i];
            j++;
        }
        return arr1;
    }



    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,1,3,0};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
