import java.util.Scanner;

public class Main {
    public static int OFFSET = 1000;
    public static int MAX_R = 1000 * 2 + 1;

    public static int x1_a, y1_a, x2_a, y2_a;
    public static int x1_b, y1_b, x2_b, y2_b;
    public static int x1_m, y1_m, x2_m, y2_m;

    public static int[][] grid = new int[MAX_R][MAX_R];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x1_a = sc.nextInt();
        y1_a = sc.nextInt();
        x2_a = sc.nextInt();
        y2_a = sc.nextInt();

        x1_b = sc.nextInt();
        y1_b = sc.nextInt();
        x2_b = sc.nextInt();
        y2_b = sc.nextInt();

        x1_m = sc.nextInt();
        y1_m = sc.nextInt();
        x2_m = sc.nextInt();
        y2_m = sc.nextInt();

        for (int i = x1_a; i < x2_a; i++) {
            for (int j = y1_a; j < y2_a; j++) {
                grid[i][j] = 1;
            }
        }

        for (int i = x1_b; i < x2_b; i++) {
            for (int j = y1_b; j < y2_b; j++) {
                grid[i][j] = 2;
            }
        }

        for (int i = x1_m; i < x2_m; i++) {
            for (int j = y1_m; j < y2_m; j++) {
                grid[i][j] = 3;
            }
        }

        int area = 0;

        for (int i = 0; i < MAX_R; i++) {
            for (int j = 0; j < MAX_R; j++) {
                if (grid[i][j] == 1 || grid[i][j] == 2)
                    area++;
            }
        }

        System.out.println(area);
    }
}