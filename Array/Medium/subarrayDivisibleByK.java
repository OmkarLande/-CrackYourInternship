//Subarray Sums Divisible by K


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        //method 1: using hashmap
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int mod = (sum % k + k) % k;
            if(map.containsKey(mod)){
                count += map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return count;

        //method 2: using brute force
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum % k == 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //method 3: using prefix sum
        // int count = 0;
        // int n = nums.length;
        // int[] prefix = new int[n + 1];
        // for(int i = 0; i < n; i++){
        //     prefix[i + 1] = prefix[i] + nums[i];
        // }
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j <= n; j++){
        //         if((prefix[j] - prefix[i]) % k == 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;


    }
}