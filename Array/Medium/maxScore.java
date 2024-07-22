//Maximum Points You Can Obtain from Cards

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //method 1: using two pointers
        int n = cardPoints.length;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += cardPoints[i];
        }
        int max = sum;
        for(int i = 0; i < k; i++){
            sum += cardPoints[n - 1 - i] - cardPoints[k - 1 - i];
            max = Math.max(max, sum);
        }
        return max;

        //method 2: using brute force
        // int n = cardPoints.length;
        // int max = 0;
        // for(int i = 0; i <= k; i++){
        //     int sum = 0;
        //     for(int j = 0; j < i; j++){
        //         sum += cardPoints[j];
        //     }
        //     for(int j = n - 1; j >= n - (k - i); j--){
        //         sum += cardPoints[j];
        //     }
        //     max = Math.max(max, sum);
        // }
        // return max;

        //method 3: using prefix sum
        // int n = cardPoints.length;
        // int[] prefix = new int[n + 1];
        // for(int i = 0; i < n; i++){
        //     prefix[i + 1] = prefix[i] + cardPoints[i];
        // }
        // int max = 0;
        // for(int i = 0; i <= k; i++){
        //     max = Math.max(max, prefix[i] + prefix[n] - prefix[n - (k - i)]);
        // }
        // return max;

        //method 4: using suffix sum
        // int n = cardPoints.length;
        // int[] suffix = new int[n + 1];
        // for(int i = 0; i < n; i++){
        //     suffix[i + 1] = suffix[i] + cardPoints[n - 1 - i];
        // }
        // int max = 0;
        // for(int i = 0; i <= k; i++){
        //     max = Math.max(max, suffix[i] + suffix[n] - suffix[n - (k - i)]);
        // }
        // return max;

        //method 5: using sliding window
        // int n = cardPoints.length;
        // int sum = 0;
        // for(int i = 0; i < k; i++){
        //     sum += cardPoints[i];
        // }
        // int max = sum;
        // for(int i = 0; i < k; i++){
        //     sum += cardPoints[n - 1 - i] - cardPoints[k - 1 - i];
        //     max = Math.max(max, sum);
        // }
        // return max;
    }
}