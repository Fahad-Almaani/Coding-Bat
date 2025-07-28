package Logic1;

public class ShareDigit {
    public boolean shareDigit(int a, int b) {
        if(a/10 == b/10) return true;
        if(b%10 == a%10) return true;
        if(a/10 == b%10) return true;
        return a % 10 == b / 10;
    }

}
