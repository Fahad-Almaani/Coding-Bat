package String1;

public class Right2 {
    public static String right2(String str){
        int l = str.length();
        return str.charAt(l-2)+""+str.charAt(l-1)+str.substring(0,l-2);
    }


    public static void main(String[] args){
        System.out.println(right2("Hello"));
    }
}
