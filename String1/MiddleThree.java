package String1;

public class MiddleThree {
    public String middleThree(String str) {
        return str.substring(((str.length()-1)/2)-1,((str.length()+1)/2)+1);
    }

}
