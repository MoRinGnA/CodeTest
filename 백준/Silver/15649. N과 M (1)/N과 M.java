import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] selected;
    static boolean[] visited;
    static Writer wr = new BufferedWriter(new OutputStreamWriter(System.out));

    static void DFS(int D) throws IOException {
        if (D == M) {
            for (int i : selected) {
                wr.write(i + " ");
            }
            wr.write("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[D] = i;
                DFS(D + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M];
        visited = new boolean[N + 1];

        DFS(0);
        wr.close();
    }
}