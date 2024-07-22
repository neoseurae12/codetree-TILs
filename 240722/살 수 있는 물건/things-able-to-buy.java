import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookPrice = 3000;
        int maskPrice = 1000;

        int n = sc.nextInt();

        String affordableProduct;

        if (n >= 3000) {
            affordableProduct = "book";
        } else if (n >= 1000) {
            affordableProduct = "mask";
        } else {
            affordableProduct = "no";
        }

        System.out.println(affordableProduct);
    }
}