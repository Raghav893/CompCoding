package com.raghav.greedy;

import java.util.Arrays;

public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;

    }

    public static void main(String[] args) {
       ArrayPairSum obj =new ArrayPairSum();
       int [] nums = {2,5,1,4,4,2,};
        System.out.println(obj.arrayPairSum(nums));

    }
}
