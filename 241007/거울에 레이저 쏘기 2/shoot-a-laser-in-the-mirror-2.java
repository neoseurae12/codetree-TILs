import java.util.Scanner;

public class Main {

    public static int N, K;
    public static char[][] grid;

    // 0: 동, 1: 남, 2: 서, 3: 북
    public static int[] slashNextDir = new int[]{3, 2, 1, 0};
    public static int[] backSlashNextDir = new int[]{1, 0, 3, 2};

    public static int[] dr = new int[]{0, 1, 0, -1};
    public static int[] dc = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        N = sc.nextInt();
        grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        K = sc.nextInt();

        // 연산
        int currentDir = kToDir();
        int currentR = kToR();
        int currentC = kToC();

        int cnt = 0;

        while (inRange(currentR, currentC)) {
            if (grid[currentR][currentC] == '/') {
                currentDir = slashNextDir[currentDir];
            }
            else {  // grid[currentR][currentC] == '\'
                currentDir = backSlashNextDir[currentDir];
            }

            currentR += dr[currentDir];
            currentC += dc[currentDir];
            cnt++;
        }
        
        // 출력
        System.out.println(cnt);
    }

    public static boolean inRange(int r, int c) {
        return (r >= 0 && r < N && c >= 0 && c < N);
    }

    public static int kToDir() {
        // 0: 동, 1: 남, 2: 서, 3: 북
        if (K <= N)
            return 1;
        else if (K <= 2 * N)
            return 2;
        else if (K <= 3 * N)
            return 3;
        else
            return 0;
    }

    public static int kToR() {
        if (K <= N)
            return 0;
        else if (K <= 2 * N)
            return K - (N + 1);
        else if (K <= 3 * N)
            return N - 1;
        else
            return 4 * N - K;
    }

    public static int kToC() {
        if (K <= N)
            return K - 1;
        else if (K <= 2 * N)
            return N - 1;
        else if (K <= 3 * N)
            return 3 * N - K;
        else
            return 0;
    }
}