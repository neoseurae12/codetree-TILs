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

        // Priority Queue => 남아있는 정수 중 '최솟값'을 구하기 위함
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 접근방식: 뒤에서부터 추가하기 -- 사고의 전환
        pq.add(nums[n - 1]);
        pq.add(nums[n - 2]);
        int sum = nums[n - 1] + nums[n - 2];
        double maxAvg = 0;
        for (int i = n - 3; i >= 1; i--) {
            // sum 갱신
            sum += nums[i];
            // avg 구하기
            pq.add(nums[i]);
            double avg = (double)(sum - pq.peek()) / (n - 1 - i);
            // maxAvg 갱신
            if (avg > maxAvg)
                maxAvg = avg;
        }

        System.out.printf("%.2f\n", maxAvg);
    }
}