import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 오름차순

            for (int j = 0; j < m; j++) {
                if (maxHeap.size() == minHeap.size()) {
                    maxHeap.add(sc.nextInt());
                } else if (minHeap.size() < maxHeap.size()) {
                    minHeap.add(sc.nextInt());
                }

                while (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                    int maxHead = maxHeap.poll();
                    int minHead = minHeap.poll();

                    maxHeap.add(minHead);
                    minHeap.add(maxHead);
                }

                if (j % 2 == 0) {
                    System.out.print(maxHeap.peek() + " ");
                }
            }
            
            System.out.println();
        }
    }
}