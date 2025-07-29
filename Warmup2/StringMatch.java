package Warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int m = Math.min(a.length(),b.length());
        int c = 0;
        for(int i =0 ;i<m-1;i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2))){
                c++;
            }
        }
        return c;
    }

}
