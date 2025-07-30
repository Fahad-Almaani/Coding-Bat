package Warmup2;

public class StringBits {
    public String stringBits(String str) {
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        for(char c:str.toCharArray()){
            if(flag){
                res.append(c);
                flag=false;
            }else flag=true;
        }
        return res.toString();
    }

}
