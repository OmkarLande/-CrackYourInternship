//Subarray Sum Equals K

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int subarraySum(int[] nums, int k) {
        //method 1: using hashmap
        // int count = 0;
        // int sum = 0;
        // Map<Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     if(map.containsKey(sum - k)){
        //         count += map.get(sum - k);
        //     }
        //     map.put(sum, map.getOrDefault(sum, 0) + 1);
        // }
        // return count;
        
        //method 2: using brute force
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;

        //method 3: using prefix sum
        // int count = 0;
        // int n = nums.length;
        // int[] prefix = new int[n + 1];
        // for(int i = 0; i < n; i++){
        //     prefix[i + 1] = prefix[i] + nums[i];
        // }
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j <= n; j++){
        //         if(prefix[j] - prefix[i] == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //method 4: using suffix sum
        // int count = 0;
        // int n = nums.length;
        // int[] suffix = new int[n + 1];
        // for(int i = 0; i < n; i++){
        //     suffix[i + 1] = suffix[i] + nums[n - 1 - i];
        // }
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j <= n; j++){
        //         if(suffix[j] - suffix[i] == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //method 5: using sliding window
        // int count = 0;
        // int sum = 0;
        // int i = 0;
        // int j = 0;
        // while(j < nums.length){
        //     sum += nums[j];
        //     if(sum == k){
        //         count++;
        //     }
        //     while(sum >= k){
        //         sum -= nums[i];
        //         i++;
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        //     j++;
        // }
        // return count;

        //method 7: using hashset
        // int count = 0;
        // int sum = 0;
        // Set<Integer> set = new HashSet<>();
        // set.add(0);
        // for(int i = 0; i < nums.length; i++){
        //     sum += nums[i];
        //     if(set.contains(sum - k)){
        //         count++;
        //     }
        //     set.add(sum);
        // }
        // return count;


    }
}