import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.lang.StringBuilder;

class Person {
    String name;
    int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people, (a, b) -> a.height - b.height);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Person p = people[i];
            sb.append(p.name + " " + p.height + " " + p.weight + "\n");
        }
        System.out.println(sb);
    }
}