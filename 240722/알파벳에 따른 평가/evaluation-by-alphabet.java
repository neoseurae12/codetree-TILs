import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alphabet = sc.next().charAt(0);

        String assessment;

        if (alphabet == 'S') {
            assessment = "Superior";
        } else if (alphabet == 'A') {
            assessment = "Excellent";
        } else if (alphabet == 'B') {
            assessment = "Good";
        } else if (alphabet == 'C') {
            assessment = "Usually";
        } else if (alphabet == 'D') {
            assessment = "Effort";
        } else {
            assessment = "Failure";
        }

        System.out.println(assessment);
    }
}