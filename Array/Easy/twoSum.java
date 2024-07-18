
import java.util.HashMap;
import java.util.Map;

//1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //method 1: using brute force
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        //method 2: using hashmap
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int targetSum = target - nums[i];
            if(map.containsKey(targetSum)){
                return new int[] {map.get(targetSum), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};

        //method 3: using two pass
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i<nums.length; i++){
        //     map.put(nums[i], i);
        // }
        // for(int i = 0; i<nums.length; i++){
        //     int targetSum = target - nums[i];
        //     if(map.containsKey(targetSum) && map.get(targetSum) != i){
        //         return new int[] {i, map.get(targetSum)};
        //     }
        // }
        // return new int[]{};

    }
}