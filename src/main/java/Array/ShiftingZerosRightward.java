package Array;

import java.util.Arrays;

public class ShiftingZerosRightward {
    static int count=0;
    public static int[] move(int[] arr){
        int[] arr1= new int[arr.length];
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
               arr1[count]=arr[i];
               count++;
            }

        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr={2,0,3,4,5,3,0,0,0,0,2};
        System.out.println(Arrays.toString(ShiftingZerosRightward.move(arr)));
    }
}
