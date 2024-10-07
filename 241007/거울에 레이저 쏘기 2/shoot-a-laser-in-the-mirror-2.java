import java.util.Scanner;

public class Main {

    // out: 북 서 남 동
    public static int[] slashDr = new int[]{-1, 0, 1, 0};  // 세로
    public static int[] slashDc = new int[]{0, -1, 0, 1};  // 가로
    public static int[] backSlashDr = new int[]{1, 0, -1, 0};  // 세로
    public static int[] backSlashDc = new int[]{0, 1, 0, -1};  // 가로

    public static int N, K;
    public static char[][] grid;

    public static int r, c, dir;
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        N = sc.nextInt();
        
        grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < N; j++) {
                grid[i][j] = row.charAt(j);
            }
        }

        K = sc.nextInt();

        // 연산
        r = whereStartR();
        c = whereStartC();
        dir = whatStartDir();

        while (inRange()) {
            reflect();
        }

        System.out.println(cnt);
    }

    public static int whereStartR() {
        if (K >= 1 && K <= N) return 0;
        else if (K > N * 2 && K <= N * 3) return N - 1;
        else {
            if (K <= N * 2)
                return K - N - 1;
            else
                return N * 4 - K;
        }
    }

    public static int whereStartC() {
        if (K > N * 3 && K <= N * 4) return 0;
        else if (K > N && K <= N * 2) return N -1;
        else {
            if (K <= N)
                return K - 1;
            else
                return N * 3 - K;
        }
    }

    public static int whatStartDir() {
        if (K <= N)
            return 0;
        else if (K <= N * 2)
            return 1;
        else if (K <= N * 3)
            return 2;
        else
            return 3;
    }

    public static boolean inRange() {
        return (r >= 0 && r < N && c >= 0 && c < N);
    }

    public static void reflect() {
        if (grid[r][c] == '/') {
            dir = getSlashNextDir();
            r += slashDr[dir];
            c += slashDc[dir];
        }
        else {  // grid[r][c] == '\'
            dir = getBackSlashNextDir();
            r += backSlashDc[dir];
            c += backSlashDc[dir];
        }

        cnt++;
    }

    public static int getSlashNextDir() {
        // out: 북 서 남 동
        if (dir == 0) return 3;
        else if (dir == 1) return 2;
        else if (dir == 2) return 1;
        else return 0;
    }

    public static int getBackSlashNextDir() {
        if (dir == 0) return 1;
        else if (dir == 1) return 0;
        else if (dir == 2) return 3;
        else return 2;
    }
}