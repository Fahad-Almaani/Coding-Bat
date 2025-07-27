package Array1;

import java.util.Arrays;

public class Unlucky1 {
    public static boolean unlucky1(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == 1 && nums[i+1] == 3){
                if(i<=1 || (i==nums.length-2)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(unlucky1(new int[]{1,1,1,3,1}));
    }

}
