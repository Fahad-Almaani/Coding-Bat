package String2;

public class PlusOut {
    public String plusOut(String str, String word) {
        int l = word.length();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.startsWith(word,i)){
                res.append(word);
                i+=l-1;
                continue;
            }
            res.append('+');
        }

        return res.toString();

    }

}
