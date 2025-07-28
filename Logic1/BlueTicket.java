package Logic1;

public class BlueTicket {
    public int blueTicket(int a, int b, int c) {
        int s1 = a+b;
        int s2 = a+c;
        int s3 = c+b;
        if(s1==10 || s2==10||s3==10) return 10;
        if(s1 -s2 == 10 || s1-s3 == 10) return 5;
        return 0;
    }

}
