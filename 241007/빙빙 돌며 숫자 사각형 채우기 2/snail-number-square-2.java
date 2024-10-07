import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {

    public static int n, m;

    public static int[][] grid;

    public static int r, c, dir;

    // 남 동 북 서
    public static int[] dr = new int[]{1, 0, -1, 0}; // 세로
    public static int[] dc = new int[]{0, 1, 0, -1}; // 가로

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        m = sc.nextInt();

        // 연산
        
        // 초기화
        grid = new int[n][m];
        r = 0;
        c = 0;
        dir = 0;

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

        // 출력
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