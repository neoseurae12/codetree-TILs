import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static int MAX = 100000;

    public static int n, m, k;
    public static int[] arrN = new int[MAX], arrM = new int[MAX];

    public static int getKthSum() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pq.add(arrN[i] + arrM[j]);
            }
        }

        for (int i = 0; i < k; i++) {
            ans = pq.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < n; i++)
            arrN[i] = sc.nextInt();

        for (int i = 0; i < m; i++)
            arrM[i] = sc.nextInt();

        int kthSum = getKthSum();
        System.out.println(kthSum);
    }
}