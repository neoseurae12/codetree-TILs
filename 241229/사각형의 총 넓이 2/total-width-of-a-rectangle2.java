import java.util.Scanner;

public class Main {
    public static final int MAX_R = 100 * 2 + 1;
    public static final int OFFSET = 100;

    public static int n;
    public static int[][] grid = new int[MAX_R][MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + OFFSET;
            int y1 = sc.nextInt() + OFFSET;
            int x2 = sc.nextInt() + OFFSET;
            int y2 = sc.nextInt() + OFFSET;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                        grid[j][k]++;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < MAX_R; i++) {
            for (int j = 0; j < MAX_R; j++) {
                if (grid[i][j] > 0)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}