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
        if (this.korean != st.korean)
            return st.korean - this.korean;
        else if (this.english != st.english)
            return st.english - this.english;
        else
            return st.math - this.math;
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
            System.out.println(st.name + " " + st.korean + " " + st.english + " " + st.math);
        }
    }
}