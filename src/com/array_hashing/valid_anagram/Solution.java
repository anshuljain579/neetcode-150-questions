package com.array_hashing.valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "racecar";
        String t = "carrace";

        boolean isAnagram = sol.isAnagram(s, t);
        System.out.println(isAnagram);
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for(char ch : s.toCharArray()) {
            countS.put(ch, countS.getOrDefault(ch, 0) + 1);
        }

        for(char ch : t.toCharArray()) {
            countT.put(ch, countT.getOrDefault(ch, 0) + 1);
        }

        return countS.equals(countT);
    }
}
