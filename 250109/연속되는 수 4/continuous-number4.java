import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            // Case 1: 이전에 비해 증가한 경우 -> cnt++
            if (i > 0 && arr[i-1] < arr[i])
                cnt++;
            // Case 2: 첫 번째인 경우 -> cnt = 1
            // Case 3: 이전에 비해 증가하지 않은 경우 (cf. 동일 --> '증가'라고 보지 않음) -> cnt = 1
            else
                cnt = 1;

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}