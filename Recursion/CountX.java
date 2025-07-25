package Recursion;

public class CountX {
    public int countX(String str) {
        if(str == null || str.isEmpty()) return 0;
        if(str.charAt(0) == 'x') return 1 + countX(str.substring(1));
        return countX(str.substring(1));
    }

}
