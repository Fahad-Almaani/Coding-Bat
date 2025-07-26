package String1;

public class WithoutEnd2 {
    public static String withoutEnd(String str){
        if(str.length()<=2) return "";
        return str.substring(1,str.length()-1);
    }
}
