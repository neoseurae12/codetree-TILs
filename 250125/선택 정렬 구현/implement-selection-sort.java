import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    public static int[] numbers = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력: n
        n = sc.nextInt();
        // 입력: 정렬 전의 원소값들
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 선택 정렬
            // 루프 1: 최솟값을 채울 자리 선택
            // 루프 2: 루프 1 내 최솟값을 찾음
            // 루프 1: 최솟값을 채울 자리와 최솟값의 현재 자리랑 바꾸기
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = tmp;
        }

        // 출력: 정렬 후의 원소값들
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}