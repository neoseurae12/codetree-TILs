import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_M = 1000;
    public static final int MAX_V = 1000;
    public static final int MAX_T = 1000;

    public static int n, m;
    public static int[] posA = new int[MAX_N * MAX_T];
    public static int[] posB = new int[MAX_M * MAX_T];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }
        }
        // posA: 0 1 2 6 7 9 11 13 15 17 19 21 23 25 27

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }
        // posB: 0 2 4 6 7 8 11 14 17 20 23 26 29 32 35

        // A가 선두라면 -> 1, B가 선두라면 -> -1
        int ans = 0;

        // leader: x -1 -1 -1 -1 1 1 -1 -1 -1 -1 -1 -1 -1 -1
        int leader = 0;
        for (int i = 1; i < timeA; i++) {
            // 현재 선두: A
            if (posA[i] > posB[i]) {
                // 기존 선두: B -> ans++
                if (leader == -1) {
                    ans++;
                }

                // 선두를 A로 유지 및 변경
                leader = 1;
            }
            // 현재 선두: B
            else if (posA[i] < posB[i]) {
                // 기존 선두: A -> ans++
                if (leader == 1) {
                    ans++;
                }

                // 선두를 B로 유지 및 변경
                leader = -1;
            }

            // 어느 한 쪽이 앞서지 않는다면 -> 넘어가기
        }

        System.out.println(ans);
    }
}

// posA: 0 1 2 4 6 8 10 
// posB: 0 1 2 3 10 15 20
// leader: x 0 0 1 -1 -1 -1