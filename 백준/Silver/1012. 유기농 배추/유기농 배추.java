import java.io.*;
import java.util.*;

public class Main {

    static int R, C, K = 1;
    static int[][] A;
    static boolean[][] visited;

    static int graph() {
        visited = new boolean[R][C];
        int count = 0;
        
        for (int i = 0;i<R;i++) {
            for (int j=0;j<C;j++) {
                if (A[i][j] == K && !visited[i][j]) {
                    count++;
                    DFS(i, j);
                }
            }
        }
        return count;
    }

    static void DFS(int r, int c) {
        if (A[r][c] != K || visited[r][c])
            return;
        visited[r][c] = true;
        if (r > 0)
            DFS(r - 1, c);
        if (r < R - 1)
            DFS(r + 1, c);
        if (c > 0)
            DFS(r, c - 1);
        if (c < C - 1)
            DFS(r, c + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            A = new int[R][C];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                A[r][c] = 1;
            }

            System.out.println(graph());
        }
    }

}
