import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        String prefix;
        
        n = sc.nextInt();
        k = sc.nextInt();
        prefix = sc.next();

        String[] wordsWithPrefix = new String[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            String word = sc.next();

            if (word.startsWith(prefix)) {
                wordsWithPrefix[idx++] = word;
            }
        }

        Arrays.sort(wordsWithPrefix, 0, idx);

        System.out.println(wordsWithPrefix[k - 1]);
    }
}