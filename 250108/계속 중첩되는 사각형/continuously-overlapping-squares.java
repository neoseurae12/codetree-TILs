import java.util.Scanner;

public class Main {
    public static final int MAX_R = 100 * 2 + 1;
    public static final int OFFSET = 100;
    public static final int N = 10;
    public static final int RED = 1;
    public static final int BLUE = -1;

    public static int[][] grid = new int[MAX_R][MAX_R];

    public static int n;
    public static int[] x1 = new int[N];
    public static int[] y1 = new int[N];
    public static int[] x2 = new int[N];
    public static int[] y2 = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
        }

        int currentColor = RED;

        for (int i = 0; i < n; i++) {
            // 사각형 칠하기
            for (int x = x1[i]; x < x2[i]; x++) {
                for (int y = y1[i]; y < y2[i]; y++) {
                    grid[x][y] = currentColor;
                }
            }

            // 색상 변경
            currentColor *= -1;
        }

        int area = 0;

        for (int i = 0; i < MAX_R; i++) {
            for (int j = 0; j < MAX_R; j++) {
                if (grid[i][j] == BLUE)
                    area++;
            }
        }

        System.out.println(area);
    }
}