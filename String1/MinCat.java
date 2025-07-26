package String1;

public class MinCat {
    public static String minCat(String a, String b) {
        if(a.length() == b.length()) return a+b;
        if(a.length() > b.length()){
            String result = a.substring((a.length()-b.length()));
            return result+b;
        }
        String result = b.substring((b.length()-a.length()));
        return a+result;
    }

    public static void main(String[] args){
        System.out.println(minCat("Hello","Hi"));
    }

}
