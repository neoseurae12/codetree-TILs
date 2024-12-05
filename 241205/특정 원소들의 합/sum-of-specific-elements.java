import java.util.Scanner;

public class Main {
    public static int GRID_SIZE = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[GRID_SIZE][GRID_SIZE];
        int sum = 0;

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j <= i; j++) {
                sum += grid[i][j];
            }
        }

        System.out.println(sum);
    }
}