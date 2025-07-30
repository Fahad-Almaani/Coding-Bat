package String2;

public class CountHi {
    public int countHi(String str) {
        int c = 0;
        int lastIndex = 0;

        while ((lastIndex = str.indexOf("hi",lastIndex))!= -1){
            c++;
            lastIndex+=2;
        }

        return c;
    }


}
