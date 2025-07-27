package Array1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] r = new int[nums.length*2];
        r[(nums.length*2)-1] = nums[nums.length-1];
        return r;
    }

}
