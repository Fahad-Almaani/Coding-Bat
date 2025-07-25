package Warmup1;

public class StringE {
    public boolean stringE(String str){
        long e = str.chars().filter(c->c == 'e').count();
        return (1<= e && e<=3);


    }
}
