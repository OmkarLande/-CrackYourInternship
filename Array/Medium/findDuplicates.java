// 442. Find All Duplicates in an Array
import java.util.ArrayList;
import java.util.List;

// Find All Duplicates in an Array
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //method 1: using extra space
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return result;

        //method 2: using swap
        // List<Integer> result = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
        //         int temp = nums[i];
        //         nums[i] = nums[temp - 1];
        //         nums[temp - 1] = temp;
        //     }
        //     if (nums[i] != i + 1 && nums[nums[i] - 1] == nums[i]) {
        //         result.add(nums[i]);
        //     }
        // }
        // return result;

        //method 3: using extra space
        // List<Integer> result = new ArrayList<>();
        // int[] count = new int[nums.length + 1];
        // for (int i = 0; i < nums.length; i++) {
        //     count[nums[i]]++;
        // }
        // for (int i = 0; i < count.length; i++) {
        //     if (count[i] == 2) {
        //         result.add(i);
        //     }
        // }
        // return result;


    }
}