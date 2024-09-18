import java.util.*;

public class Main {
    public static final int MAX_N = 100000;

    public static int t, m;
    public static int[] arr = new int[MAX_N];

    public static void findMedians() {
        int median = arr[0];
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순; median보다 작은 수들
        PriorityQueue<Integer> minPq = new PriorityQueue<>(); // 오름차순; median보다 큰 수들

        System.out.print(median + " ");

        for (int i = 1; i < m; i++) {
            // 짝수 번째인 경우
            if (i % 2 == 1) {
                if (arr[i] > median)
                    minPq.add(arr[i]);
                else
                    maxPq.add(arr[i]);
            }
            // 홀수 번째인 경우
            else {
                // median, arr[i], new_cand 비교
                int new_cand;
                if (minPq.size() > maxPq.size())
                    new_cand = minPq.poll();
                else
                    new_cand = maxPq.poll();
                
                int[] candidates = new int[]{median, arr[i], new_cand};
                Arrays.sort(candidates);

                maxPq.add(candidates[0]);
                median = candidates[1];
                minPq.add(candidates[2]);

                System.out.print(median + " ");
            }
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        t = sc.nextInt();
        while (t-- > 0) {
            m = sc.nextInt();

            for (int i = 0; i < m; i++)
                arr[i] = sc.nextInt();

            findMedians();
        }
    }
}