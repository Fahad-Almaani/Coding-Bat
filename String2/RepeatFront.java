package String2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder res = new StringBuilder();
        int c = n;
        for(int i=0;i<n;i++){
            res.append(str, 0, c);
            c--;
        }
        return res.toString();
    }

}
