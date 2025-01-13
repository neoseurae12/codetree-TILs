import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_t = 250;

    // int[] handshakes: T번에 걸쳐, t초에 몇 번 개발자가 개발자 P와 악수를 나눴는지 기록
    public static int[] handshakes = new int[MAX_t + 1];
    // int[] infections: handshake에서 K번째까지의 개발자들 '감염' 처리
    public static int[] infections = new int[MAX_N + 1];
    // int[] k: 각 개발자의 옮길 수 있는 횟수 기록
    public static int[] k = new int[MAX_N + 1];

    public static int[] x = new int[MAX_t + 1];
    public static int[] y = new int[MAX_t + 1];

    // N: 개발자 수, K: 옮길 수 있는 횟수, P: 처음 전염병 걸린 개발자의 번호, T: 총 악수 횟수
    public static int N, K, P, T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        P = sc.nextInt();
        T = sc.nextInt();

        // 악수 기록
        for (int i = 0; i < T; i++) {
            // t: 악수 나눈 시점, x, y: 서로 악수한 개발자들의 번호
            int t = sc.nextInt();
            x[t] = sc.nextInt();
            y[t] = sc.nextInt();
        }
        
        // 초기 감염자
        infections[P] = 1;
        // 시간 흐름대로 추적
        for (int i = 1; i <= MAX_t; i++) {
            // 전염된 사람끼리 만나도 전염병을 옮기게 되는 횟수에 포함
            if (infections[x[i]] == 1 && infections[y[i]] == 1) {
                k[x[i]]++;
                k[y[i]]++;
            }
            // x가 감염자인 경우
            else if (infections[x[i]] == 1) {
                // 감염시킬 수 있다면 -> y도 감염
                if (k[x[i]] < K) {
                    infections[y[i]] = 1;
                    k[x[i]]++;
                }
            }
            // y가 감염자인 경우
            else if (infections[y[i]] == 1) {
                // 감염시킬 수 있다면 -> x도 감염
                if (k[y[i]] < K) {
                    infections[x[i]] = 1;
                    k[y[i]]++;
                }
            }
            // 둘 다 감염자가 아니라면 -> pass
        }
        
        for (int i = 1; i <= N; i++) {
            System.out.print(infections[i]);
        }
    }
}