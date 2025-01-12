import java.util.Scanner;

public class Main {
    public static final int MAX_D = 1_000_000;

    public static int n, m;
    public static int[] posA = new int[MAX_D + 1];
    public static int[] posB = new int[MAX_D + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        // A의 위치 기록
        int timeA = 1;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while (t-- > 0) {
                if (d == 'L')
                    posA[timeA] = posA[timeA - 1] - 1;
                else    // d == 'R'
                    posA[timeA] = posA[timeA - 1] + 1;
                timeA++;
            }
        }

        // B의 위치 기록
        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            while (t-- > 0) {
                if (d == 'L')
                    posB[timeB] = posB[timeB - 1] - 1;
                else    // d == 'R'
                    posB[timeB] = posB[timeB - 1] + 1;
                timeB++;
            }
        }

        // 시간 연장에 따른 위치 채우기
        if (timeA > timeB)
            for (int i = timeB; i < timeA; i++)
                posB[i] = posB[i-1];
        else
            for (int i = timeA; i < timeB; i++)
                posA[i] = posA[i-1];
        
        // 같은 위치라면 -> 바로 직전 위치 체크
        int ans = 0;
        int maxTime = timeA > timeB ? timeA : timeB;

        for (int i = 2; i < maxTime; i++)
            if (posA[i] == posB[i])
                if (posA[i-1] != posB[i-1])
                    ans++;

        System.out.println(ans);
    }
}