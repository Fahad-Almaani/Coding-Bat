package Logic2;

public class RoundSum {
    public int roundSum(int a, int b, int c) {
        int res = 0;
        int[] nums = new int[]{a,b,c};
        for(int n:nums){
            res+=round10(n);
        }
        return res;
    }

    public int round10(int x){
        int r = x%10;
        if(r>=5) return x+ (10-x%10);
        return x - (x%10);
    }

}
