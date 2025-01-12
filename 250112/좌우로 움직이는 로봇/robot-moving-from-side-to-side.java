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

            if (d == 'L') {
                while (t-- > 0) {
                    posA[timeA] = posA[timeA - 1] - 1;
                    timeA++;
                }
            }
            else {  // d == 'R'
                while (t-- > 0) {
                    posA[timeA] = posA[timeA - 1] + 1;
                    timeA++;
                }
            }
        }

        // B의 위치 기록
        int timeB = 1;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                while (t-- > 0) {
                    posB[timeB] = posB[timeB - 1] - 1;
                    timeB++;
                }
            }
            else {  // d == 'R'
                while (t-- > 0) {
                    posB[timeB] = posB[timeB - 1] + 1;
                    timeB++;
                }
            }
        }

        int maxTime = timeA > timeB ? timeA : timeB;
        if (timeA > timeB) {
            for (int i = timeB; i < timeA; i++) {
                posB[i] = posB[i-1];
            }
        } else {
            for (int i = timeA; i < timeB; i++) {
                posA[i] = posA[i-1];
            }
        }
        
        int ans = 0;

        for (int i = 2; i < maxTime; i++) {
            if (posA[i] == posB[i]) {
                if (posA[i-1] != posB[i-1])
                    ans++;
            }
        }

        System.out.println(ans);

        for (int i = 0; i < maxTime; i++) {
            //System.out.print(String.format("%-3s", posA[i]));
        }
        //System.out.println();
        //System.out.println(timeA);

        for (int i = 0; i < maxTime; i++) {
            //System.out.print(String.format("%-3s", posB[i]));
        }
        //System.out.println();
        //System.out.println(timeB);

        
    }
}