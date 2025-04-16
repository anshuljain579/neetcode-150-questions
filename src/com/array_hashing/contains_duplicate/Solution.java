package com.array_hashing.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,3,3};
        boolean hasDuplicate = sol.hasDuplicate(nums);

        System.out.println(hasDuplicate);
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
