import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        String aAndB = strA + strB;
        String bAndA = strB + strA;

        if (aAndB.equals(bAndA))
            System.out.println("true");
        else
            System.out.println("false");
    }
}