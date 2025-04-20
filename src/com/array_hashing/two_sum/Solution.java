package com.array_hashing.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        int target = 7;

        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp)) {
                return new int[] { map.get(comp), i}; }
            map.put(nums[i], i);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

}
