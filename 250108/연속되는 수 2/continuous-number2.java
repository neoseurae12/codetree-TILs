// i == 0인 경우 -> 무조건 cnt++
        // i > 0인 경우
            // i번째와 i-1번째의 수가 다른 경우 -> maxCnt와 cnt 비교 -> maxCnt 갱신 여부, cnt 초기화
            // i번째와 i-1번째의 수가 같은 경우 -> cnt++

import java.util.Scanner;

public class Main {

    public static int[] arr = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // cf. 2, 7, 7, 7, 7, 5, 7
        // cf. 3
        int maxCnt = 0, cnt = 0;

        if (n == 1)
            maxCnt = 1;
        else {
            for (int i = 0; i < n; i++) {
                if (i != 0 && arr[i] != arr[i-1]) {
                    if (maxCnt < cnt)
                        maxCnt = cnt;
                    cnt = 0;
                }
                cnt++;
            }
        }

        System.out.println(maxCnt);
    }
}