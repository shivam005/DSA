package Recursion;

public class PowerByRecursion {

    public static int power(int a, int b){
        if(b==0){
            return 1;
        }else{
            return a*power(a,b-1);
        }
    }

    public static void main(String[] args) {
        int res=PowerByRecursion.power(2,3);
        System.out.println(res);
    }
}
