package Warmup2;

public class Last2 {
    public int last2(String str) {
        if(str.length()<=2) return 0;
        String sub = str.substring(str.length()-2);
        int c = 0;
        for(int i=0;i<str.length()-2;i++){
            if(sub.equals(str.substring(i,i+2))) c++;
        }

        return c;
    }

}
