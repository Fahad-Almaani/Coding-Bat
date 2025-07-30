package String2;

public class XyzMiddle {
    public static boolean xyzMiddle(String str) {
        for(int i=0;i<str.length();i++){
            if(str.startsWith("xyz",i)){
                if(Math.abs(((str.length()-i)-3) - i) <=1) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AxyzBB"));
    }
}
