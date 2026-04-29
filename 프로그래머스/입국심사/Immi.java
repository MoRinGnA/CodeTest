import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        int left = 1, right = 0, middle = 0;
        long answer = 0;
        Arrays.sort(times);
        
        right = times[times.length - 1] * n;
        middle = (left + right) / 2;
        
        answer = compare(n, times, middle);    
        return answer;
    }
    
    public long compare(int n, int[] times, long middle) {
        long count = 0;
        for (int i=0;i<times.length;i++) {
            count += middle/times[i];
            
            while(count > n){
                break;
            }
        }
        return count;
    }
}