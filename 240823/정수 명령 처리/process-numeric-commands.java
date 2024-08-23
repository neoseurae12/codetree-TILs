import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();

            if (cmd.equals("push")) {
                int num = sc.nextInt();

                stack.push(num);
            } else if (cmd.equals("pop")) {
                int num = stack.pop();
                System.out.println(num);
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                if (stack.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else {  // "top"
                System.out.println(stack.peek());
            }
        }
    }
}