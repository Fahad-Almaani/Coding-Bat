package String1;

public class MiddleTwo {
    public String middleTow(String str){
        if(str.length() <=2) return str;

        return str.substring(((str.length()-1)/2),(str.length()/2)+1);
    }
}
