import java.util.Scanner;

public class Main {

    public static int n;
    public static int[][] grid;

    public static int[] dx = new int[]{1, 0, -1, 0};
    public static int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int threeOrMore = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (check(i, j) >= 3) {
                    threeOrMore++;
                }
            }
        }

        System.out.println(threeOrMore);
    }

    public static int check(int row, int column) {
        int cnt = 0;

        // 동 -> 남 -> 서 -> 북 체크
        for (int dirNum = 0; dirNum < 4; dirNum++) {
            int nx = row + dx[dirNum];
            int ny = column + dy[dirNum];
            if (inRange(nx, ny) && grid[nx][ny] == 1)
                cnt++;
        }

        return cnt;
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
}