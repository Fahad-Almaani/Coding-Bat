package Warmup2;

public class AltPairs {
    public String altPairs(String str) {
        int i =0;
        StringBuilder res = new StringBuilder();
        boolean skip = false;
        while(i<str.length()-1){
            if(!skip){
                res.append(str, i, i+2);
                skip = true;
            }else{
                skip = false;
            }
            i+=2;
        }
        if(!skip){

        if(str.length()%2 != 0)res.append(str.charAt(str.length()-1));
        }
        return res.toString();
    }

}
