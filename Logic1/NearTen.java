package Logic1;

public class NearTen {
    public boolean nearTen(int num) {
        int re = num%10;

        if(re==0 || re==1 || re==2) return true;
        return 10 - re == 1 || 10 - re == 2;
    }

}
