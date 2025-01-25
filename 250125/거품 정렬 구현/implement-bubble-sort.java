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

        // 비교 -> 정렬
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
        
        // 출력: 정렬 후의 원소값들
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}