class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        while(m != 0) {
            int c = n % m;
            n = m;
            m = c;
        }
        int min = n;
        int max = (n * m) / min;
      
        answer[0] = min;
        answer[1] = max;
        
        return answer;
        
        
    }
}