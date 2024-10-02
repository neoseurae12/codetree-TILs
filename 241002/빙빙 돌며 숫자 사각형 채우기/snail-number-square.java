import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {

    // n: row 개수, m: column 개수
    public static int n, m;
    public static int[][] arr;

    public static int[] dn = new int[]{0, 1, 0, -1};   // 세로
    public static int[] dm = new int[]{1, 0, -1, 0};   // 가로

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][m];

        int r = 0;
        int c = 0;
        int dir = 0;

        arr[0][0] = 1;

        for (int i = 2; i <= n * m; i++) {
            int nr = r + dn[dir];
            int nc = c + dm[dir];

            // 방향대로 전진
            if (inRange(nr, nc) && arr[nr][nc] == 0) {
                arr[nr][nc] = i;
                r = nr;
                c = nc;
            }
            // 방향 전환 & 전진
            else {
                dir = (dir + 1) % 4;
                r += dn[dir];
                c += dm[dir];
                arr[r][c] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}