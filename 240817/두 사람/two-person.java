import java.util.Scanner;

public class Main {
    public static boolean isManOver19(int age, String gender) {
        return (age >= 19 && gender.equals("M")) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        String gender1 = sc.next();

        int age2 = sc.nextInt();
        String gender2 = sc.next();

        if (isManOver19(age1, gender1) || isManOver19(age2, gender2))
            System.out.println(1);
        else
            System.out.println(0);
    }
}