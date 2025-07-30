package String2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefx = str.substring(0,n);
        String rest = str.substring(n);
        String x = rest.replace(prefx,"");
        return (x.length() < rest.length());

    }
}
