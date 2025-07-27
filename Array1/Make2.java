package Array1;

import java.util.Arrays;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        if(a.length>=2) return Arrays.copyOfRange(a,0,2);
        if(a.length ==0) return Arrays.copyOfRange(b,0,2);

        return new int[]{a[0],b[0]};
    }

}
