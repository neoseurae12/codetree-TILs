import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        float maxAvg = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i; j < n; j++) {
                pq.add(nums[j]);
            }

            pq.poll();  // 가장 작은 숫자 하나는 제외

            int sum = 0;
            int count = pq.size();
            while (!pq.isEmpty()) {
                sum += pq.poll();
            }
            float avg = (float)sum / count;

            if (avg > maxAvg)
                maxAvg = avg;
        }

        System.out.printf("%.2f\n", maxAvg);
    }
}