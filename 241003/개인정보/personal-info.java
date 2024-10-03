import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {

    public static final int STUDENT_COUNT = 5;

    public static Student[] students;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        students = new Student[STUDENT_COUNT];
        for (int i = 0; i < STUDENT_COUNT; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            students[i] = new Student(name, height, weight);
        }

        // 이름 순 출력
        Arrays.sort(students, (st1, st2) -> {
            return st1.name.compareTo(st2.name);
        });

        System.out.println("name");
        printSortedStudents();

        System.out.println();

        // 키 순 출력
        Arrays.sort(students, (st1, st2) -> {
            return st2.height - st1.height;
        });

        System.out.println("height");
        printSortedStudents();
    }

    public static void printSortedStudents() {
        for (int i = 0; i < STUDENT_COUNT; i++) {
            Student st = students[i];
            System.out.print(st.name + " ");
            System.out.print(st.height + " ");
            System.out.printf("%.1f\n", st.weight);
        }
    }
}