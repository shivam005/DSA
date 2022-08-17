package Array;

public class Test {

    public static int count(int[] arr){

        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++)
            if(arr[i]==arr[j]){
                count++;
            }
        }
        return   0;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,3};
        System.out.println(  Test.count(arr));
    }
}
