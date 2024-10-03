import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int height, weight;

    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student st) {
        if (this.height == st.height)
            return st.weight - this.weight;

        return this.height - st.height;
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
            int height = sc.nextInt();
            int weight = sc.nextInt();

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            Student st = students[i];

            System.out.print(st.name + " ");
            System.out.print(st.height + " ");
            System.out.println(st.weight);
        }
    }
}