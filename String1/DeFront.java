package String1;

public class DeFront {
    public String deFront(String str){
        if(str.isEmpty()) return "";
        if(str.charAt(0) == 'a' && str.charAt(1)=='b'){
            return str;
        }
        if(str.charAt(0) == 'a'){
            return str.charAt(0) + str.substring(2);
        }
        if(str.charAt(1) == 'b'){
            return str.substring(1);
        }
        return str.substring(2);
    }
}
