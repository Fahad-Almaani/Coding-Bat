package Array1;

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int f = nums[0];
        int e = nums[nums.length-1];
        nums[0] = e;
        nums[nums.length-1] = f;
        return nums;
    }

}
