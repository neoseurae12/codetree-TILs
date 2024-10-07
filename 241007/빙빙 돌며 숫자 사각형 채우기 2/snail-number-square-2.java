import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {

    public static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] grid = new int[n][m];

        int r = 0;
        int c = 0;
        int dir = 0;

        // 남 동 북 서
        int[] dr = new int[]{1, 0, -1, 0}; // 세로
        int[] dc = new int[]{0, 1, 0, -1}; // 가로

        for (int num = 1; num <= n * m; num++) {
            grid[r][c] = num;

            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (!inRange(nr, nc) || grid[nr][nc] != 0) {
                dir = (dir + 1) % 4;
                r += dr[dir];
                c += dc[dir];
            }
            else {
                r = nr;
                c = nc;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(grid[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static boolean inRange(int r, int c) {
        return (r >= 0 && r < n && c >= 0 && c < m);
    }
}