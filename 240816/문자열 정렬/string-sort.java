import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String result = new String(chars);
        System.out.println(result);
    }
}