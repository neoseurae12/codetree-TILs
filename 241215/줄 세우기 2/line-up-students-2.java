import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height, weight, number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if (height < student.height)
            return -1;
        else if (height > student.height)
            return 1;
        
        if (weight > student.weight)
            return -1;
        else if (weight < student.weight)
            return 1;
        
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Student[] students = new Student[n+1];
        for (int i = 1; i <=n ; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int num = i;

            students[i] = new Student(h, w, num);
        }

        // 계산
        Arrays.sort(students, 1, n + 1);

        // 출력
        for (int i = 1; i <= n; i++) {
            Student student = students[i];
            System.out.println(student.height + " " + student.weight + " " + student.number);
        }
    }
}