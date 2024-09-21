import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

    public static int n, x;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (Math.abs(a) == Math.abs(b))
                return a - b;
            return Math.abs(a) - Math.abs(b);
        });

        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (pq.isEmpty())
                    System.out.println(0);
                else {
                    // 절댓값 가장 작은 값 출력 & 제거
                System.out.println(pq.poll());
                }
            }
            else {
                // 배열에 x 넣기
                pq.add(x);
            }
        }
    }
}