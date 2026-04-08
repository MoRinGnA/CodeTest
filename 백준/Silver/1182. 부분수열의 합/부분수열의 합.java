import java.util.*;

public class Main {

    public static int n, s;
    public static int[] array;
    public static int count = 0;

    public static void seq(int index, int sum) {
        if (index == n) {
            if (sum == s) {
                count++;
            }
            return;
        }
        seq(index + 1, sum);
        seq(index + 1, sum + array[index]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();

        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        seq(0, 0);

        if (s == 0) {
            count--;
        }
        System.out.println(count);
        sc.close();
    }
}
