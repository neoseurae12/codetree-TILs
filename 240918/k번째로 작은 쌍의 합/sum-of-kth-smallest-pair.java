import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arrN[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++)
            arrM[i] = Integer.parseInt(st.nextToken());

        int kthSum = getKthSum();
        System.out.println(kthSum);
    }
}