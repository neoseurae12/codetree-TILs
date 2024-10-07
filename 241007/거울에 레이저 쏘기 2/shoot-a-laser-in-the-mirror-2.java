import java.util.Scanner;

public class Main {

    public static int N, K;
    public static char[][] grid;

    public static int currentDir;
    public static int currentR;
    public static int currentC;

    // 0: 동, 1: 남, 2: 서, 3: 북
    public static int[] dr = new int[]{0, 1, 0, -1};
    public static int[] dc = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        N = sc.nextInt();
        grid = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++)
                grid[i][j] = line.charAt(j);
        }
        K = sc.nextInt();

        // 연산
        initialize();
        int cnt = 0;

        while (inRange(currentR, currentC)) {
            // 0: 동, 1: 남, 2: 서, 3: 북
            if (grid[currentR][currentC] == '/')
                // 남(1) <-> 서(2), 북(3) <-> 동(0)
                currentDir = 3 - currentDir;
            else  // grid[currentR][currentC] == '\'
                // 남(1) <-> 동(0), 서(2) <-> 북(3)
                currentDir = currentDir ^ 1;    // 비트 XOR 연산

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

    public static void initialize() {
        // 0: 동, 1: 남, 2: 서, 3: 북
        if (K <= N) {
            currentDir = 1;
            currentR = 0;
            currentC = K - 1;
        }
        else if (K <= 2 * N) {
            currentDir = 2;
            currentR = K - (N + 1);
            currentC = N - 1;
        }
        else if (K <= 3 * N) {
            currentDir = 3;
            currentR = N - 1;
            currentC = 3 * N - K;
        }
        else {
            currentDir = 0;
            currentR = 4 * N - K;
            currentC = 0;
        }
    }
}