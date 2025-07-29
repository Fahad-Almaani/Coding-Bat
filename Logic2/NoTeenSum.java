package Logic2;

public class NoTeenSum {
    public int noTeenSum(int a, int b, int c) {
        int[] nums = new int[]{a,b,c};
        int res = 0;
        for(int n:nums){
            res+=fixTeen(n);
        }
        return res;
    }
    public int fixTeen(int n){
        if(n== 15 || n==16) return n;
        if(13<= n && n<=19) return 0;
        return n;
    }

}
