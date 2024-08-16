import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        String[] strArr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(String.join(" ", strArr));

        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, Collections.reverseOrder());
        strArr = Arrays.stream(boxedArr).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println(String.join(" ", strArr));
    }
}