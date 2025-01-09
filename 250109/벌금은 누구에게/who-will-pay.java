import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int n, m, k;
    public static int[] students = new int[MAX_N + 1];  // 학생 1부터

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n, m, k 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int ans = -1;
        while (m-- > 0) {
            // p 입력 받기 -> students[p]++ -> k 이상인가 체크

            int p = sc.nextInt();
            students[p]++;

            // k 이상인 경우 -> p 출력
            if (students[p] >= k) {
                ans = p;
                break;
            }
        }

        System.out.println(ans);
    }
} 