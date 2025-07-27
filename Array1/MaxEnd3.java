package Array1;



public class MaxEnd3 {
    public int[] maxEnd3(int[] nums){
        int max = Math.max(nums[0], nums[nums.length - 1]);
        int[] res = new int[nums.length];
        res[0] = max;
        res[1] = max;
        res[2] = max;
        return res;
    }
}
