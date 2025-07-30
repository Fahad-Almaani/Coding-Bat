package String2;

public class DoubleChar {
    public String doubleChar(String str) {
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        int i = 0;
        while (i<str.length()){
            if(flag){
                res.append(str.charAt(i));
                flag = false;
            }else {
                res.append(str.charAt(i));
                flag = true;
                i++;
            }
        }
        return res.toString();
    }

}
