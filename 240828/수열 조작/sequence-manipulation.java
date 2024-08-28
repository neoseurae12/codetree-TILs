import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        while (dq.size() > 1) {
            dq.removeFirst();
            dq.addLast(dq.removeFirst());
        }

        System.out.println(dq.peek());
    }
}