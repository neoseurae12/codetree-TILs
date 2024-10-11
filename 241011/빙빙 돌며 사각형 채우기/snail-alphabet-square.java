import java.util.Scanner;

public class Main {

    // n: 행, m: 열
    public static int n, m;

    public static char[][] alphabetGrid;
    public static int r = 0, c = 0;
    public static boolean[][] visited;

    // 동 남 서 북
    public static int[] dr = new int[]{0, 1, 0, -1};    // 세로
    public static int[] dc = new int[]{1, 0, -1, 0};    // 가로

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        // 연산
        alphabetGrid = new char[n][m];
        visited = new boolean[n][m];

        char alphabet = 'A';
        alphabetGrid[r][c] = alphabet;
        visited[r][c] = true;

        int dir = 0;
        int nr = r + dr[dir];
        int nc = c + dc[dir];
        
        for (int i = 1; i < n * m; i++) {
            if (inRange(nr, nc) && !visited[nr][nc]) {
                r = nr;
                c = nc;
            }
            else {
                // 방향 전환
                dir = (dir + 1) % 4;
                r += dr[dir];
                c += dc[dir];
            }

            alphabet++;
            // Z 이후에는 다시 A부터
            if (alphabet > 'Z')
                alphabet = 'A';
            
            alphabetGrid[r][c] = alphabet;
            visited[r][c] = true;

            nr = r + dr[dir];
            nc = c + dc[dir];
        }

        // 출력

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(alphabetGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean inRange(int r, int c) {
        return (r >= 0 && r < n && c >= 0 && c < m);
    }
}