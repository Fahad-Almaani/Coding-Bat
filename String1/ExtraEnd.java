package String1;

public class ExtraEnd {
    public String extraEnd(String str) {
        char b = str.charAt(str.length()-1);
        char a = str.charAt(str.length()-2);
        String result =""+ a+b+a+b+a+b;
        return result;
    }

}
