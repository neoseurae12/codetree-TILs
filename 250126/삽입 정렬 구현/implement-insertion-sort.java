import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int n;
    public static int[] arr = new int[MAX_N];

    public static void insertionSort() {
        for (int i = 1; i < n; i++) {
            // 타겟 설정
            int target = arr[i];

            // 타겟의 자리 포착
                // 타겟의 자리 포착의 기준: 인덱스 0 이상 && 타겟보다 작은 값 발견
                // 타겟의 자리가 포착될 때까지 원소들 뒤로 땡김
            int j = i - 1;
            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 타깃 넣기
            arr[j + 1] = target;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: n
        n = sc.nextInt();
        
        // 입력: 정렬 전의 원소 값들
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // 삽입 정렬
        insertionSort();

        // 출력: 정렬 후의 원소 값들
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}