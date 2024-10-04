import java.util.Scanner;

public class Main {

    public static int N;

    // 서, 남, 북, 동
    public static int[] dr = new int[]{0, 1, -1, 0};   // 세로
    public static int[] dc = new int[]{-1, 0, 0, 1};   // 가로

    public static int r = 0;
    public static int c = 0;

    public static int[][] moves;

    public static int moveCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        moves = new int[N][2];
        for (int i = 0; i < N; i++) {
            char cDirection  = sc.next().charAt(0);
            int distance = sc.nextInt();

            int nDirection = directionCtoN(cDirection);

            moves[i][0] = nDirection;
            moves[i][1] = distance;
        }

        int ans = -1;
        for (int i = 0; i < N; i++) {
            int dir = moves[i][0];
            int dis = moves[i][1];

            ans = move(dir, dis);

            // 되돌아오는 데 성공했다면
            if (ans > 0)
                break;
        }

        System.out.println(ans);
    }

    public static int directionCtoN(char cDirection) {
        // 서, 남, 북, 동
        if (cDirection == 'W')
            return 0;
        else if (cDirection == 'S')
            return 1;
        else if (cDirection == 'N')
            return 2;
        else
            return 3;
    }

    public static int move(int direction, int distance) {
        while (distance-- > 0) {
            moveCnt++;

            r += dr[direction];
            c += dc[direction];

            if (r == 0 && c == 0)
                return moveCnt;
        }

        return -1;
    }
}