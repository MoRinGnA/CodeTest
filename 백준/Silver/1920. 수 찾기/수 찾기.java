import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        int N = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(scanner.nextInt(), 0);
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; i++) {

            int C = scanner.nextInt();

            if (map.containsKey(C)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }
}