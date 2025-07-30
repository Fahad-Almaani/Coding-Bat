package String2;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<count-1;i++){
            res.append(word).append(sep);
        }
        if(count>0) res.append(word);
        return res.toString();
    }
}
