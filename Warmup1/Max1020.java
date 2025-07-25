package Warmup1;

public class Max1020 {
    public int max1020(int a,int b){

        if(10<=a && a<=20){
                if(10<=b && b<=20){
                    return Math.max(a, b);
                }
                return a;
        }
        if(10<=b && b<=20)return b;
        return 0;

    }
}
