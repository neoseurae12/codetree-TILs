import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            // Case 1: 현재와 이전의 부호가 동일한 경우
            if (i >= 1 && arr[i] * arr[i-1] > 0)
                cnt++;
            // Case 2: 첫 번째인 경우
            // Case 3: 현재와 이전의 부호가 다른 경우
            else
                cnt = 1;

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}