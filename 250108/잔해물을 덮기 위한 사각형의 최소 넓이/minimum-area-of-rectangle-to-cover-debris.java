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

        int area = 0;

        if ((x[1] >= x[3] && x[2] <= x[4]) && ((y[3] <= y[1] && y[1] <= y[4]) || (y[3] <= y[2] && y[2] <= y[4]))) {
            // 한 쪽 부분을 가리는 경우 (가로 버전) -> 안 가려진 나머지 한 쪽 부분의 넓이
            for (int i = 0; i < MAX_R; i++) {
                for (int j = 0; j < MAX_R; j++) {
                    if (grid[i][j] == 1)
                        area++;
                }
            }
        }
        else if ((y[1] >= y[3] && y[2] <= y[4]) && ((x[3] <= x[1] && x[1] <= x[4]) || (x[3] <= x[2] && x[2] <= x[4]))) {
            // 한 쪽 부분을 가리는 경우 (세로 버전) -> 안 가려진 나머지 한 쪽 부분의 넓이
            for (int i = 0; i < MAX_R; i++) {
                for (int j = 0; j < MAX_R; j++) {
                    if (grid[i][j] == 1)
                        area++;
                }
            }
        } 
        else {
            // 나머지 경우 (cf. 애매하게 가리는 경우, 아예 안 가리는 경우, 완전 가리는 경우 등) -> 첫 번째 사각형의 넓이
            // 아예 안 가리는 경우 -> area == 0 이 될 거라 문제 없음
            for (int i = 0; i < MAX_R; i++) {
                for (int j = 0; j < MAX_R; j++) {
                    if (grid[i][j] == 1 || grid[i][j] == 3)
                        area++;
                }
            }
        }

        System.out.println(area);
    }
}