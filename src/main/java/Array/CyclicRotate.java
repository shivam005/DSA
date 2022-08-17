package Array;

import java.util.Arrays;

/*
* Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x.
* */
public class CyclicRotate {

    static int[] rotate(int[] arr){
        int x = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
        return arr;
    }

    public static void main(String[] args) {
    int[] arr={2,3,4,5,6};
        System.out.println(Arrays.toString( CyclicRotate.rotate(arr)));
    }
}
