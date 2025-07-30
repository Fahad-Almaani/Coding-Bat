package String2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){

        res.append(str.substring(str.length()-n));
        }

        return res.toString();
    }
}
