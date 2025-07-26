package String1;

public class CombaString {
    public String comboString(String a,String b){
        if(a.length()< b.length()){
            return a+b+a;
        }
        return b+a+b;
    }
}
