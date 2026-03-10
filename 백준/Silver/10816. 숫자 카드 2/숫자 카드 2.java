import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < N; ++i) {
            int key = Integer.parseInt(tokenizer.nextToken());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int M = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < M; ++i) {
            int key = Integer.parseInt(tokenizer.nextToken());
            builder.append(map.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(builder.toString());
    }
}