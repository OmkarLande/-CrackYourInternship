import java.util.Arrays;

class Solutions {
    public void sortColors(int[] nums){
        // method 1: Dutch National Flag Algorithm
        // int low = 0;
        // int mid = 0;
        // int high = nums.length - 1;
        // while(mid <= high){
        //     if(nums[mid] == 0){
        //         int temp = nums[low];
        //         nums[low] = nums[mid];
        //         nums[mid] = temp;
        //         low++;
        //         mid++;
        //     }
        //     else if(nums[mid] == 1){
        //         mid++;
        //     }
        //     else{
        //         int temp = nums[mid];
        //         nums[mid] = nums[high];
        //         nums[high] = temp;
        //         high--;
        //     }
        // }

        // method 2: using sorting
        // Arrays.sort(nums);

        // method 3: using two pointers
        // int low = 0;
        // int high = nums.length - 1;
        // int i = 0;
        // while(i <= high){
        //     if(nums[i] == 0){
        //         int temp = nums[low];
        //         nums[low] = nums[i];
        //         nums[i] = temp;
        //         low++;
        //         i++;
        //     }
        //     else if(nums[i] == 2){
        //         int temp = nums[high];
        //         nums[high] = nums[i];
        //         nums[i] = temp;
        //         high--;
        //     }
        //     else{
        //         i++;
        //     }
        // }
    }
}