package Warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {
        int c = str.length();
        StringBuilder res = new StringBuilder();
        for(int i=1;i<=str.length();i++){
            res.append(str, 0, i);
        }
        return res.toString();
    }

}
