import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        Queue<Integer> removedNums = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                q.add(q.remove());
            }

            removedNums.add(q.remove());
        }

        while (!removedNums.isEmpty()) {
            System.out.print(removedNums.remove() + " ");
        }
    }
}