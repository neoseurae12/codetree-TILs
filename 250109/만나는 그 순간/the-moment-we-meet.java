import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_M = 1000;
    public static final int MAX_T = 1000;

    public static int n, m;

    public static int[] posA = new int[MAX_N * MAX_T + 1];
    public static int[] posB = new int[MAX_M * MAX_T + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();

        int timeA = 1;
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                // 오른쪽 => 이전 위치에서 +1
                if (d == 'R') {
                    posA[timeA] = posA[timeA - 1] + 1; 
                }
                // 왼쪽 => 이전 위치에서 -1
                else {
                    posA[timeA] = posA[timeA - 1] - 1;  
                }

                // 시간은 계속 흘러간다...
                timeA++;
            }
        }

        int timeB = 1;
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            while (t-- > 0) {
                if (d == 'R') {
                    posB[timeB] = posB[timeB - 1] + 1;
                }
                else {
                    posB[timeB] = posB[timeB - 1] - 1;
                }

                timeB++;
            }
        }

        // 끝내 만나지 않는다면 -> -1 출력
        int ans = -1;
        for (int i = 1; i < Math.min(timeA, timeB); i++) {
            // 같은 값일 경우 -> 해당 인덱스 값 출력; return; (인덱스의 시작이 0이 아닌 1이어야 할 것)
            if (posA[i] == posB[i]) {
                ans = i;
                break;
            }

            // 다른 값일 경우 -> 인덱스++
        }

        System.out.println(ans);
    }
}