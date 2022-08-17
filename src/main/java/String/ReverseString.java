package String;

public class ReverseString {

    public static String reverse(String str){
        String out="";
        for(int i=str.length()-1;i>=0;i--){
            out= out+ str.charAt(i);
        }
       return out;
    }
    public static void main(String[] args) {
        System.out.println(ReverseString.reverse("asdfghjkl"));
    }
}
