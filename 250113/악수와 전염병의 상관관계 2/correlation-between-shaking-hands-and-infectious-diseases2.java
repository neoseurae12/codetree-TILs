import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_t = 250;

    // int[] handshakes: T번에 걸쳐, t초에 몇 번 개발자가 개발자 P와 악수를 나눴는지 기록
    public static int[] handshakes = new int[MAX_t + 1];
    // int[] infections: handshake에서 K번째까지의 개발자들 '감염' 처리
    public static int[] infections = new int[MAX_N + 1];

    // N: 개발자 수, K: 옮길 수 있는 횟수, P: 처음 전염병 걸린 개발자의 번호, T: 총 악수 횟수
    public static int N, K, P, T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        P = sc.nextInt();
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // t: 악수 나눈 시점, x, y: 서로 악수한 개발자들의 번호
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            // P와 악수를 나눈 상대 개발자의 번호
            int partner = x == P ? y : x;

            handshakes[t] = partner;
        }
        
        // 초기 감염자
        infections[P] = 1;
        for (int i = 1; i <= MAX_t; i++) {
            int partner = handshakes[i];
            // i초에서 악수를 나눈 상대가 있고 & 아직 전염시킬 횟수 남아있다면 -> '전염' 처리
            if (partner != 0 && K > 0) {
                infections[partner] = 1;
                K--;
            }
        }
        
        for (int i = 1; i <= N; i++) {
            System.out.print(infections[i]);
        }
    }
}