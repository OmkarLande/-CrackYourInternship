//3Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //method 1: using two pointers
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int lo = i + 1;
                int hi = nums.length - 1;
                int sum = 0 - nums[i];
                while(lo < hi){
                    if(nums[lo] + nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while(lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while(lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if(nums[lo] + nums[hi] < sum){
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return res;

        //method 2: using hashset
        // Set<List<Integer>> res = new HashSet<>();
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length - 2; i++){
        //     int lo = i + 1;
        //     int hi = nums.length - 1;
        //     int sum = 0 - nums[i];
        //     while(lo < hi){
        //         if(nums[lo] + nums[hi] == sum){
        //             res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
        //             lo++;
        //             hi--;
        //         } else if(nums[lo] + nums[hi] < sum){
        //             lo++;
        //         } else {
        //             hi--;
        //         }
        //     }
        // }

        // return new ArrayList<>(res);

        //method 3: using brute force
        // Set<List<Integer>> res = new HashSet<>();
        // for(int i = 0; i < nums.length - 2; i++){
        //     for(int j = i + 1; j < nums.length - 1; j++){
        //         for(int k = j + 1; k < nums.length; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> temp = new ArrayList<>();
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 Collections.sort(temp);
        //                 res.add(temp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(res);
    }
}