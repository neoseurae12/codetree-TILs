import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
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