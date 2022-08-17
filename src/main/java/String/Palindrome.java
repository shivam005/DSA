package String;

public class Palindrome {

    public static boolean check(String str){
        int i=0;
        int j=str.length()-1;
        boolean flag=false;
        while (i<j){
            if(str.charAt(i)==str.charAt(j)){
                flag= true;
            }
            else {
                flag= false;}
            i++;
            j--;
        }
        return flag;
    }

    public static void main(String[] args) {

        boolean result= Palindrome.check("abba");
        System.out.println(result);
    }
}
