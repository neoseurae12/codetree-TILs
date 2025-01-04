import java.util.Scanner;

public class Main {
    public static final int MAX_R = 1000 * 2 + 1;
    public static final int OFFSET = 1000;

    public static int[] x = new int[4 + 1];
    public static int[] y = new int[4 + 1];
    public static int[][] grid = new int[MAX_R][MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            x[i] = sc.nextInt() + OFFSET;
            y[i] = sc.nextInt() + OFFSET;
        }

        for (int i = x[1]; i < x[2]; i++) {
            for (int j = y[1]; j < y[2]; j++) {
                grid[i][j] = 1;
            }
        }

        for (int i = x[3]; i < x[4]; i++) {
            for (int j = y[3]; j < y[4]; j++) {
                if (grid[i][j] == 1)
                    grid[i][j] = 3; // 겹치는 부분
                else
                    grid[i][j] = 2;
            }
        }

        // 완전 가리는 경우 -> 0
        boolean horizontal = x[1] >= x[3] && x[2] <= x[4];
        boolean vertical = y[1] >= y[3] && y[2] <= y[4];
        if (horizontal && vertical) {
            System.out.println(0);
            return;
        }

        // 부분적으로 가리는 경우

        int area = 0;

        // 한쪽 부분을 가리는 경우 -> 다른 쪽 부분의 넓이
        if ((horizontal && !vertical) || (!horizontal && vertical)) {
            for (int i = x[1]; i < x[2]; i++) {
                for (int j = y[1]; j < y[2]; j++) {
                    if (grid[i][j] == 1)
                        area++;
                }
            }

            System.out.println(area);
            return;
        }

        // 애매하게 가리는 경우 -> 첫 번째 사각형의 넓이
        // 완전 안 가리는 경우 -> 첫 번째 사각형의 넓이
        for (int i = 0; i < MAX_R; i++) {
            for (int j = 0; j < MAX_R; j++) {
                if (grid[i][j] == 1 || grid[i][j] == 3)
                    area++;
            }
        }

        System.out.println(area);
    }
}