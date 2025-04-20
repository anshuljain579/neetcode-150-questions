package com.array_hashing.group_anagrams;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] strArr = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> strList = groupAnagrams(strArr);

        System.out.println(strList);
    }

    static List<List<String>> groupAnagrams(String[] strArr) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strArr) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String sortedStr = new String(ch);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
