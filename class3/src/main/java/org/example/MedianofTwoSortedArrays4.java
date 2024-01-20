package org.example;

import java.util.Arrays;

public class MedianofTwoSortedArrays4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        System.out.println( findMedianSortedArrays(nums1,nums2));
//        findMedianSortedArrays(nums1,nums2);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    Double a = 0D;
    int[] ara = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, ara, 0, nums1.length);
        System.arraycopy(nums2, 0, ara, nums1.length, nums2.length);
       int[] ara2= Arrays.stream(ara).sorted().toArray();
    int araLength = ara2.length;
    if(araLength%2==0){
        a=(Double.parseDouble(String.valueOf(ara2[(int) Math.floor(araLength/2)-1]) ) +
                Double.parseDouble(String.valueOf(ara2[(int) Math.ceil(araLength/2)]) ))/2;
    } else
        a=Double.parseDouble(String.valueOf(ara2[(int) Math.floor(araLength/2)]));
    return a;
    }

}
