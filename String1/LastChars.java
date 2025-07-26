package String1;

public class LastChars {
    public String lastChars(String a,String b){
        if(a.isEmpty() && b.isEmpty()) return "@@";
        if(a.isEmpty()) return "@"+b.charAt(b.length()-1);
        if(b.isEmpty()) return a.charAt(0)+"@";
        return a.charAt(0)+""+b.charAt(b.length()-1);
    }
}
