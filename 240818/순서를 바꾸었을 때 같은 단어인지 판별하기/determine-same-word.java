import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        String sortedStr1 = new String(charArr1);
        String sortedStr2 = new String(charArr2);

        if (sortedStr1.equals(sortedStr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}