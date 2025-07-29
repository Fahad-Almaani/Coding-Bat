package Warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        StringBuilder res = new StringBuilder();
        String front = "";
        if(str.length()>3) front = str.substring(0,3);
        else front=str;

        while(n>0){
            res.append(front);
            n--;
        }

        return res.toString();
    }

}
