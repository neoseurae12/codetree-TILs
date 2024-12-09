import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] strArr = sc.next().toCharArray();

        char first = strArr[0];
        char second = strArr[1];

        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i] == second)
                strArr[i] = first;
        }

        System.out.println(strArr);
    }
}