import java.util.Scanner;

public class Main {
    public static int n, t;
    public static int[] arr = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        t = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            // T보다 크다면 -> cnt++
            if (arr[i] > t) {
                cnt++;
            }
            // T보다 작거나 같다면 -> cnt = 0
            else {
                cnt = 0;
            }

            ans = Math.max(cnt, ans);
        }

        System.out.println(ans);
    }
}