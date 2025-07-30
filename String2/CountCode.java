package String2;

public class CountCode {
    public int countCode(String str) {
        int c = 0;
        for(int i=0 ;i<str.length()-3;i++){
            if(i+3 > str.length()) break;;
            if(str.startsWith("co", i) && str.charAt(i+3)=='e'){
                c++;
            }
        }

        return c;
    }

}
