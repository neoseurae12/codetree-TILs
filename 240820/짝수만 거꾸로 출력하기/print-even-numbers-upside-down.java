import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0)
                stack.push(num);
        }

        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}