import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int attendanceNumber = sc.nextInt();

        String studentName;

        if (attendanceNumber == 1) {
            studentName = "John";
        } else if (attendanceNumber == 2) {
            studentName = "Tom";
        } else if (attendanceNumber == 3) {
            studentName = "Paul";
        } else {
            studentName = "Vacancy";
        }

        System.out.println(studentName);
    }
}