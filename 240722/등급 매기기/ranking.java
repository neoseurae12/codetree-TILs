import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String className;

        if (score >= 90) {
            className = "A";
        } else if (score >= 80) {
            className = "B";
        } else if (score >= 70) {
            className = "C";
        } else if (score >= 60) {
            className = "D";
        } else {
            className = "F";
        }

        System.out.println(className);
    }
}