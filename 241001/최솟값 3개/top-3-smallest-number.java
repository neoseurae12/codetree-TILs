import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static int n;
    public static int[] nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());

        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);

            if (pq.size() < 3) {
                System.out.println(-1);
                continue;
            }

            int[] threeNums = new int[3];
            // 뺐다가
            for (int i = 0; i < 3; i++) {
                threeNums[i] = pq.poll();
            }

            int multiplyResult = 1;
            // 다시 넣기
            for (int i = 0; i < 3; i++) {
                multiplyResult *= threeNums[i];
                pq.add(threeNums[i]);
            }

            System.out.println(multiplyResult);
        }
    }
}