import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        int answer = 0;

        while (pq.peek() < K) {
            if (pq.size() < 2) {
                return -1;
            }
            int f = pq.poll();
            int s = pq.poll();
            pq.add(f + (s * 2));
            answer++;
        }
        return answer;
    }
}