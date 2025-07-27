package Array1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int r1=0;
        int r2=0;
        for(int i=0;i<2;i++){
            r1+=a[i];
            r2+=b[i];
        }
        if(r2>r1) return b;
        return a;
    }

}
