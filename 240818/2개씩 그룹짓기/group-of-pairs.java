import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();

        int maxSum = 0;
        int[] nums = new int[2 * N];
        for (int i = 0; i < 2 * N; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);

        for (int i = 0; i < N; i++) {
            int sum = nums[i] + nums[2 * N - 1 - i];
            if (sum > maxSum)
                maxSum = sum;
        }

        System.out.println(maxSum);
    }
}