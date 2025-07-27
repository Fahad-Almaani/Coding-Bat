package Array1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(Math.max(nums[0],nums[nums.length-1]),nums[(nums.length/2)]);
    }

}
