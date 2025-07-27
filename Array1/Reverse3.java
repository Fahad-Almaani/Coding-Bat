package Array1;

public class Reverse3 {
    public int[] reverse3(int[] nums){
        int[] res = new int[nums.length];
        int c = 0;
        for(int i=nums.length-1;i>=0;i--){
            res[c] = nums[i];
            c++;
        }
        return res;
    }
}
