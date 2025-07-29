package Warmup2;

public class StringTime {
    public String stringTimes(String str, int n) {
        StringBuilder res = new StringBuilder();
        while (n>0){
            res.append(str);
            n--;
        }
        return res.toString();
    }

}
