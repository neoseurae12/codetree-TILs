import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

            if ((i + 1) % 2 != 0) { // 홀수 번째일 경우
                Arrays.sort(nums, 0, i + 1);    // 주의할 점: Arrays.sort() 함수의 범위 지정
                System.out.print(nums[i / 2] + " ");
            }
        }
    }
}