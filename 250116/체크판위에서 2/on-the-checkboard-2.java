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
            // 1 -> 2 -> 3 -> 4
            // 점프할 때마다 색이 달라야 한다
            // 한 칸 이상 오른쪽, 한 칸 이상 아래쪽
        int ans = 0;
        // 1: grid[0][0]
        // 2:
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                // 1과 같은 색인 경우 -> continue
                if (grid[i][j] == grid[0][0])
                    continue;

                // 3:
                for (int m = i + 1; m < r; m++) {
                    for (int n = j + 1; n < c; n++) {
                        // 2와 같은 색 -> continue
                        if (grid[m][n] == grid[i][j])
                            continue;
                        
                        // 4: grid[r-1][c-1]
                        for (int f = m + 1; f < r; f++) {
                            for (int g = n + 1; g < c; g++) {
                                // 3과 같은 색 -> continue
                                if (grid[f][g] == grid[m][n])
                                    continue;
                                
                                if (f == r - 1 && g == c - 1)
                                    ans++;
                            }
                        }
                    }
                }
            }
        }

        // 출력: 경우의 수
        System.out.println(ans);
    }
}