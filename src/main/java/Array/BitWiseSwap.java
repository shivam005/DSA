package Array;

public class BitWiseSwap {

    public static void swap(int i, int j){
        i=i^j;
        j=i^j;
        i=i^j;
        System.out.println(i +" "+ j);
    }

    public static void main(String[] args) {
        BitWiseSwap.swap(6,8);
    }
}
