import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h, w;
    int num;

    public Student(int height, int weight, int num) {
        h = height;
        w = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student st) {
        if (h == st.h)
            return st.w - w;

        return h - st.h;
    }
}

public class Main {

    public static int N;
    public static Student[] students;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        students = new Student[N];
        for (int i = 0; i < N; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int num = i + 1;

            students[i] = new Student(h, w, num);
        }

        Arrays.sort(students);

        for (int i = 0; i < N; i++) {
            Student st = students[i];
            System.out.print(st.h + " ");
            System.out.print(st.w + " ");
            System.out.println(st.num);
        }
    }
}