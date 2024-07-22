// Problem: 18. 4Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //method 1: using two pointers
        // Arrays.sort(nums);
        // List<List<Integer>> res = new ArrayList<>();

        // for(int i = 0; i < nums.length - 3; i++){
        //     if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
        //         for(int j = i + 1; j < nums.length - 2; j++){
        //             if(j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])){
        //                 int lo = j + 1;
        //                 int hi = nums.length - 1;
        //                 int sum = target - nums[i] - nums[j];
        //                 while(lo < hi){
        //                     if(nums[lo] + nums[hi] == sum){
        //                         res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
        //                         while(lo < hi && nums[lo] == nums[lo + 1]) lo++;
        //                         while(lo < hi && nums[hi] == nums[hi - 1]) hi--;
        //                         lo++;
        //                         hi--;
        //                     } else if(nums[lo] + nums[hi] < sum){
        //                         lo++;
        //                     } else {
        //                         hi--;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        // return res;

        //method 2: using hashset
        // Set<List<Integer>> res = new HashSet<>();
        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length - 3; i++){
        //     for(int j = i + 1; j < nums.length - 2; j++){
        //         int lo = j + 1;
        //         int hi = nums.length - 1;
        //         int sum = target - nums[i] - nums[j];
        //         while(lo < hi){
        //             if(nums[lo] + nums[hi] == sum){
        //                 res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
        //                 lo++;
        //                 hi--;
        //             } else if(nums[lo] + nums[hi] < sum){
        //                 lo++;
        //             } else {
        //                 hi--;
        //             }
        //         }
        //     }
        // }

        // return new ArrayList<>(res);

        //method 3: using brute force
        // Set<List<Integer>> res = new HashSet<>();
        // for(int i = 0; i < nums.length - 3; i++){
        //     for(int j = i + 1; j < nums.length - 2; j++){
        //         for(int k = j + 1; k < nums.length - 1; k++){
        //             for(int l = k + 1; l < nums.length; l++){
        //                 if(nums[i] + nums[j] + nums[k] + nums[l] == target){
        //                     List<Integer> temp = new ArrayList<>();
        //                     temp.add(nums[i]);
        //                     temp.add(nums[j]);
        //                     temp.add(nums[k]);
        //                     temp.add(nums[l]);
        //                     Collections.sort(temp);
        //                     res.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }

        // return new ArrayList<>(res);

        //it gives wrong output when case is [1000000000,1000000000,1000000000,1000000000] and target is -294967296
        //method 4: using hashmap
        // Map<Long, List<int[]>> map = new HashMap<>();
        // Set<List<Integer>> res = new HashSet<>();
        // int n = nums.length;
        
        // if (n < 4) return new ArrayList<>(res);

        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         long sum = (long) nums[i] + nums[j];
        //         if (map.containsKey((long) target - sum)) {
        //             for (int[] pair : map.get((long) target - sum)) {
        //                 List<Integer> temp = Arrays.asList(pair[0], pair[1], nums[i], nums[j]);
        //                 Collections.sort(temp);
        //                 res.add(temp);
        //             }
        //         }
        //     }
        //     for (int k = 0; k < i; k++) {
        //         long sum = (long) nums[k] + nums[i];
        //         if (!map.containsKey(sum)) {
        //             map.put(sum, new ArrayList<>());
        //         }
        //         map.get(sum).add(new int[]{nums[k], nums[i]});
        //     }
        // }

        // return new ArrayList<>(res);

        //method 5: using arraylist
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        
        Arrays.sort(nums); // Sort the array to use two-pointer technique

        for (int i = 0; i < nums.length - 3; i++) {
            // Avoid duplicate results
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Avoid duplicate results
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                int left = j + 1;
                int right = nums.length - 1;
                long target2 = (long) target - nums[i] - nums[j];
                
                while (left < right) {
                    long sum = (long) nums[left] + nums[right];
                    if (sum == target2) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        // Avoid duplicate results
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target2) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res;

    }
}