package String2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        int l = word.length();
        if(str.equals(word)) return "";
        StringBuilder res = new StringBuilder();
        if(str.startsWith(word)){
            res.append(str.charAt(l));
        }
        for(int i=0;i<str.length();i++){
            if(str.startsWith(word,i+1)){
                res.append(str.charAt(i));
                if(i+l+1 < str.length()){
                    res.append(str.charAt(i+l+1));
                }
            }

        }
        return res.toString();
    }

}
