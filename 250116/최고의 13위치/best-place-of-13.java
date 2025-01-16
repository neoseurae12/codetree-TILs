import java.util.Scanner;

public class Main {
    public static final int MAX_N = 20;
    public static final int SUB_GRID = 3;

    public static int n;
    public static int[][] grid = new int[MAX_N][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: n
        n = sc.nextInt();
        // 입력: 격자 정보
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // 1 * 3 격자의 최대 동전의 개수 구하기 by 완전탐색
        int maxCoin = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - SUB_GRID; j++) {
                int numCoin = 0;
                for (int k = 0; k < SUB_GRID; k++)
                    numCoin += grid[i][j + k];
                maxCoin = Math.max(maxCoin, numCoin);
            }
        }

        // 출력: 최대 동전의 개수
        System.out.println(maxCoin);
    }
}