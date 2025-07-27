package Array1;

import java.util.Arrays;

public class MidThree {
    public int[] midThree(int[] nums) {
        int mid = ((nums.length)/2 );
        return Arrays.copyOfRange(nums,mid-1,mid+2);
    }

}
