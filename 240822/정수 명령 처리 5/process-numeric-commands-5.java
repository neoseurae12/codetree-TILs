import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> darr = new ArrayList<>();

    public static void pushBack(int a) {
        darr.add(a);
    }

    public static void popBack() {
        darr.remove(darr.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            
            if (command.equals("push_back")) {
                int num = sc.nextInt();
                pushBack(num);
            } else if (command.equals("pop_back")) {
                popBack();
            } else if (command.equals("size")) {
                System.out.println(darr.size());
            } else {    // "get"
                int idx = sc.nextInt();
                System.out.println(darr.get(idx - 1));
            }
        }
    }
}