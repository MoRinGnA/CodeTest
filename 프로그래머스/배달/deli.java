import java.util.*;

public class deli {
    static ArrayList<int[]>[] edges;

    static int[] dikstra(int start, int N) {
        var diss = new int[N + 1];
        Arrays.fill(diss, -1);
        var visited = new boolean[N + 1];
        var queue = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
        queue.add(new int[] { start, 0 });
        while (queue.size() > 0) {
            int[] u = queue.remove();
            int node = u[0], dis = u[1];
            if (visited[node])
                continue;
            visited[node] = true;
            diss[node] = dis;
            for (int[] edge : edges[node]) {
                int neighbor = edge[0], cost = edge[1];
                queue.add(new int[] { neighbor, dis + cost });
            }
        }
        return diss;
    }

    public static int solution(int N, int[][] roads, int K) {
        int answer = 0;
        edges = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            edges[i] = new ArrayList<int[]>();
        }
        for (int[] road : roads) {
            int a = road[0], b = road[1], c = road[2];
            edges[a].add(new int[] { b, c });
            edges[b].add(new int[] { a, c });
        }
        int[] diss = dikstra(1, N);
        for (int i = 1; i <= N; i++) {
            if (diss[i] != -1 && diss[i] <= K) {
                answer++;
            }
        }
        return answer;

    }
}