package String1;

public class TheEnd {
    public String theEnd(String str,boolean front){
        if(front) return str.charAt(0)+"";
        return str.charAt(str.length()-1)+"";
    }
}
