import java.util.Scanner;

public class Main {

    // n: 격자 n*n, t: t초 후
    public static int n, t;
    // (r, c): 초기 구슬의 위치, d: 초기 이동 방향
    public static int r, c;
    public static char d;

    public static int[][] grid;

    // 북 동 서 남
    public static int[] dx = new int[]{0, 1, -1, 0};
    public static int[] dy = new int[]{-1, 0, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        t = sc.nextInt();

        // -1 => for 인덱스 0부터 반영
        r = sc.nextInt() - 1;
        c = sc.nextInt() - 1;
        // (0, 1)

        d = sc.next().charAt(0);
        int dNum = getNumOfD(d);
        //System.out.println(dNum);

        grid = new int[n][n];

        while (t-- > 0) {
            int nx = r + dy[dNum];
            int ny = c + dx[dNum];

            // 방향만 바꿀 경우
            if (!inRange(nx, ny)) {
                dNum = 3 - dNum;
            }
            // 방향대로 앞으로 나아갈 경우
            else {
                r= nx;
                c = ny;
            }
            //System.out.println((r+1) + " " + (c+1));
        }

        // +1 => for 인덱스 0부터 반영에서 원상태 복구
        System.out.println(++r + " " + ++c);
    }

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }

    public static int getNumOfD(char d) {
        // 북 동 서 남
        if (d == 'U')
            return 0;
        else if (d == 'R')
            return 1;
        else if (d == 'L')
            return 2;
        else
            return 3;
    }
}