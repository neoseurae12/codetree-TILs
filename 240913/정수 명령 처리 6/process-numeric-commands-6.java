import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                int x = Integer.parseInt(st.nextToken());

                pq.add(-x);
            } else if (command.equals("pop")) {
                System.out.println(-pq.poll());
            } else if (command.equals("size")) {
                System.out.println(pq.size());
            } else if (command.equals("empty")) {
                if (pq.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else {    // "top"
                System.out.println(-pq.peek());
            }
        }
    }
}