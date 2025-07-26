package String1;

public class WithoutX2 {
    public String withoutX2(String str) {
        if(str.isEmpty()) return "";
        if(str.equals("x") || str.equals("xx")) return "";
        if(str.startsWith("x")) {
            if(str.startsWith("x",1))return str.substring(2);
            return str.substring(1);
        }
        if(str.startsWith("x",1)) return str.charAt(0)+str.substring(2);
        return str;
    }

}
