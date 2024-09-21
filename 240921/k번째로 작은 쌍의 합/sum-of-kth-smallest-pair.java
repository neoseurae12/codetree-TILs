import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Pair implements Comparable<Pair> {
    int idx1, idx2, sum;

    public Pair(int idx1, int idx2) {
        this.idx1 = idx1;
        this.idx2 = idx2;
        this.sum = idx1 + idx2;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.sum != p.sum)
            return this.sum - p.sum;
        else if (this.idx1 != p.idx1)
            return this.idx1 - p.idx1;
        else
            return this.idx2 - p.idx2;
    }
}

public class Main {
    public static final int MAX_NUM = 100000;
    
    // 변수 선언
    public static int n, m, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        for(int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();

        // 배열 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // 우선순위 큐 (오름차순)
        PriorityQueue<Pair> pq = new PriorityQueue<>((pairA, pairB) -> (arr1[pairA.idx1] + arr2[pairA.idx2]) - (arr1[pairB.idx1] + arr2[pairB.idx2]));
        // 방문 확인을 위한 Set
        Set<Pair> visited = new HashSet<>();

        Pair p = new Pair(0, 0);
        pq.add(p);
        visited.add(p);
        
        int kthSum = 0;
        for (int i = 0; i < k; i++) {
            Pair current = pq.poll();
            int idx1 = current.idx1;
            int idx2 = current.idx2;

            kthSum = arr1[idx1] + arr2[idx2];

            Pair p1 = new Pair(idx1 + 1, idx2);
            if (idx1 + 1 < n && !visited.contains(p1)) {    
                pq.add(p1);
                visited.add(p1);
            }
            Pair p2 = new Pair(idx1, idx2 + 1);
            if (idx2 + 1 < m && !visited.contains(p2)) {
                pq.add(p2);
                visited.add(p2);
            }
        }

        // k번째 합을 가져옵니다.
        System.out.print(kthSum);
    }
}