package Warmup2;

public class StringX {
    public String stringX(String str) {
        if(str.length()<=1) return str;
        StringBuilder res = new StringBuilder();
        res.append(str.charAt(0));

        for(char c:str.substring(1, str.length()-1).toCharArray()){
            if(c!='x') res.append(c);
        }
        res.append(str.charAt(str.length()-1));
        return res.toString();
    }

}
