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

        // 전체 합 미리 구해두기
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        float maxAvg = 0;
        for (int i = 0; i < n - 2; i++) {
            // Priority Queue => 남아있는 정수 중 '최소값'을 구하기 위함
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int j = i + 1; j < n; j++) {
                pq.add(nums[j]);
            }

            sum -= nums[i];

            // 가장 작은 숫자 하나는 제외
            int subsum = sum - pq.poll();
            //System.out.println(subsum + " " + count);
            float avg = (float)subsum / pq.size();

            if (avg > maxAvg)
                maxAvg = avg;
        }

        System.out.printf("%.2f\n", maxAvg);
    }
}