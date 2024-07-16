import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        // first approach
        // Floyd's Tortoise and Hare (Cycle Detection)
        // int slow = nums[0];
        // int fast = nums[0];
        
        // do {
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // } while(slow != fast);
        
        // slow = nums[0];
        
        // while(slow != fast) {
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }
        
        // return slow;

        // second approach
        // using boolean array
        // boolean b[] = new boolean[nums.length];
        // for(int i : nums)
        // {
        //   if(b[i]) return i;
        //   b[i] = true;
        // }
        // return -1;

        // third approach
        // using sorting
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length - 1; i++){
        //   if(nums[i] == nums[i + 1]) return nums[i];
        // }
        return -1;

    }
}
