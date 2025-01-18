import java.util.Scanner;

public class Main {
    public static final int MAX_LEN_A = 10;

    public static String a;
    public static int n = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 문자열 a
        a = sc.next();

        // 문자열 a의 10진법 값 구하기
        for (int i = 1; i < a.length(); i++) {
            n = 2 * n + ((int)a.charAt(i) - '0');
        }

        // 완전 탐색: 한 자리씩 바꿔보면서 본래 a 값에 반영 -> 최댓값 체크
        int maxN = 0;
        for (int i = 1; i < a.length(); i++) {
            // 자릿수의 십진수
            int digit = 1;
            for (int j = 0; j < a.length() - i - 1; j++) {
                digit *= 2;
            }

            int digitNum = (int) a.charAt(i) - '0';
            if (digitNum == 0) {
                // 자릿수의 십진수 더하기
                n += digit;
            }
            else {    // digitNum == 1
                // 자릿수의 십진수 빼기
                n -= digit;
            }

            // 최댓값과 구한값 비교 -> 최댓값 갱신
            maxN = Math.max(maxN, n);

            // 더하거나 뺐던 값 다시 되돌리기
            if (digitNum == 0) {
                n -= digit;
            }
            else {
                n += digit;
            }
        }

        // 출력: 최댓값
        System.out.println(maxN);
    }
}
