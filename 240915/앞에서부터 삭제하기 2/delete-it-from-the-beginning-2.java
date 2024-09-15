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

        // Priority Queue => 남아있는 정수 중 '최소값'을 구하기 위함
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
        }

        // 전체 합 미리 구해두기
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        float maxAvg = 0;
        boolean[] passed = new boolean[10001];

        // 앞에서부터 k개 삭제
        for (int i = 0; i < n - 2; i++) {
            // sum 갱신 // pq 갱신
            sum -= nums[i];
            passed[nums[i]] = true;
            while (passed[pq.peek()]) {
                pq.poll();
            }
            int min  = pq.poll();
            int subSum = sum - min;

            //System.out.println(subSum + " " + (n - 2 - i));
            
            // 현재 평균 구해보기 (<- sum & pq.size())
            float avg = (float)subSum / (n - 2 - i);
            // 최대 평균 갱신
            if (maxAvg < avg)
                maxAvg = avg;
        }

        System.out.printf("%.2f\n", maxAvg);
    }
}