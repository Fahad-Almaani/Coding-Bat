package Warmup1;

public class EveryNth {
    public static String everyNth(String str, int n) {
        String result = str.charAt(0) + "";
        int c = n;
        while(c< str.length()){
            result = result + str.charAt(c);
            c +=n;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(everyNth("Miracle",2));
    }

}
