package String2;

public class StarOut {
    public String starOut(String str) {
        StringBuilder res = new StringBuilder();
        if(str.isEmpty()) return "";
        if(!str.startsWith("*") && !str.startsWith("*",1)){
            res.append(str.charAt(0));

        }
        for(int i=1;i<str.length();i++){
            if(i+1== str.length()){
                if((str.charAt(i) != '*') && (str.charAt(i-1)!='*')) {
                    res.append(str.charAt(i));
                }
                continue;
            }
            if(str.charAt(i) == '*') continue;
            if(str.charAt(i-1) == '*' || str.charAt(i+1) == '*'){
                continue;
            }else{
                res.append(str.charAt(i));

            }
        }
        return res.toString();
    }

}
