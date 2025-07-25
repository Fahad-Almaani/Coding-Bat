package String1;

public class ConCat {
    public String conCat(String a, String b) {
        if (a.isEmpty()) return b;
        if(b.isEmpty()) return a;
    if(a.endsWith(b.charAt(0)+"")){
        return a+b.substring(1);
    }
    return a+b;
    }

}
