import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long left = 1, right = 0, middle = 0;
        long answer = 0;
        Arrays.sort(times);

        right = (long) times[times.length - 1] * n;
        while (left <= right) {
            middle = (left + right) / 2;

            if (compare(n, times, middle) == 1) {
                right = middle - 1;
                answer = middle;

            } else {
                left = middle + 1;
            }
        }
        return answer;
    }

    public long compare(int n, int[] times, long middle) {
        long count = 0;
        for (int i = 0; i < times.length; i++) {
            count += middle / times[i];

            if (count >= n) {
                return 1;
            }
        }
        return -1;
    }
}