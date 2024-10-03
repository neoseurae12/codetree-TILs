import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int N;
    public static int[][] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        nums = new int[N][2];
        for (int i = 0; i < N; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = i;
        }

        Arrays.sort(nums, (n1, n2) -> {
            if (n1[0] == n2[0])
                return n1[1] - n2[1];

            return n1[0] - n2[0];
        });
        // (1, 1) (1, 6) (2, 3) (3, 0) (6, 2) (7 4) (30 5)

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[nums[i][1]] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }
}