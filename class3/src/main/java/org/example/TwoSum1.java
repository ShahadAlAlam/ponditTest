package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
      //solved by this code
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {
//        int[] nums={2,7,11,15};
//        System.out.println(Arrays.toString(twoSum(nums,9)));
//        int[] nums={3,2,4};
//        System.out.println(Arrays.toString(twoSum(nums,6)));
        int[] nums={0,4,3,0};
        System.out.println(Arrays.toString(twoSum(nums,0)));

//        0,4,3,0
    }
}
