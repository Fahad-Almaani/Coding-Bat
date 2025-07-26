package String1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if(str.isEmpty()) return false;
        if(str.length()<2) return false;
        return (str.substring(0,2).equals(str.substring(str.length()-2)));
    }

}
