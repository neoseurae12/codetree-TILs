import java.util.Scanner;

public class Main {
    public static boolean isManOver19(int age, char gender) {
        return age >= 19 && gender == 'M';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int a_age, b_age;
        char a_gender, b_gender;

        // 입력
        a_age = sc.nextInt();
        a_gender = sc.next().charAt(0);
        b_age = sc.nextInt();
        b_gender = sc.next().charAt(0);

        // 출력
        if (isManOver19(a_age, a_gender) || isManOver19(b_age, b_gender))
            System.out.println(1);
        else
            System.out.println(0);
    }
}