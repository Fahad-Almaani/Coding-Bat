package Warmup1;

public class NotString {
    public String notString(String str) {
        String not = "not";
        if(str.length()<3){
            return not +" " +str;
        }
        if(not.equals(str.substring(0,3))){
            return str;
        }
        return not +" " +str;
    }

}
