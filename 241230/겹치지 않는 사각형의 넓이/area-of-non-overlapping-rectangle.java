import java.util.Scanner;

public class Main {
    public static int N = 3;
    public static int OFFSET = 1000;
    public static int MAX_R = 1000 * 2 + 1;

    public static int[] x1 = new int[N];
    public static int[] y1 = new int[N];
    public static int[] x2 = new int[N];
    public static int[] y2 = new int[N];

    public static int[][] grid = new int[MAX_R][MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        for (int i = 0; i < N; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                for (int k = y1[i]; k < y2[i]; k++) {
                    grid[j][k] = i + 1;
                }
            }
        }

        int area = 0;

        for (int i = 0; i < MAX_R; i++)
            for (int j = 0; j < MAX_R; j++)
                if (grid[i][j] == 1 || grid[i][j] == 2)
                    area++;

        System.out.println(area);
    }
}