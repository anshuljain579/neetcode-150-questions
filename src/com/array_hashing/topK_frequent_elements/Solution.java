package com.array_hashing.topK_frequent_elements;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        int[] res = getTopKFrequentElement(nums, k);
        System.out.println(Arrays.toString(res));
    }

    static int[] getTopKFrequentElement(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: sortedMap.entrySet()) {
            if(entry.getValue() >= k) {
                list.add(entry.getKey());
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
