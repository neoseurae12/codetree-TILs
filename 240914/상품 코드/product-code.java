import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Product {
    String name;
    String code;

    public Product(String productName, String productCode) {
        this.name = productName;
        this.code = productCode;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String product2Name = st.nextToken();
        String product2Code = st.nextToken();
        
        Product product1 = new Product("codetree", "50");
        Product product2 = new Product(product2Name, product2Code);

        System.out.printf("product %s is %s\n", product1.code, product1.name);
        System.out.printf("product %s is %s\n", product2.code, product2.name);
    }
}