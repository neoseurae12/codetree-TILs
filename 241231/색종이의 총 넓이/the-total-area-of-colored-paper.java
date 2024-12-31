import java.util.Scanner;

public class Main {
    public static final int PAPER_SIZE = 8;
    public static final int OFFSET = 100;
    public static final int MAX_R = 100 * 2 + 1;

    public static int n;
    public static int[][] grid = new int[MAX_R][MAX_R];
    public static int[][] squares = new int[100][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            squares[i][0] = sc.nextInt() + OFFSET;
            squares[i][1] = sc.nextInt() + OFFSET;
        }

        for (int i = 0; i < n; i++) {
            for (int j = squares[i][0]; j < squares[i][0] + PAPER_SIZE; j++) {
                for (int k = squares[i][1]; k < squares[i][1] + PAPER_SIZE; k++) {
                    grid[j][k]++;
                }
            }
        }

        int area = 0;

        for (int i = 0; i < MAX_R; i++) {
            for (int j = 0; j < MAX_R; j++) {
                if (grid[i][j] > 0)
                    area++;
            }
        }

        System.out.println(area);
    }
}