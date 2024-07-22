import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String class;

        if (score >= 90) {
            class = "A";
        } else if (score >= 80) {
            class = "B";
        } else if (score >= 70) {
            class = "C";
        } else if (score >= 60) {
            class = "D";
        } else {
            class = "F";
        }

        System.out.println(class);
    }
}