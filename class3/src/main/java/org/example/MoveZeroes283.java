package org.example;

import java.lang.*;
import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        int[] nums = {2,1};
//        int[] nums = {1,0,1};
//        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes1(nums);
    }
//    public static void moveZeroes(int[] nums) {
//int lastNumFound = 0;
//        for (int i=0 ; i<nums.length-1; i++){
//        if(nums[i]!=0){
//            nums[lastNumFound]=nums[i];
//            lastNumFound++;
//        } else if (nums[i+1]!=0) {
//            nums[lastNumFound]=nums[i+1];
//            nums[i+1]=0;
//            lastNumFound++;
//        }
//    }
//        for(lastNumFound+=1;lastNumFound < nums.length;lastNumFound++){
//        nums[lastNumFound]=0;
//    }
//        System.out.println(Arrays.toString(nums));
//    }
//    public static void moveZeroes1(int[] nums) {
//        int lastReplacedNonZero = 0;
//        for(int i = 0 ; i < nums.length ; i++){
//            if(nums[i]!=0 && nums[lastReplacedNonZero]==0){
//                nums[lastReplacedNonZero] = nums[i];
//                nums[i] = 0;
//                while(nums[lastReplacedNonZero]!=0 && lastReplacedNonZero < i){
//                    lastReplacedNonZero+=1;
//                }
//            }
//            else{
//                while(nums[lastReplacedNonZero]!=0 && lastReplacedNonZero < i){
//                    lastReplacedNonZero+=1;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
//    }

//    public static void moveZeroes1(int[] nums) {
//        for (int i = 0,j=0 ; i<nums.length; i++){
//            if(i!=j){
//            if(nums[i]!=0 && nums[j]==0){
//                int k = nums[j];
//                nums[j] = nums[i];
//                nums[i] = 0;
//                j++;
//            }
//            }
//            if(nums[j]!=0 && j < i){
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//
//    }

//    public static void moveZeroes1(int[] nums) {
//        for (int i = 0,j=0 ; i<nums.length; i++){
//            if(nums[i]!=0 && nums[j]==0){
//                int k = nums[j];
//                nums[j] = nums[i];
//                nums[i] = 0;
//                j++;
//            }
//            if(nums[j]!=0 && j < i){
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//
//    }

    public static void moveZeroes1(int[] nums) {
        int left = 0;
//        int left = 0;
        int right = 0;
        while(right < nums.length){
            int num = nums[right];
            if(num != 0){
                nums[left++] = num;
            }
            right++;
        }
        while(left < nums.length){
            nums[left++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
