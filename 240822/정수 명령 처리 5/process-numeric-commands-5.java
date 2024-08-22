import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 동적 배열
        ArrayList<Integer> darr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            
            if (command.equals("push_back")) {
                int num = sc.nextInt();
                darr.add(num);
            } else if (command.equals("pop_back")) {
                darr.remove(darr.size() - 1);
            } else if (command.equals("size")) {
                System.out.println(darr.size());
            } else {    // "get"
                int idx = sc.nextInt();
                System.out.println(darr.get(idx - 1));
            }
        }
    }
}