import java.util.*;

class Solution {
    static ArrayList<Integer>[] neighbors;
    static int[] ds;
    static int maxd;

    public int solution(int n, int[][] edge) {
        int answer = 0;

        // 계산을 위한 이웃 배열 추가
        neighbors = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            neighbors[i] = new ArrayList<>();
        }
        // 양방향 링크를 구현하기 위한 반복문 선언
        for (int[] e : edge) {
            int a = e[0], b = e[1];
            neighbors[a].add(b);
            neighbors[b].add(a);
        }

        BFS(1, n);

        // 배열에 기록된 거리와 최대거리를 비교하여
        for (int i = 1; i <= n; i++) {
            if (ds[i] == maxd) {
                answer++;
            } // 최대거리를 가진 노드의 수를 카운트함
        }
        // 카운트한 최대 거리를 가진 노드의 수를 반환함
        return answer;
    }

    static void BFS(int start, int n) {
        ds = new int[n + 1];
        Arrays.fill(ds, -1);
        // 거리를 저장하기 위한 배열을 -1로 초기화

        // 큐를 사용하여 거리정보를 포함한 노드를 저장함
        var queue = new ArrayDeque<int[]>();
        queue.add(new int[] { start, 0 });
        maxd = 0;
        // 최대거리를 저장할 변수 지정 및 초기화

        // 노드들이 저장되어 있는 큐가 빌 때까지 반복됨
        while (queue.size() > 0) {
            int[] u = queue.remove();
            int node = u[0], d = u[1];
            // 제일 먼저 큐에 있는 노드를 u에 저장함
            // 노드번호와 거리를 계산하기 위해 변수에 따로 저장함

            // 만약 이미 방문된 노드라면 continue 함
            if (ds[node] >= 0)
                continue;
            ds[node] = d;
            // 방문하지 않은 노드라면 최단거리를 저장함

            // 만약 현재 거리가 지금까지의 최대거리보다 크다면
            if (d > maxd) {
                maxd = d;
            }
            // 최대거리 갱신

            for (int neighbor : neighbors[node]) {
                if (ds[neighbor] == -1) {
                    queue.add(new int[] { neighbor, d + 1 });
                } // 만약 방문하지 않은 곳이라면 다음에 방문하기 위해 큐에 추가함
            }
        }
    }
}