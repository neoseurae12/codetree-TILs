import java.util.Scanner;

public class Main {
    public static final int MAX_R = 15;
    public static final int MAX_C = 15;

    public static int r, c;
    public static char[][] grid = new char[MAX_R][MAX_C];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: r, c
        r = sc.nextInt();
        c = sc.nextInt();
        // 입력: grid 정보
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                grid[i][j] = sc.next().charAt(0);

        // 아래의 조건들을 만족하는 경우의 수 구하기
            // 시작 -> A -> B -> 끝
            // 점프할 때마다 색이 달라야 한다
            // 한 칸 이상 오른쪽, 한 칸 이상 아래쪽
        int ans = 0;
        char currColor = grid[0][0];
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (grid[i][j] == currColor)
                    continue;

                currColor = grid[i][j];
                for (int m = i + 1; m < r - 1; m++) {
                    for (int n = j + 1; n < c - 1; n++) {
                        if (grid[m][n] != currColor)
                            ans++;
                    }
                }
            }
        }

        // 출력: 경우의 수
        System.out.println(ans);
    }
}