package Logic1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        String res = String.valueOf((a+b));
        int al = String.valueOf(a).length();
        if(res.length() == String.valueOf(a).length()) return a+b;
        return a;

     }

}
