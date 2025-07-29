package Logic2;

public class LuckySum {
    public int luckySum(int a, int b, int c) {
        int[] nums = new int[]{a,b,c};
        int res = 0;
        for(int n:nums){
            if(n==13) return res;

            res+=n;
        }
        return res;
    }

}
