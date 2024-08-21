import java.util.Scanner;

class User {
    String id;
    int level;

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }

    public User() {
        this("", 0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User u1 = new User("codetree", 10);
        
        User u2 = new User();
        u2.id = sc.next();
        u2.level = sc.nextInt();

        System.out.printf("user %s lv %d\n", u1.id, u1.level);
        System.out.printf("user %s lv %d\n", u2.id, u2.level);
    }
}