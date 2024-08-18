import java.util.Scanner;
import java.util.Arrays;

// 최댓값을 최솟값과 묶는 것이 항상 최선이다.
    // 즉, 정렬한 뒤, 양끝끼리 대칭적으로 묶는다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();

        int[] nums = new int[2 * N];
        for (int i = 0; i < 2 * N; i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);

        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            int sum = nums[i] + nums[2 * N - 1 - i];
            if (sum > maxSum)
                maxSum = sum;
        }

        System.out.println(maxSum);
    }
}