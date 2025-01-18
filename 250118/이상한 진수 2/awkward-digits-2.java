import java.util.Scanner;

public class Main {
    public static String a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 문자열 a
        a = sc.next();

        // 완전 탐색: 한 자리씩 바꿔보면서 본래 a 값에 반영 -> 최댓값 체크
        int maxN = 0;
        for (int i = 0; i < a.length(); i++) {
            // i번째 자릿수 변경
            a = a.substring(0, i) + (char)('0' + '1' - a.charAt(i)) + a.substring(i + 1);

            // 십진수로 변환
            int n = 0;
            for (int j = 0; j < a.length(); j++) {
                n = 2 * n + ((int)a.charAt(j) - '0');
            }

            // 최댓값과 구한값 비교 -> 최댓값 갱신
            maxN = Math.max(maxN, n);

            // i번째 자릿수 되돌리기
            a = a.substring(0, i) + (char)('0' + '1' - a.charAt(i)) + a.substring(i + 1);
        }

        // 출력: 최댓값
        System.out.println(maxN);
    }
}
