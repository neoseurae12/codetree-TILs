import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 1) // 홀수 번째 줄
                    cnt++;
                else // 짝수 번째 줄
                    cnt += 2;
                
                System.out.print(cnt + " ");
            }
            System.out.println();
        }
    }
}