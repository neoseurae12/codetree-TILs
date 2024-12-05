import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] grid = new int[n][n];

        int r, c, dr;
        r = n - 1;
        c = n - 1;
        dr = -1;

        for (int i = 1; i <= n * n; i++) {
            grid[r][c] = i;

            if (i % n == 0) {
                c--;    // 왼쪽으로
                dr *= -1;   // 위아래 방향 전환
            }
            else
                r += dr;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}