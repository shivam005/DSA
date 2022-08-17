package Array;

public class MaximumAndMinimumElement {

    public static int findMin(int[] arr){
        int min= arr[0];
    for (int input:arr){
        if(input<=min){
            min=input;
        }
    }
     return min;
    }

    public static int findMax(int[] arr){
        int max=arr[0];
        for(int input:arr){
            if(input>=max){
                max=input;
            }
        }
        return max;
    }

    public static void main(String[] args) {
     int[] arr={8,9,7,0,7,1,82,97,23};
        System.out.println("minimum "+MaximumAndMinimumElement.findMax(arr));
        System.out.println("maximum "+MaximumAndMinimumElement.findMin(arr));
    }
}
