import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h, w;
    int number;

    public Student(int h, int w, int number) {
        this.h = h;
        this.w = w;
        this.number = number;
    }

    @Override
    public int compareTo(Student st) {
        if (this.h == st.h && this.w == st.w)
            return this.number - st.number;
        else if (this.h == st.h)
            return st.w - this.w;
        
        return st.h - this.h;
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
            int number = i + 1;

            students[i] = new Student(h, w, number);
        }

        Arrays.sort(students);

        for (int i = 0; i < N; i++) {
            Student st = students[i];

            System.out.println(st.h + " " + st.w + " " + st.number);
        }
    }
}