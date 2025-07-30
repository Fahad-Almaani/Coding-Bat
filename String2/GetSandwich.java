package String2;

public class GetSandwich {
    public static String getSandwich(String str) {
        String bread = "bread";
        int fb = str.indexOf(bread);
        if(fb==-1 ) return "";
        int lb = str.lastIndexOf(bread);

        if(fb == lb || lb < fb + bread.length()) return "";

        int strat = fb + bread.length();

        return str.substring(strat,lb);

    }

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }

}
