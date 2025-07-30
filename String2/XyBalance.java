package String2;

public class XyBalance {
    public boolean xyBalance(String str) {
        int x = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'x'){
                x++;
            }
            if(str.charAt(i) == 'y'){
                x = 0;
            }
        }

        return (x==0);
    }
}
