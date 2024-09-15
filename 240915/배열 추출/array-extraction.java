import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x > 0) {
                // 배열에 x 값 넣기
                pq.add(-x); // 음수로 넣기 (가장 큰 값이 더 앞에 오도록 하기 위함)
            }

            if (x == 0) {
                // 만약 배열이 비어 있는 경우 => 0 출력
                if (pq.isEmpty()) {
                    System.out.println(0);
                    continue;
                }

                // 배열에서 가장 큰 값을 출력 & 그 값을 배열에서 제거
                System.out.println(-pq.poll()); // 음수를 다시 양수로 되돌려서 출력하기
            }
        }
    }
}