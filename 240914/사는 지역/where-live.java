import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person> {
    String name;
    String addr;
    String city;

    public Person(String name, String addr, String city) {
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            persons[i] = new Person(name, addr, city);
        }

        Arrays.sort(persons);

        Person lastPerson = persons[n-1];
        System.out.println("name " + lastPerson.name);
        System.out.println("addr " + lastPerson.addr);
        System.out.println("city " + lastPerson.city);
    }
}