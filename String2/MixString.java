package String2;

public class MixString {
    public String mixString(String a, String b) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<Math.min(a.length(),b.length());i++){
            res.append(a.charAt(i));
            res.append(b.charAt(i));
        }
        if(a.length()>b.length()){
            res.append(a.substring(b.length()));
        }else if(b.length()>a.length()){
            res.append(b.substring(a.length()));
        }

        return res.toString();
    }

}
