package String2;

public class EndOther {
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() > b.length()){
            if(a.endsWith(b)) return true;
        }
        return b.endsWith(a);
    }
}
