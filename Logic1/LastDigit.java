package Logic1;

public class LastDigit {
    public boolean lastDigit(int a, int b, int c) {
        if(a%10 == b%10) return true;
        if(a%10 == c%10) return true;
        return b%10 == c%10;
    }

}
