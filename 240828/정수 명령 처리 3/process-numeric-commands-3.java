import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> d = new ArrayDeque<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String cmd = sc.next();

            if (cmd.equals("push_front")) {
                int num = sc.nextInt();
                d.addFirst(num);
            } else if (cmd.equals("push_back")) {
                int num = sc.nextInt();
                d.addLast(num);
            } else if (cmd.equals("pop_front")) {
                System.out.println(d.pollFirst());
            } else if (cmd.equals("pop_back")) {
                System.out.println(d.pollLast());
            } else if (cmd.equals("front")) {
                System.out.println(d.peekFirst());
            } else if (cmd.equals("back")) {
                System.out.println(d.peekLast());
            } else if (cmd.equals("size")) {
                System.out.println(d.size());
            } else { // "empty"
                if (d.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}