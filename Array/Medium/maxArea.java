//Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        //method 1: using two pointers
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int h = Math.min(height[i], height[j]);
            max = Math.max(max, h * (j - i));
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return max;
        
        //method 2: using brute force
        // int max = 0;
        // for(int i = 0; i < height.length; i++){
        //     for(int j = i + 1; j < height.length; j++){
        //         int h = Math.min(height[i], height[j]);
        //         max = Math.max(max, h * (j - i));
        //     }
        // }
        // return max;

    }
}