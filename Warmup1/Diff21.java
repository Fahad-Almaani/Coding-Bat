package Warmup1;

public class Diff21 {
    public static  int  diff21(int n) {
        if(n<=21){
            return 21-n;
        }
        return (n-21)*2;
    }

    public static void main(String[] args){
        System.out.println(diff21(22));
    }

}
