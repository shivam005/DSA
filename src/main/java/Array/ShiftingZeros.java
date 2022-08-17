package Array;

import java.util.Arrays;

public class ShiftingZeros {

    public static int[] move(int[] arr){
        int i=0;
        int j=arr.length-1;
        //{2,3,0,4,0,0,2,44,32,0,0,9,8};
        while(i<=j) {
            if(arr[i]==0){
                i++;
            }
            else {
             swap(arr, i,j--);
        }}
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

//     arr[i]=arr[i]-arr[j];
//     arr[j]=arr[i]+arr[j];
//     arr[i]=arr[j]-arr[i];
    }

    public static void main(String[] args) {
        int[] arr={2,3,0,4,0,0,2,44,32,0,0,9,8};
        System.out.println(Arrays.toString( ShiftingZeros.move(arr)));
    }
}
