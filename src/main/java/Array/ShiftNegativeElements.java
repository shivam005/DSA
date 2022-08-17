package Array;

public class ShiftNegativeElements {

    private static void swap(int[] arr, int low, int high) {
        arr[low]=arr[low]^arr[high];
        arr[high]=arr[low]^arr[high];
        arr[low]=arr[high]^arr[low];
    }


    public static void move(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            if(arr[low]<=0){
                low++;
            }else{
                swap(arr, low, high-- );
            }
        }

    }

    public static void main(String[] args) {

        int[] ar = { 1, 2,  -4, -5, 2, -7, -3,
                2, -6, -8, -9, -3, -2,  -1 };
        ShiftNegativeElements.move(ar);
        for(int out: ar){
            System.out.print(out +" ");
        }
    }



}
