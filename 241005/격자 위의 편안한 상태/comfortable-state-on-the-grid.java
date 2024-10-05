import java.util.Scanner;

public class Main {

    public static int N, M;
    public static boolean[][] grid;
    public static int[][] paintingPositions;

    // 북 동 남 서
    public static int[] dr = new int[]{-1, 0, 1, 0};   // 세로
    public static int[] dc = new int[]{0, 1, 0, -1};   // 가로

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        grid = new boolean[N][N];
        paintingPositions = new int[M][2];

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            paintingPositions[i][0] = r;
            paintingPositions[i][1] = c;
        }

        for (int i = 0; i < M; i++) {
            int r = paintingPositions[i][0];
            int c = paintingPositions[i][1];

            grid[r][c] = true;

            boolean isStable = checkStabilityOf(r, c);

            if (isStable)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    public static boolean checkStabilityOf(int r, int c) {
        int cnt = 0;
        
        // 4 방위 다 살펴보기
        for (int dir = 0; dir < 4; dir++) {
            int lr = r + dr[dir];
            int lc = c + dc[dir];
            if (inRange(lr, lc) && grid[lr][lc]) {
                cnt++;
            }
        }

        if (cnt == 3) {
            return true;
        }

        return false;
    }

    public static boolean inRange(int r, int c) {
        return (r >= 0 && r < N && c >= 0 && c < N);
    }
}