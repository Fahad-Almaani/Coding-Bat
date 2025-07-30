package String2;

public class OneTwo {
    public  static String oneTwo(String str){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length()-2;i+=3){
//
            StringBuilder part = new StringBuilder(str.substring(i,i+3));
            res.append(part.charAt(1)).append(part.charAt(2)).append(part.charAt(0));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        oneTwo("abc");
    }
}
