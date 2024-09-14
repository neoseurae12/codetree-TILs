import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, x;
        n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(br.readLine());

            if (x == 0) {
                // 배열이 비어있고 0이 입력된 경우 => 0 출력
                if (pq.isEmpty()) {
                    System.out.println(0);
                    continue;
                }

                // 0인 경우 => 배열에서  가장 작은 값 출력 & 그 값을 배열에서 제거
                System.out.println(pq.poll());
            } else if (x > 0) { 
                // 자연수인 경우 => 배열에 자연수 x를 넣는다.
                pq.add(x);
            }
        }
    }
}