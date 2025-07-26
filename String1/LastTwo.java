package String1;

public class LastTwo {
    public String lastTwo(String str){
        if(str.length()<=1) return str;
        char a = str.charAt(str.length()-1);
        char b = str.charAt(str.length()-2);
        return str.substring(0,str.length()-2)+a+b;


    }
}
