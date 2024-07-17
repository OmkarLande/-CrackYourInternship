// package Array.Easy;

class Solution {
    public int removeDuplicates(int[] nums) {
        // method 1: using two pointers
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

        // method 2: using set
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     set.add(nums[i]);
        // }
        // int i = 0;
        // for(int num : set){
        //     nums[i] = num;
        //     i++;
        // }
        // return set.size();

        // method 3: using sorting
        // Arrays.sort(nums);
        // int i = 0;
        // for(int j = 1; j < nums.length; j++){
        //     if(nums[i] != nums[j]){
        //         i++;
        //         nums[i] = nums[j];
        //     }
        // }
        // return i + 1;

        // method 4: using list
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(!list.contains(nums[i])){
        //         list.add(nums[i]);
        //     }
        // }
        // for(int i = 0; i < list.size(); i++){
        //     nums[i] = list.get(i);
        // }

        // return list.size();

        // method 5: using map
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i], i);
        // }
        // int i = 0;
        // for(int num : map.keySet()){
        //     nums[i] = num;
        //     i++;
        // }
        // return map.size();

        // method 6: using set and list
        // Set<Integer> set = new HashSet<>();
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(!set.contains(nums[i])){
        //         set.add(nums[i]);
        //         list.add(nums[i]);
        //     }
        // }
        // for(int i = 0; i < list.size(); i++){
        //     nums[i] = list.get(i);
        // }
        // return set.size();


    }
}