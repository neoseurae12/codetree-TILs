import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        int[][] arr2d_1, arr2d_2, arr2d_new;

        n = sc.nextInt();
        m = sc.nextInt();

        arr2d_1 = new int[n][m];
        arr2d_2 = new int[n][m];
        arr2d_new = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d_1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d_2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr2d_1[i][j] == arr2d_2[i][j])
                    arr2d_new[i][j] = 0;
                else
                    arr2d_new[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d_new[i][j] + " ");
            }
            System.out.println();
        }
    }
}