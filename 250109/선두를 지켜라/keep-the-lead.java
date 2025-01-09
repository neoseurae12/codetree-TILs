import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_M = 1000;
    public static final int MAX_V = 1000;

    public static int n, m;
    public static int[] posA = new int[MAX_N * MAX_V + 1];
    public static int[] posB = new int[MAX_N * MAX_V + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n, m 입력받기
        n = sc.nextInt();
        m = sc.nextInt();
        
        // A의 위치 변화 기록
        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                posA[timeA] = posA[timeA - 1] + v;

                timeA++;
            }
        }
        // 루프 진입
        // v, t 입력받기
        // t초 동안 A의 위치 변화 기록; posA[timeA]
        // 거리 = 속력 * 시간 -> 거리 / 시간 = 속력 -> 1초에 속력만큼 앞으로 나감

        // test
        //for (int i = 0; i < timeA; i++) {
        //   System.out.print(posA[i] + " ");
        //}
        //System.out.println();
        
        // B의 위치 변화 기록
        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            while (t-- > 0) {
                posB[timeB] = posB[timeB - 1] + v;

                timeB++;
            }
        }

        // test
        //for (int i = 0; i < timeB; i++) {
        //    System.out.print(posB[i] + " ");
        //}
        //System.out.println();

        int ans = 0;
        int head = posA[1] - posB[1];   // 양수 -> A, 음수 -> A
        // 언제 A와 B의 선두가 뒤바뀌는가 카운트
        // 'i번째에서의 (A의 위치 - B의 위치)' * 'i-1번째에서의 (A의 위치 - B의 위치)' < 0 => 선두 뒤바뀜
        for (int i = 1; i < timeA; i++) {
            if (posA[i] - posB[i] == 0)
                continue;
            if (head * (posA[i] - posB[i]) < 0) {
                ans++;
                head = posA[i] - posB[i];
            }
        }


        // 카운트 출력
        System.out.println(ans);
    }
}