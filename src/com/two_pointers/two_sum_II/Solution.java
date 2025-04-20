package com.two_pointers.two_sum_II;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 3;

        int[] result = twoSum2(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int currSum = nums[left] + nums[right];
            if(currSum > target) {
                right--;
            } else if(currSum < target) {
                left++;
            } else {
                return new int[] { left + 1, right + 1};
            }
        }
        return new int[0];
    }

    static int[] twoSum2_2(int []nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(nums[left] + nums[right] != target) {
            int sum = nums[left] + nums[right];
            if(sum > target) right--;
            else left++;
        }

        return new int[]{left + 1, right + 1};
    }
}
