package Warmup1;

public class IntMax {
    public int intMax(int a,int b,int c){
        if(a >b){
            if(a>c) return a;
            return c;
        }
        if(b>c) return b;
        return c;
    }
}
