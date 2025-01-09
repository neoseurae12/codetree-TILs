import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_M = 1000;
    public static final int MAX_T = 1000;

    public static int n, m;
    public static char[] dA = new char[MAX_N];
    public static int[] tA = new int[MAX_N];
    public static char[] dB = new char[MAX_M];
    public static int[] tB = new int[MAX_M];

    public static int[] arrA = new int[MAX_N * MAX_T];
    public static int[] arrB = new int[MAX_M * MAX_T];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // n, m 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        // d와 t 입력 받기
        for (int i = 0; i < n; i++) {
            dA[i] = sc.next().charAt(0);
            tA[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            dB[i] = sc.next().charAt(0);
            tB[i] = sc.nextInt();
        }

        int tATotal = 0, dATotal = 0;

        // A 시뮬레이션 -> arrA
        for (int i = 0; i < n; i++) {
            // R일 경우 -> t초 동안 1 증가된 값으로 arrA 채우기
            // L일 경우 -> t초 동안 1 감소된 값으로 arrA 채우기
            int d = dA[i] == 'R' ? 1 : -1;

            for (int j = 0; j < tA[i]; j++) {
                tATotal++;
                dATotal += d;
                
                arrA[tATotal] = dATotal;
                //System.out.print(arrA[tATotal] + " ");
            }
        }

        //System.out.println();

        int tBTotal = 0, dBTotal = 0;

        // B 시뮬레이션 -> arrB
        for (int i = 0; i < m; i++) {
            // R일 경우 -> t초 동안 1 증가된 값으로 arrB 채우기
            // L일 경우 -> t초 동안 1 감소된 값으로 arrB 채우기
            int d = dB[i] == 'R' ? 1 : -1;

            for (int j = 0; j < tB[i]; j++) {
                tBTotal++;
                dBTotal += d;
                
                arrB[tBTotal] = dBTotal;
                //System.out.print(arrB[tBTotal] + " ");
            }
        }

        // arrA와 arrB 비교
        for (int i = 1; i < Math.min(tATotal, tBTotal); i++) {
            // 같은 값일 경우 -> 해당 인덱스 값 출력; return; (인덱스의 시작이 0이 아닌 1이어야 할 것)
            if (arrA[i] == arrB[i]) {
                System.out.println(i);
                return;
            }

            // 다른 값일 경우 -> 인덱스++
        }

        // 끝내 만나지 않는다면 -> -1 출력
        System.out.println(-1);
    }
}