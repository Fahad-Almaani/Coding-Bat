package Logic2;

import java.util.Arrays;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int[] nums = {a,b,c};
        Arrays.sort(nums);
        return (Math.abs(nums[0]-nums[1]) == Math.abs(nums[1]-nums[2]));

    }

}
