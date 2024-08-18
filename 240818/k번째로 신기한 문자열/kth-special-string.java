import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        String prefix;
        ArrayList<String> wordsWithPrefix = new ArrayList<>();

        n = sc.nextInt();
        k = sc.nextInt();
        prefix = sc.next();

        for (int i = 0; i < n; i++) {
            String word = sc.next();

            if (word.startsWith(prefix))
                wordsWithPrefix.add(word);
        }

        Collections.sort(wordsWithPrefix);

        System.out.println(wordsWithPrefix.get(k - 1));
    }
}