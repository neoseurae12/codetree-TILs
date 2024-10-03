import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student st) {
        int thisSum = this.korean + this.english + this.math;
        int stSum = st.korean + st.english + st.math;
        return thisSum - stSum;
    }
}

public class Main {

    public static int n;
    public static Student[] students;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            Student st = students[i];
            System.out.print(st.name + " ");
            System.out.print(st.korean + " ");
            System.out.print(st.english + " ");
            System.out.println(st.math);
        }
    }
}