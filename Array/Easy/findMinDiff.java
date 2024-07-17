import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if( m == 0 || n == 0) return 0;
        if(m>n) return -1;

        Collections.sort(a);
        
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; i<=n-m; i++){
            int diff = a.get(m+i-1) - a.get(i);
             if (diff < minDiff) minDiff = diff;
        }
        
        return minDiff;

    }
}