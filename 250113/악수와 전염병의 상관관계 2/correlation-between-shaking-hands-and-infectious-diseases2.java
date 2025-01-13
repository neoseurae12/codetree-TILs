import java.util.Scanner;
import java.util.Arrays;

class HandShake implements Comparable<HandShake> {
    int time;
    int person1;
    int person2;

    public HandShake(int time, int person1, int person2) {
        this.time = time;
        this.person1 = person1;
        this.person2 = person2;
    }

    @Override
    public int compareTo(HandShake handshake) {
        // 오름차순 - 기준: 시간
        return time - handshake.time;
    }
}

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_t = 250;

    // N: 개발자 수, K: 옮길 수 있는 횟수, P: 처음 전염병 걸린 개발자의 번호, T: 총 악수 횟수
    public static int N, K, P, T;

    // int[] handshakeNum: 각 개발자의 옮길 수 있는 횟수 기록
    public static int[] handshakeNum = new int[MAX_N + 1];
    // int[] infections: handshake에서 K번째까지의 개발자들 '감염' 처리
    public static boolean[] infected = new boolean[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        P = sc.nextInt();
        T = sc.nextInt();

        HandShake[] handshakes = new HandShake[MAX_t + 1];

        // 악수 기록
        for (int i = 0; i < T; i++) {
            // t: 악수 나눈 시점, x, y: 서로 악수한 개발자들의 번호
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            handshakes[i] = new HandShake(t, x, y);
        }

        Arrays.sort(handshakes, 0, T);
        
        // 초기 감염자
        infected[P] = true;
        // 시간 흐름대로 추적
        for (int i = 0; i < T; i++) {
            int target1 = handshakes[i].person1;
            int target2 = handshakes[i].person2;

            // 전염된 사람끼리 만나도 전염병을 옮기게 되는 횟수에 포함
            if (infected[target1])
                handshakeNum[target1]++;
            if (infected[target2])
                handshakeNum[target2]++;
            
            // x가 감염자 && 감염시킬 수 있는 횟수인 경우 -> y 감염시킴
            if (handshakeNum[target1] <= K && infected[target1])
                infected[target2] = true;

            // y가 감염자 && 감염시킬 수 있는 횟수인 경우 -> x 감염시킴
            if (handshakeNum[target2] <= K && infected[target2])
                infected[target1] = true;
        }
        
        for (int i = 1; i <= N; i++) {
            if (infected[i])
                System.out.print(1);
            else
                System.out.print(0);
        }
    }
}